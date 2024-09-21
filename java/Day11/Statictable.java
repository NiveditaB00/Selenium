package Day11;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Statictable {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		
		//1. find the total number of rows in a table 
		int rows=driver.findElements(By.xpath("//table[@name='BookTable']//tr")).size();
		//can use tag name
		//int rows = driver.findElements(By.tagName("tr")).size();//Single table in web page
		System.out.println("Number of rows"+rows);
		
		//2. Find the total number of columns in table
		int col=driver.findElements(By.xpath("//table[@name='BookTable']//tr[1]//th")).size();
		//int rows = driver.findElements(By.tagName("th")).size();
		System.out.println("Number of columns"+col);
		
		//3.read the specific row and column(ex:5th row 1st colo)
		String bookname=driver.findElement(By.xpath("//table[@name='BookTable']//tr[5]//td[1]")).getText();
		System.out.println(bookname);
		
		//4. Read data all the  rows and column
		
		//System.out.println("BookName"+"\t"+"Author"+"\t"+"Subject"+"\t"+"Price");
		/*
		for(int r=2;r<=rows;r++)
		{
			for(int c=1;c<=col;c++)
			{
				//we can not pass the variables inside the xpath so we have to add "+ +"
				String value=driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]//td["+c+"]")).getText();
				System.out.print(value+"\t");
			}
			System.out.println();
		}
		*/
		
		
		//5.Print book name whose author is mukesh
		/*
		for(int r=2;r<rows;r++)
		{
			//get the author name
			String authorName=driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]//td[2]")).getText();
			if(authorName.equals("Mukesh"))
			{
				//get the book name and print
				String Bookname= driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]//td[1]")).getText();
				System.out.println(Bookname+"\t"+authorName);
			}
		}
		*/
		
		//6Find the total price of the books
		int total = 0;
		
		for(int r=2;r<rows;r++)
		{
			//get the author name
			String Price=driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]//td[4]")).getText();
			//System.out.println(Price);
			total=total+Integer.parseInt(Price);
			
		}
		System.out.println("Total Price of the books "+total);

	}

}
