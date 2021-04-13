package Covid.cov;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class WhatsApp {
	
@Test
	public void xtreame() {
		
		System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver.exe");
		ChromeOptions option=new ChromeOptions();
		option.addArguments("--disable-notifications");
		
		
		
		
		WebDriver dri=new ChromeDriver();
		dri.get("https://www.airtelxstream.in/");
		dri.manage().window().maximize();
		WebElement livetv= dri.findElement(By.id("nav-Live TV"));
		livetv.click();
		Assert.assertTrue(true);
		
	//	WebElement link =dri.findElement(By.xpath("//h6[contains(text(),'Bulletin')]"));
		//link.click();
	//	barcode.isDisplay.ed();
		
		
		

	}

}
