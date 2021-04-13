package Covid.cov;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Flipkart {
	public static void main(String[]args) throws InterruptedException{
		System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.flipkart.com/?gclid=Cj0KCQjwutaCBhDfARIsAJHWnHuDhOX0bYbtsq4888TS4CJQzjOQi-H3bt_y6xjJRy0ys6c-0VijyyYaAkOJEALw_wcB");
		driver.manage().window().maximize();
		WebElement cross= driver.findElement(By.xpath("//button[contains(text(),'✕')]"));
		cross.click();
		WebElement fashion=driver.findElement(By.xpath("//div[contains(text(),'Fashion')]"));
		Actions act=new Actions(driver); 
		act.moveToElement(fashion).perform();;
		WebElement women=driver.findElement(By.xpath("//a[contains(text(),'Women Western')]"));
		women.click();
		
		
		Thread.sleep(10000);
		driver.quit();
		System.out.println("Rashi is better than Bawal");
		
	

}}
