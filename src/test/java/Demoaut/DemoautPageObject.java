package Demoaut;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class DemoautPageObject {
	
	@Test
	public static void launchURL()
	 {
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\DURGLT\\Downloads\\chromedriver_win32_109\\chromedriver.exe");  
	        WebDriver driver=new ChromeDriver();
	        driver.manage().window().maximize(); 
		 driver.navigate().to("http://ww12.demoaut.com/"); 
	 }
	
	@Test
	public static void DemoAccount()
	{       
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DURGLT\\Downloads\\chromedriver_win32_109\\chromedriver.exe");  
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize(); 
        driver.navigate().to("http://ww12.demoaut.com/");  
		 
		 List<WebElement> f = driver.findElements(By.tagName("iframe"));
	     System.out.println("Total number " + f.size());
	     driver.switchTo().frame("master-1");
	     System.out.println("success");
	     driver.findElement(By.linkText("Demo Account")).click();
	       
	}
	
	@Test
	 public static void VisitWebsite()
	 {  
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\DURGLT\\Downloads\\chromedriver_win32_109\\chromedriver.exe");  
	     WebDriver driver=new ChromeDriver();
	     driver.manage().window().maximize(); 
		 driver.navigate().to("http://ww12.demoaut.com/");
		 List<WebElement> f = driver.findElements(By.tagName("iframe"));
	     System.out.println("Total number " + f.size());
	     driver.switchTo().frame("master-1");
	     System.out.println("success");
	     driver.findElement(By.linkText("Demo Account")).click();
	     
	     driver.switchTo().frame("master-1");
	     driver.findElement(By.linkText("➤ Visit Website")).click();
	 }
	 
	@Test
	 public static void StartTrading() {
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\DURGLT\\Downloads\\chromedriver_win32_109\\chromedriver.exe");  
	     WebDriver driver=new ChromeDriver();
	     driver.manage().window().maximize(); 
		 driver.navigate().to("http://ww12.demoaut.com/");
		 List<WebElement> f = driver.findElements(By.tagName("iframe"));
	     System.out.println("Total number " + f.size());
	     driver.switchTo().frame("master-1");
	     System.out.println("success");
	     driver.findElement(By.linkText("Demo Account")).click();
	     
	     driver.switchTo().frame("master-1");
	     driver.findElement(By.linkText("➤ Visit Website")).click();
	       String winHandleBefore = driver.getWindowHandle();
	       for(String winHandle : driver.getWindowHandles()){
	            driver.switchTo().window(winHandle);
	        }
	       driver.findElement(By.name("FirstName")).sendKeys("Durga");
	       driver.findElement(By.name("LastName")).sendKeys("Kalaimathi");
	       driver.findElement(By.name("Email")).sendKeys("durga@gmail.com");
	       driver.findElement(By.name("MobilePhone")).sendKeys("9566110824");
	       driver.findElement(By.linkText("START TRADING NOW!")).click();
	 }
	       
	       
	       

}
