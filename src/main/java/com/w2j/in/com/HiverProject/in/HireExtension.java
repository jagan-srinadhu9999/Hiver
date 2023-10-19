package com.w2j.in.com.HiverProject.in;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HireExtension {
	public static void main(String[] args) throws InterruptedException, AWTException {
		String name = "Hiver";
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--enable-extensions");
		WebDriver driver = new ChromeDriver(options);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
		driver.get("https://chrome.google.com/webstore");
		driver.manage().window().maximize();

		WebElement input = driver.findElement(By.xpath("//input[@id='searchbox-input']"));
		input.sendKeys(name + Keys.ENTER);

		driver.findElement(
				By.xpath("//main[@class='F-x'] //*[contains(text(),'Hiver - Gmail-based customer service solution')]"))
				.click();
WebElement ele=		wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("//*[@class='e-f-o'] //*[contains(text(),'Add to Chrome')]")));
		ele.click();
		
		Thread.sleep(2000);
		/*
		 * Alert alert= wait.until(ExpectedConditions.alertIsPresent());
		 * System.out.println(alert.getText());
		 */
		
		Robot robot;
		
			robot = new Robot();
			robot.keyPress(KeyEvent.VK_TAB);
			robot.keyRelease(KeyEvent.VK_TAB);
			Thread.sleep(5000);
			robot.keyPress(KeyEvent.VK_ENTER);
			Thread.sleep(3000);
			robot.keyRelease(KeyEvent.VK_ENTER);
			
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
			driver.findElement(By.xpath("//*[@class='header__aside'] //*[contains(text(),'Create an account')]")).click();
			driver.findElement(By.name("firstName")).sendKeys("jagan");
			driver.findElement(By.name("lastName")).sendKeys("srinadhu");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//*[@class='zQJV3'] //*[contains(text(),'Next')]")).click();
			Thread.sleep(4000);
			
 driver.findElement(By.xpath("//*[@class='Vq7W7e'] //*[@aria-label='Day']")).sendKeys("26");
	WebElement dropdown=		driver.findElement(By.id("month"));
			Select select=new Select(dropdown);

			List<WebElement> lst=   select.getOptions();
		      for(WebElement opt : lst) {

		          if (opt.getText().equalsIgnoreCase("july"))
		          {
		              System.out.println(opt.getText());
		              opt.click();
		          }
		      }
		      driver.findElement(By.xpath("//*[@class='Vq7W7e'] //*[@aria-label='Year']")).sendKeys("1995");     
		      wait.until(ExpectedConditions.elementToBeClickable(By.id("gender")));
		      WebElement dropdown1=		driver.findElement(By.id("gender"));
				Select select1=new Select(dropdown1);
				List<WebElement>	lst1=	select1.getOptions();
				for(WebElement opt1:lst1)
				{
					if(opt1.getText().equalsIgnoreCase("male"))
					{
						System.out.println(opt1.getText());
						opt1.click();
					}
				}
				driver.findElement(By.xpath("//*[@class='zQJV3'] //*[contains(text(),'Next')]")).click();
				Thread.sleep(2000);
			
			
			  driver.findElement(By.xpath("//*[contains(text(),'Sign in')]")).click();
			  driver.findElement(By.xpath("//*[@name='identifier']")).sendKeys(
			  "sansaty234@gmail.com"); driver.findElement(By.
			  xpath("//*[@class='Z6Ep7d'] //*[contains(text(),'Next')]")).click();
			 
		
			
			
	}
}
