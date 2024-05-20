package Test1;

import java.awt.Window;

import org.openqa.selenium.JavascriptExecutor;

import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollUp_ScrollDownDemo {

	public static void main(String[] args) throws Exception 
	
	{
		System.setProperty("webdriver.chrome.driver", "C:\\New folder\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		
		ChromeDriver driver=new ChromeDriver();
		
		//WebDriver driver=new ChromeDriver(); // type casting
		
		driver.get("https://www.facebook.com/");
		
		driver.manage().window().maximize();
		
		JavascriptExecutor  jre=(JavascriptExecutor) driver; // type casting

		jre.executeScript("document.getElementById('email').value='Rajugutte@gmail.com'");
		
		jre.executeScript("document.getElementById('pass').value='12345'");
		
		Thread.sleep(3000);
		
		jre.executeScript("window.scrollBy(0,200)");
		
		Thread.sleep(3000);
		
		jre.executeScript("window.scrollBy(0,-200)");
		
		
		
		
	}

}
