import java.util.*;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class VideoCount 
{
	
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "D:/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		Actions as = new Actions(driver);
		driver.get("https://www.youtube.com/");
		driver.manage().window().maximize();
		List<WebElement> ls = driver.findElementsByTagName("a");
		System.out.println("No. of link in first page " + ls.size());
		WebElement atif = driver.findElementByPartialLinkText("Atif Aslam: Tera Hua Video | Loveratri | Aayush Sharma | Warina Hussain | Tanishk Bagchi Manoj M");
	    WebElement dilbar = driver.findElementByPartialLinkText("DILBAR Lyrical | Satyameva Jayate |John Abraham, Nora Fatehi,Tanishk B, Neha Kakkar,Dhvani, Ikka");
		as.keyDown(Keys.CONTROL).click(atif).keyUp(Keys.CONTROL).build().perform();
	    as.keyDown(Keys.CONTROL).click(dilbar).keyUp(Keys.CONTROL).build().perform();
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
		String ns = driver.getCurrentUrl();
		System.out.println("You are know " +ns);
	
	}

}
