package Day9;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handleframes {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://ui.vision/demo/webtest.frames/");
		driver.manage().window().maximize();
		
		//driver.findElement(By.xpath("//input[@name='mytext1']")).sendKeys("Welcome");//This is gives element not found so
		//we need to enter the frame
		
		//frame1
		WebElement frame1=driver.findElement(By.xpath("//frame[@src='frame_1.html']"));
		driver.switchTo().frame(frame1);// Passed frame as webelement 
		driver.findElement(By.xpath("//input[@name='mytext1']")).sendKeys("Welcome");
		
		driver.switchTo().defaultContent();//go back to page
		
		
		//frame2
		//driver.findElement(By.xpath("//input[@name='mytext2']")).sendKeys("Welcome");// No such element 
		//1.it is in frame 1 and 1.it is not switched in frame 2  
		
		WebElement frame2=driver.findElement(By.xpath("//frame[@src='frame_2.html']"));
		driver.switchTo().frame(frame2);
		
		driver.findElement(By.xpath("//input[@name='mytext2']")).sendKeys("Selenium");
		
		driver.switchTo().defaultContent();//go back to page
		
		//Frame3
		//inner iframe
		WebElement frame3=driver.findElement(By.xpath("//frame[@src='frame_3.html']"));
		driver.switchTo().frame(frame3);

		driver.findElement(By.xpath("//input[@name='mytext2']")).sendKeys("Java");
		
		//inner iframe part of prame 3
		driver.switchTo().frame(0);
		
		//driver.findElement(By.xpath("//div[@id='i8']//div[@class='AB7Lab Id5V1']")).click();
		
		WebElement rdbutton=driver.findElement(By.xpath("//div[@id='i8']//div[@class='AB7Lab Id5V1']"));
		JavascriptExecutor js= (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();", rdbutton);
		
		
		driver.switchTo().defaultContent();//go back to page
		 
		

	}

}
