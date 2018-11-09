package hani.maven1;

import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class AppTest 
    
{
   public WebDriver driver;
   @Test
   public void guru99tutorials() throws InterruptedException{
	   System.setProperty("webdriver.chrome.driver","C:\\Users\\KadriHa\\eclipse-workspace\\maven1\\driver\\chromedriver.exe");
	   driver = new ChromeDriver();
	   String eTitle= "Meet Guru99";
	   String aTitle="";
	   
	   driver.get("http://guru99.com/");
	   
	   driver.manage().window().maximize();
	   
	   aTitle = driver.getTitle();
	   
	   if(aTitle.contentEquals(eTitle)) {
		   System.out.println("Test Passed");
	   }
	   else
	   {
		   System.out.println("Tet Failed");
	   }
	   driver.close();
	   
   }
}
