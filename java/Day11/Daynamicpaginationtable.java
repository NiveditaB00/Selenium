package Day11;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Daynamicpaginationtable {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://demo.opencart.com/admin/index.php");
		driver.manage().window().maximize();
		//find total number pages
		//keep clicking on next page until we reach last page
		//After clicking on the page read all the data 
		
		WebElement username = driver.findElement(By.xpath("//input[@id='input-username']"));
		username.clear();
		username.sendKeys("demo");
		
		WebElement password = driver.findElement(By.xpath("//input[@id='input-password']"));
		password.clear();
		password.sendKeys("demo");
		
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		//for informative window it may appear or not
		if(driver.findElement(By.xpath("//button[@class='btn-close']")).isDisplayed())
		{
		driver.findElement(By.xpath("//button[@class='btn-close']")).click();
		}
		
		driver.findElement(By.xpath("//a[@class='parent']")).click();//customers main menu
		driver.findElement(By.xpath("//ul[@id='collapse-5']//a[contains(text(),'Customers')]")).click();
		
		//Showing 1 to 10 of 19081(1909 pages)
		 String text = driver.findElement(By.xpath("//div[contains(text(),'Pages')]")).getText();
		 int total_pages = Integer.parseInt(text.substring(text.indexOf("(")+1, text.indexOf("Pages")-1));

		 //repeating pages
		 for(int p=1;p<=total_pages;p++)
		 {
			 if(p>1)
			 {
				 WebElement active_page=driver.findElement(By.xpath("//ul[@class='pagination']//*[text()="+p+"]"));
				 active_page.click();
				 Thread.sleep(3000);
			 }
			 //reading the page
			 int noofrows= driver.findElements(By.xpath("//table[@class='table table-bordered table-hover']//tbody//tr")).size();
			 for(int r=1;r<=noofrows;r++)
			 {
				String customerName = driver.findElement(By.xpath("//table[@class='table table-bordered table-hover']//tbody//tr["+r+"]/td[2]")).getText();
				String Email = driver.findElement(By.xpath("//table[@class='table table-bordered table-hover']//tbody//tr["+r+"]/td[2]")).getText();
				String Status = driver.findElement(By.xpath("//table[@class='table table-bordered table-hover']//tbody//tr["+r+"]/td[5]")).getText();
				
				System.out.println(customerName+"\t"+Email+"\t"+Status);
			 }
		 }

		
	}

}
