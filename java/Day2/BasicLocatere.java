package Day2;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class BasicLocatere {

	public static void main(String[] args) {
	WebDriver driver = new ChromeDriver();
	
	//Open the site 
	//xdriver.get("https://demo.opencart.com/");
	driver.get("https://demo.nopcommerce.com/");
	//To maximize the window
	driver.manage().window().maximize();
	
	//name
	//driver.findElement(By.name("q")).sendKeys("Mac");
	
	//id (on this page i am not getting the same as sir mentioned)

	//linktext/partiallinktext
	//driver.findElement(By.linkText("Books")).click();
	//driver.findElement(By.partialLinkText("Book")).click();
	// here partiallinktext will not work bcz Book have 16 matches are there 
	
	//Class name 
	//List<WebElement> classlinks= driver.findElements(By.className("list"));
	//System.out.println("total number of classlinks: "+classlinks.size());
	
	//Tag
	List<WebElement> list = driver.findElements(By.tagName("a"));
	System.out.println("total number of list : "+list.size());

	List<WebElement> Images = driver.findElements(By.tagName("img"));
	System.out.println("total number of Image : "+Images.size());
	}

}
