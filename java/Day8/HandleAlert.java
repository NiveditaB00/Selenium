package Day8;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleAlert {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		driver.manage().window().maximize();

		//1.Normal ok button
		/*
		driver.findElement(By.xpath("//button[normalize-space()='Click for JS Alert']")).click();
		
		Thread.sleep(5000);
		//driver.switchTo().alert().accept();
		
		Alert myalert=driver.switchTo().alert();
		System.out.println(myalert.getText());// get the alert text
		myalert.accept();		
		*/
		
		//2. Confirmation alert
		/*
		driver.findElement(By.xpath("//button[normalize-space()='Click for JS Confirm']")).click();
		Thread.sleep(5000);
		
		driver.switchTo().alert().accept();//close the alert by ok
		//driver.switchTo().alert().dismiss();//Close the aler by dismiss
		*/
		
		//3.Prompt alert
		driver.findElement(By.xpath("//button[normalize-space()='Click for JS Prompt']")).click();
		Thread.sleep(5000);
		
		Alert myalert=driver.switchTo().alert();
		myalert.sendKeys("welcome");//here we not able to see the value in the input box
		myalert.accept();
		

	}

}
