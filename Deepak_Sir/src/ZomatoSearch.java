import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class ZomatoSearch
{
	ChromeDriver driver;
    @Before
    public void openBrowser()
    {
    	System.setProperty("webdriver.chrome.driver", "D:/chromedriver.exe");
    	driver = new ChromeDriver();
    	driver.get("https://www.zomato.com/india");
    	driver.manage().window().maximize();
    }
	@Test
	public void test() 
	{
		System.out.println("test");
		WebElement wb = driver.findElement(By.linkText("Delhi NCR Restaurants"));
		wb.click();
		WebElement wb1 = driver.findElement(By.id("keywords_input"));
		wb1.click();
		WebElement wb2 = driver.findElement(By.id("keywords_input"));
		wb2.sendKeys("Karim");
		WebElement wb3 = driver.findElement(By.id("search_button"));
		wb3.click();
		WebElement wb4 = driver.findElement(By.linkText("Karim's"));
		wb4.click();
		
		
		}
	@After
	public void close()
	{
		driver.close();
	}

}
