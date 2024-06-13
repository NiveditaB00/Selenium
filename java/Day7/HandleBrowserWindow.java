package Day7;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class HandleBrowserWindow {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//a[normalize-space()='OrangeHRM, Inc']")).click();
		
		Set<String> WindowIDs=driver.getWindowHandles();
		
		//Approach1 
		//we converted this because of Set collection don't have get method
		List<String> windowlist= new ArrayList(WindowIDs);
		
		/*
		String Parintid=windowlist.get(0);
		String Childid=windowlist.get(1);
		
		driver.switchTo().window(Childid);
		System.out.println(driver.getTitle());
		 
		driver.switchTo().window(Parintid);
		System.out.println(driver.getTitle());
		*/
		
		//Approach2
		for(String wid:WindowIDs)
		{
			String title = driver.switchTo().window(wid).getTitle();
			
			if(title.equals("OrangeHRM"))
			{
				System.out.println(driver.getCurrentUrl());
			}
			else 
			{
				System.out.println(driver.getCurrentUrl());
			}
		}

	}

}
