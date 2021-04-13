package Covid.cov;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestN {


	
	 WebDriver drv= new ChromeDriver();
	 
	@Test
	public void malan(){
		
		drv.get("https://www.w3schools.com/java/java_constructors.asp");
		
		
	}
	
	@BeforeTest
	public void som(){
		
		System.out.println("xxxxxxxxx");
	}
	
}
