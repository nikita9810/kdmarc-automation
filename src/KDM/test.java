package KDM;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class test {
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\kratikal\\Documents\\Selenium\\chromedriver_win32\\chromedriver.exe");

		ChromeDriver driver =new ChromeDriver();
	    driver.manage()).timeouts().implicitlyWait(15,TimeUnit.SECONDS);
		driver.get("https://sprint.kdmarc.com/");
		driver.manage().window().maximize();

		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@id='email']")).click();
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("archit.jain@kratikal.com");
		driver.findElement(By.xpath("//button[@onclick='step2()']")).click();
		driver.findElement(By.xpath("//input[@id='password']")).click();
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Qwerty@12");
		driver.findElement(By.xpath("//button[@type='button']")).click();

		driver.findElement(By.xpath("//a[@href='/reported']")).click();
		List<WebElement> Reported = (List<WebElement>) driver.findElement(By.xpath("//div[@class='nano']"));
		for(int i=0;i<Reported.size();i++) {
			Reported.get(i).click();
		((WebElement) driver.findElement(By.xpath("//div[contains(@onclick,'selectAction(`delete`,13,`pavan@kratikal.com`)')]//i[@class='mdi mdi-delete mx-auto']"))).click();	
		
		
		
		Thread.sleep(1000);
		
	}
}	
}
