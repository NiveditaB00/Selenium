package Day8;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handlecheckbox {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		
		//1. select specified checkbox
		//driver.findElement(By.xpath("//input[@id='sunday']")).click();
		
		
		//Through the loop we can select the multiple check box
		//2. Select all the checkboxes
		List<WebElement> checkboxes=driver.findElements(By.xpath("//input[@class='form-check-input' and @ type=\"checkbox\"]"));
		
		/*
		for(int i=0;i<checkboxes.size();i++)
		{
			checkboxes.get(i).click();
		}*/
		
		//Enhanced for loop
		/*
		for(WebElement checkbox:checkboxes)
		{
			checkbox.click();
		}*/
		
		
		//3.Select last 3 checkboxes last 3
		//total no of checkboxes-how many checkboxes want to select = starting index
		//7-3=4(starting index)
		/*
		for(int i=4;i<checkboxes.size();i++)
		{
			checkboxes.get(i).click();
		}*/
		
		//Select last 3 checkboxes first 3
		/*
		for(int i=0;i<3;i++)
		{
			checkboxes.get(i).click();
		}
		*/
		
		//Unselect checkboxes if they are selected
		for(int i=0;i<3;i++)
		{
			checkboxes.get(i).click();
		}
		
		Thread.sleep(5000);
		
		for(int i=0;i<checkboxes.size();i++)
		{
			//checkboxes.get(i).click();//unselects the checkbox but  it select the unseelcted the checkbox
			if(checkboxes.get(i).isSelected())
			{
			checkboxes.get(i).click();
			}
		}
		
		
		
		
	}

}
