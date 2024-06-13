package Day7;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigationDemo {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		//driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		//driver.get("https://demo.nopcommerce.com/");

		driver.navigate().to("https://demo.nopcommerce.com/");
		//driver.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.navigate().to("https://demo.opencart.com/");
		
		//Back
		driver.navigate().back();
		System.out.println(driver.getCurrentUrl());
		
		//forword
		driver.navigate().forward();
		System.out.println(driver.getCurrentUrl());
	
	}

}
