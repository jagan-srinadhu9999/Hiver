package com.w2j.in.com.HiverProject.in;

import java.awt.AWTException;
import java.io.File;
import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Demo {
	public static void main(String[] args) throws AWTException, InterruptedException {
		ChromeOptions opt = new ChromeOptions();
		opt.addExtensions(new File("./Extensions/Hiver.crx"));
		WebDriver driver = new ChromeDriver(opt);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		driver.get("https://www.google.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
		driver.manage().window().maximize();
		
		String parentWindow=	driver.getWindowHandle();
		Set<String> Windows=    driver.getWindowHandles();
		Iterator<String> itr=	Windows.iterator();
		while(itr.hasNext())
		{
		String childWindow= 	itr.next();
		
		if(!parentWindow.equals(childWindow))
		{
		
			driver.switchTo().window(childWindow);
		
		}
		
		}
	    
		
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[contains(text(),'OK, got it')]")));
		driver.findElement(By.xpath("//*[contains(text(),'OK, got it')]")).click();
        Thread.sleep(2000);
		driver.findElement(By.xpath("//*[contains(text(),'Sign in')]")).click();
		driver.findElement(By.xpath("//*[@name='identifier']")).sendKeys("sansaty234@gmail.com");
		driver.findElement(By.xpath("//*[@class='Z6Ep7d'] //*[contains(text(),'Next')]")).click();

	}
}
