package Covid.cov;

import java.util.Arrays;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.MutableCapabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.WebElement;

public class Facebook {

	private static final String WebElement = null;

	/**
	 * @param args
	 * @throws InterruptedException 
	 */
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver.exe");
		ChromeOptions option=new ChromeOptions();
		option.addArguments("--disable-notifications");
		
		 WebDriver drv= new ChromeDriver(option);
		 
		 drv.get("https://www.facebook.com/");
		drv.manage().window().maximize();
		
		WebElement usr= drv.findElement(By.id("email"));
		usr.sendKeys("7908040746");
		
		WebElement password= drv.findElement(By.id("pass"));
		password.sendKeys("Omveska");
		
		
		WebElement Login= drv.findElement(By.xpath("//button"));
		Login.click();
		
		WebElement mssngr=drv.findElement(By.xpath("//div[@aria-label='Account controls and settings']//div[@aria-label='Messenger'][1]"));
		mssngr.click();
		
		drv.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		WebElement searchMssngr =drv.findElement(By.xpath("//input[@aria-label='Search Messenger']"));
//	WebDriverWait wait =new WebDriverWait(drv, 5);
//	WebElement mss2=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@aria-label='Search Messenger']")));
//	mss2.isDisplayed();
		searchMssngr.sendKeys("Rox");
		
		WebElement rox= drv.findElement(By.xpath("//li[@id='100002261378551']//a//div//div//div//div//img"));
	rox.click();
	
	WebElement sendLike= drv.findElement(By.xpath("//div[@aria-label='Send a Like']"));
	sendLike.click();
	
//	WebElement mssgBox= drv.findElement(By.xpath("//div[@data-pagelet='ChatTab']//div[@class='_5rpb']"));
//	mssgBox.sendKeys("GOOD NIGHT BOSS");	
	
	//mssgBox.sendKeys(Keys.ENTER);
	
	Thread.sleep(5000);
		
	//	drv.close();
		
		System.out.println("Hacked FB");
	
	}

}
