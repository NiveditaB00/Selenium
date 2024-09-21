package Day12;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DatepickerDemo_1_1 {
	//When we have multiple datepicker in the page
	static void selectMonthAndYear(WebDriver driver, String month, String year) throws InterruptedException
	{
		//Select month and year
		while(true)
		{
			String Currentmonth=driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();//actual month
			String Currentyear=driver.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText();//actual year
			
			
			if(Currentmonth.equals(month) && Currentyear.equals(year))
			{
				//System.out.println(Currentmonth);
				//System.out.println(Currentyear);
				break;
			}
			//driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-e']")).click();//next month
			//Thread.sleep(500);
			 
			driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-w']")).click();//Previous
			Thread.sleep(500);
		}
	}
	
	static void selectDate(WebDriver driver, String date)
	{
		//Select the date
	       List<WebElement> allDates = driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//tbody//tr//td"));
	        for (WebElement dt : allDates) 
	        {
	            if (dt.getText().equals(date))
	            {
	                System.out.println("Clicking on date: " + dt.getText());
	                dt.click();
	                break;
	            }
	        }
	}

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://jqueryui.com/datepicker");
		driver.manage().window().maximize();
		
		//switch to frame
		driver.switchTo().frame(0);
		
		//Method1 : using sendkeys()
		//driver.findElement(By.xpath("//input[@id='datepicker']")).sendKeys("05/03/2024");//mm//dd//yyyy
				
				
		//Method2 : using date picker
		//Expected data
		String year="2023";
		String month="May";
		String date="5";
				
		driver.findElement(By.xpath("//input[@id='datepicker']")).click();//open date picker
				
		selectMonthAndYear(driver,month,year);
		selectDate( driver,date);

	}

}
