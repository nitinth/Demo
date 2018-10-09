package practise;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class zomato 
{
	ChromeDriver driver;
	@BeforeMethod()
	public void set_Up()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\nitin\\Downloads\\chromedriver.exe");
		driver = new ChromeDriver();
	driver.get("https://www.zomato.com/ncr");
		//driver.get("http://demo.guru99.com/test/delete_customer.php");
		driver.manage().window().maximize();
	}
	@Test
	public void switch_test()
	{
		driver.findElementByXPath(".//*[@id='signup-link']").click();
		
//		String st1="Sign up or log in to Zomato";
//		WebElement st1 = driver.findElementByXPath("//*[@id='modal-container']/div[1]");
//		String st2=st1.getText();
		
	}
	@Test(enabled = false)
	public void alert_test() throws Exception
	{
		driver.findElementByXPath(".//*[@type='text']").sendKeys("nitin");
		driver.findElementByName("submit").click();
		Alert at = driver.switchTo().alert();
		 Thread.sleep(5000);
		String st3 = driver.switchTo().alert().getText();
		System.out.println(st3);
		at.accept();
		at = driver.switchTo().alert();
		String st4 = driver.switchTo().alert().getText();
		System.out.println(st4);
		at.accept();
	}
	@Test(enabled = false)
	public void scroll_test()
	{
		driver.findElementByXPath(".//*[@class='ui fluid green fluid button go-location homepage']").click();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebElement india = driver.findElementByXPath(".//*[@id='footer']/div/div[5]/div[3]/ul[1]/li/a");
		String s =driver.getCurrentUrl();
		System.out.println(s);
		js.executeScript("arguments[0].scrollIntoView();",india);
		driver.findElementByXPath(".//*[@id='footer']/div/div[5]/div[3]/ul[1]/li/a").click();
	}
	@Test(enabled = false)
	public void Action_test()
	{
		driver.findElementByXPath(".//*[@class='ui fluid green fluid button go-location homepage']").click();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		Actions as = new Actions(driver);
		js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
		List<WebElement> ls = driver.findElementsByClassName("pl5");
		int Count = ls.size();
		System.out.println(Count);
		for(WebElement wb:ls)
		{
			String co = wb.getText();
			if(co.equals("Italy") || co.equals("Brasil"))
			{
			as.keyDown(Keys.CONTROL).click(wb).keyUp(Keys.CONTROL).build().perform();
			}
		}	 
		Set<String> st = driver.getWindowHandles();
		System.out.println("No. of tab are " +st.size());
		int i =0;
		for(String s1:st)
		{
			i=i+1;
			if(i==2)
			{
				driver.switchTo().window(s1);
				break;
			}
			
		}
		String s123 =driver.getCurrentUrl();
		System.out.println(s123);

		
	}
	
	
}
