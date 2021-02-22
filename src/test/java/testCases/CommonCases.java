package testCases;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;

public class CommonCases {

	public WebDriver driver;
	
	@Test(enabled = false)
	public void allInOne() throws InterruptedException
	{
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(250, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(250,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.ixigo.com/");
		
		driver.findElement(By.xpath("//div[text()=\"From\"]//following::input[@placeholder=\"Enter city or airport\"][2]")).sendKeys("AMD");
		
		Thread.sleep(700);
     	driver.findElement(By.xpath("//div[text()=\"From\"]//following::input[@placeholder=\"Enter city or airport\"][2]")).sendKeys(Keys.ENTER);
		
		driver.findElement(By.xpath("//td[@data-date='16032021']")).click();
		
		driver.findElement(By.xpath("//div[text()='Return']//following::input[1]")).click();
		
		driver.findElement(By.xpath("//div[text()='Return']//following::td[@data-date='25042021'][2]")).click();
		
		driver.findElement(By.cssSelector("#content > div > div.banner > div.form-cntr.flight > div > div > div.search.u-ib.u-v-align-bottom > button > div")).click();
		
		Thread.sleep(1600);
		
		driver.findElement(By.xpath("//div[text()='Stops']//following::div[@data-checkboxindex='1'][1]//child::span[@class='ixi-icon-tick check-icon']")).click();
		
        List<WebElement> time = driver.findElements(By.xpath("//div[@class='time']"));
        
        int i=1;
		
		for(WebElement tm:time)
		{
			
			
			if(i%2!=0)
			{
				System.out.print("Departure Time : ");
				System.out.println(tm.getText());
			}
			else if(i%2==0)
			{
				System.out.print("Arrival time : ");
				System.out.println(tm.getText());
			}
			
			i++;
		}
		
		List<WebElement> drtn = driver.findElements(By.xpath("//div[@class='duration']"));
		
		for(WebElement dt:drtn)
		{	
				System.out.print("Total Duration: ");
				System.out.println(dt.getText());
		}
		
        List<WebElement> prcgrp = driver.findElements(By.xpath("//div[@class='price-group']"));
		
		for(WebElement prc:prcgrp)
		{	
				System.out.print("Total Price: ");
				System.out.println(prc.getText());
		}
		
        List<WebElement> airline = driver.findElements(By.xpath("//div[@class='airline-text']"));
		
		for(WebElement arln:airline)
		{	
				System.out.print("Flight Name: ");
				System.out.println(arln.getText());
		}
		
	}
	
	@Test(enabled=true)
	public void everyCase() throws InterruptedException
	{
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(250, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(250,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.ixigo.com/");
		
		driver.findElement(By.xpath("//div[text()=\"From\"]//following::input[@placeholder=\"Enter city or airport\"][2]")).sendKeys("AMD");
		
		Thread.sleep(700);
     	driver.findElement(By.xpath("//div[text()=\"From\"]//following::input[@placeholder=\"Enter city or airport\"][2]")).sendKeys(Keys.ENTER);
		
		driver.findElement(By.xpath("//td[@data-date='16032021']")).click();
		
		driver.findElement(By.xpath("//div[text()='Return']//following::input[1]")).click();
		
		driver.findElement(By.xpath("//div[text()='Return']//following::td[@data-date='25042021'][2]")).click();
		
		driver.findElement(By.cssSelector("#content > div > div.banner > div.form-cntr.flight > div > div > div.search.u-ib.u-v-align-bottom > button > div")).click();
		
		Thread.sleep(1600);
		
		driver.findElement(By.xpath("//div[text()='Stops']//following::div[@data-checkboxindex='1'][1]//child::span[@class='ixi-icon-tick check-icon']")).click();
		
        List<WebElement> time = driver.findElements(By.xpath("//div[@class='time']"));
        
        int i=1;
		
		for(WebElement tm:time)
		{
			
			
			if(i%2!=0)
			{
				System.out.print("Departure Time : ");
				System.out.println(tm.getText());
			}
			else if(i%2==0)
			{
				System.out.print("Arrival time : ");
				System.out.println(tm.getText());
			}
			
			i++;
		}
		
		List<WebElement> drtn = driver.findElements(By.xpath("//div[@class='duration']"));
		
		for(WebElement dt:drtn)
		{	
				System.out.print("Total Duration: ");
				System.out.println(dt.getText());
		}
		
        List<WebElement> prcgrp = driver.findElements(By.xpath("//div[@class='price-group']"));
		
		for(WebElement prc:prcgrp)
		{	
				System.out.print("Total Price: ");
				System.out.println(prc.getText());
		}
		
        List<WebElement> airline = driver.findElements(By.xpath("//div[@class='airline-text']"));
		
		for(WebElement arln:airline)
		{	
				System.out.print("Flight Name: ");
				System.out.println(arln.getText());
		}

	}
	
}
		
	
	

