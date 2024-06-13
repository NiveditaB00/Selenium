package Day1;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.*;

/*
 *Lunch chrome
 *Open URL https://demo.opencart.com/
 *Validate title should be
 *Close browser
 * */

public class TestCase {

	public static void main(String[] args) {
		//Lunch chrome
		//ChromeDriver driver =new ChromeDriver();
		WebDriver driver = new ChromeDriver();
		
		//Open URL https://demo.opencart.com/
		//driver.get("https://demo.opencart.com/");
		driver.get("https://demo.nopcommerce.com/");
		
		
		//Validate title should be
		String act_title = driver.getTitle();
		if(act_title.equals("nopCommerce demo store"))
		{
			System.out.println("Test passed");
			
		}
		else
		{
			System.out.println("Test Failed");
		}
		
		
		//Close browser
		//driver.close();
		//driver.quit();
		
		
	}

}
