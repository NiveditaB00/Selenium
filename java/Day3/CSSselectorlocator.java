package Day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSSselectorlocator {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		
		//Open the site 
		driver.get("https://demo.nopcommerce.com/");
		//To maximize the window
		driver.manage().window().maximize();
		
		//Tag id
		//driver.findElement(By.cssSelector("input#small-searchterms")).sendKeys("T-shirt");
		//driver.findElement(By.cssSelector("#small-searchterms")).sendKeys("T-shirt");

		//Tag Class
		//driver.findElement(By.cssSelector("input.search-box-text")).sendKeys("Shitrs");
		//driver.findElement(By.cssSelector(".search-box-text")).sendKeys("Shitrs");
		
		//Tag attribute
		//driver.findElement(By.cssSelector("input[placeholder=\"Search store\"]")).sendKeys("saree");
		//driver.findElement(By.cssSelector("input[placeholder='Search store']")).sendKeys("saree");
		
		//Tag Class attribute
		//driver.findElement(By.cssSelector("input.search-box-text[name='q']")).sendKeys("pants");
		driver.findElement(By.cssSelector(".search-box-text[name='q']")).sendKeys("pants");
		
	}

}
