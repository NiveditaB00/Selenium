package Day4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		
		//Open the site 
		//xdriver.get("https://demo.opencart.com/");
		driver.get("https://demo.nopcommerce.com/");
		//To maximize the window
		driver.manage().window().maximize();
		
		//XPath with single attribute
		//driver.findElement(By.xpath("//input[@id='small-searchterms']")).sendKeys("tshirt");
		
		//XPath with multiple attributes
		//driver.findElement(By.xpath("//input[@name='q'][@placeholder='Search store']")).sendKeys("Tshirts");

		//Xpath with 'and' or operator
		//driver.findElement(By.xpath("//input[@name='q'and @placeholder='Search store']")).sendKeys("Tshirts");
		//driver.findElement(By.xpath("//input[@name='a'or @placeholder='Search store']")).sendKeys("Tshirts");
		//driver.findElement(By.xpath("//input[@name='q'or @placeholder='Search store']")).sendKeys("Tshirts");
		
		//Xpath with inner text
		//driver.findElement(By.xpath("//*[text()='Documentation']")).click();
		//h2[text()='Welcome to our store']
		/*boolean displaystatus = driver.findElement(By.xpath("//h2[text()='Welcome to our store']")).isDisplayed();
		System.out.println(displaystatus);
		
		String value = driver.findElement(By.xpath("//h2[text()='Welcome to our store']")).getText();
		System.out.println(value);
		
		*/
		//Xpath with contains
		//driver.findElement(By.xpath("//input[contains(@placeholder,'Sea')]")).sendKeys("shirts");
		
		//Xpath with Start-with
		driver.findElement(By.xpath("//input[starts-with(@placeholder,'Sea')]")).sendKeys("shirts with long slives");
		
		
		
		
		
		
		
	}

}
