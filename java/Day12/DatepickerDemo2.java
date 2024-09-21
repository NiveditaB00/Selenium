package Day12;

import java.time.Duration;
import java.time.Month;
import java.util.HashMap;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DatepickerDemo2 {
	
	//User defined function for converting month from string ----> Month
	static Month convertMonth(String month)
	{
			HashMap<String, Month> monthMap = new HashMap<String, Month>();
			
			monthMap.put("January", Month.JANUARY);
			monthMap.put("February", Month. FEBRUARY);
			monthMap.put("March", Month.MARCH);
			monthMap.put("April", Month.APRIL);
			monthMap.put("May", Month.MAY);
			monthMap.put("June", Month.JUNE);
			monthMap.put("July", Month.JULY);
			monthMap.put("August", Month. AUGUST);
			monthMap.put("September", Month.SEPTEMBER); 
			monthMap.put("October", Month. OCTOBER);
			monthMap.put("November", Month. NOVEMBER);
			monthMap.put("December", Month. DECEMBER);

			Month vmonth = monthMap.get(month);
			if (vmonth == null)
			{
				System.out.println("Invalid Month...");
			}

				return vmonth;
				
		}

	static void selectDate(WebDriver driver, String requiredyear, String requiredmonth, String requireddate)
	{
		//Select year
				WebElement yearDropdown=driver.findElement(By.xpath("//select[@class='ui-datepicker-year']"));
				Select selectYear=new Select(yearDropdown);
				selectYear.selectByVisibleText(requiredyear);
				
				
				//Select Month
				
				while(true)
				{
					String displayMonth=driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();
					
					//convert required month & display month in to objects
					Month expectedMonth=convertMonth(requiredmonth);
					Month currentMonth=convertMonth(displayMonth);
					
					//compare
					int result=expectedMonth.compareTo(currentMonth);
					
					//0 month are equal
					//>0 future month
					//<0 past
					
					if (result<0) // past
					{
					driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-w']")).click();
					}
					else if (result>0) //future
					{ driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-e']")).click();
					}
					else
					{
					break;
					}
				
				}
				
				//Date
				List<WebElement> allDates=driver.findElements (By.xpath("//table[@class='ui-datepicker-calendar']//tbody//tr//td//a"));
				
				for (WebElement dt:allDates)
				{
					if(dt.getText().equals(requireddate))
						{
						dt.click();
						break;
						}
					
				}
				
		
	}
	
	
	

	public static void main(String[] args) {
		
		//System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
			
		//input data
		String requiredyear="2021";
		String requiredmonth="June";
		String requireddate="15";
		
		driver.switchTo().frame("frame-one796456169");
		driver.findElement(By.xpath("//span[@class='icon_calendar']")).click();
		
		selectDate( driver, requiredyear, requiredmonth, requireddate);
		
	}

}
