package Day5;

import org.openqa.selenium.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ConditionalMethods {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		
		
	//Launch the browser
		driver.get("https://demo.nopcommerce.com/register?returnUrl=%2F");
		driver.manage().window().maximize();
		

		//is display
		//WebElement logo=driver.findElement(By.xpath("//img[@alt='nopCommerce demo store']"));
		//System.out.println("Display status on logo : "+logo.isDisplayed());
		
		//Is enabled
		//boolean Staus=driver.findElement(By.xpath("//input[@id='FirstName']")).isEnabled();
		//System.out.println("Enable Statu : "+Staus);

		//is selected
		WebElement Male_rdb=driver.findElement(By.xpath("//input[@id='FirstName']"));
		WebElement Female_rdb=driver.findElement(By.xpath("//input[@id='gender-female']"));
		System.out.println("Before Selcting ...........................");
		System.out.println(Male_rdb.isSelected());
		System.out.println(Female_rdb.isSelected());	
		
		System.out.println("After Selcting Mail...........................");
		//Male_rdb.click();
		Female_rdb.click();
		System.out.println(Male_rdb.isSelected());
		System.out.println(Female_rdb.isSelected());
		
	}

}
