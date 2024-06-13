package Day5;
 
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetMethod {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		
		//Lunch browser
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		//print the page title 
	//	System.out.println(driver.getTitle());
		
		//Print the current URL
		//System.out.println(driver.getCurrentUrl());
		
		//get the page source
		//System.out.println(driver.getPageSource());

		//get window handled
		//String windowid =driver.getWindowHandle();
		//System.out.println("window id is :"+windowid);
		
		
		//get windowhandles it will store in set bcz strings ids are in strings
		//driver.findElement(By.linkText("OrangeHRM, Inc")).click();
		
		//Set<String> windows=driver.getWindowHandles();
		//System.out.println(windows);
		
		
	}

}
