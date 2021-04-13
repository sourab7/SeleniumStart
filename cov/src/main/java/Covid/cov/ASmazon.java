package Covid.cov;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.chrome.ChromeDriver;

public class ASmazon {
	
	

	public static void main(String[] args) throws InterruptedException
	{
		
		System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver.exe");
		 WebDriver drv= new ChromeDriver();
		 
		 
		 drv.get("https://www.amazon.in/");
		 drv.manage().window().maximize();
		 WebElement  Scearch=drv.findElement(By.id("twotabsearchtextbox"));
		 Scearch.sendKeys("Levice");
		 WebElement Levice=drv.findElement(By.id("nav-search-submit-button"));
		 Levice.click();
		 
		 
		 
		 
		 
		 
		
	
		 
		 
	}
	}
