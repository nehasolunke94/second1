package Test1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadiobuttonDemo {

	public static void main(String[] args) throws Exception {
		
		System.setProperty("webdriver.chrome.driver", "C:\\New folder\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		driver.manage().window().maximize();
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//a[@data-testid=\'open-registration-form-button\']")).click();
		
		Thread.sleep(3000);
		
		//Approach 1 -- It is not recommended in real time project.
		/*
		driver.findElement(By.xpath("//input[@value='2']")).click();
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//input[@value='1']")).click();
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//input[@value='-1']")).click();
		
		
		//Approach 2  -- By using List of all radio buttons 
		
		List<WebElement> radios=driver.findElements(By.xpath("//input[@type='radio']"));
		
		radios.size();
		
		System.out.println("Total no. of radio buttons are :" +radios.size() );
		
		//radios.get(0).click(); // Female
		
		//radios.get(1).click(); // Male
		
		radios.get(2).click(); // Custom
		
		//radios.get(1).isSelected(); 
		
		//System.out.println(radios.get(1).isSelected());
		
		//radios.get(1).isEnabled();
		
		//System.out.println(radios.get(1).isEnabled());
		
		radios.get(2).isDisplayed();
		
		System.out.println(radios.get(2).isDisplayed());
		
		*/
		//Approach 3 -- It is recommended in real time project
		
		
		List<WebElement> radios=driver.findElements(By.xpath("//label[@class='_58mt']"));
		
		radios.size();
		
		System.out.println("Total no. of radio buttons : " +radios.size());
		
		String ExpectedResult="Male";
		
		for(int i=0;i<radios.size();i++)
		{
			if(radios.get(i).getText().equalsIgnoreCase(ExpectedResult))
			{
				radios.get(i).click();
				
				System.out.println("Clicked on :" +ExpectedResult);
				
				break;
			}
			
		}
		
		
		
		
	}

}
