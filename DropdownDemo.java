package Test1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropdownDemo {

	public static void main(String[] args) throws Exception 
	{
		
		System.setProperty("webdriver.chrome.driver", "C:\\New folder\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		driver.manage().window().maximize();
		
		Thread.sleep(3000); // it is not recommended
		
		driver.findElement(By.xpath("//a[@data-testid=\'open-registration-form-button\']")).click();
		
		Thread.sleep(3000);
		
		//Approach 1 -- It is not recommended,but we can use this
		/*
		List<WebElement> birthmonth=driver.findElements(By.xpath("//select[@id='month']/option"));
		
		birthmonth.size();
		
		System.out.println("Size of dropdown :" +birthmonth.size());
		
		birthmonth.get(5).click(); // June
        
		//Approach 2 
		
		WebElement birthmonth1=driver.findElement(By.xpath("//select[@id='month']"));
		
		Select month=new Select(birthmonth1); // parameterized constructor
		
		//month.selectByIndex(2);
		
		//month.selectByValue("5");
		
		month.selectByVisibleText("Aug");
		
		*/
		
		//Approach 3 -- Using for loop.
		
		WebElement birthmonth1=driver.findElement(By.xpath("//select[@id='month']"));
		
		Select month=new Select(birthmonth1);
				
		List<WebElement> dr=month.getOptions();
		
		dr.size();
		
		System.out.println(dr.size());
		
		for(int i=0;i<dr.size();i++)
		{
			String drvalues=dr.get(i).getText();
			
			if(drvalues.equalsIgnoreCase("aug"))
			{
				dr.get(i).click();
			}
		}
		
	}

}
