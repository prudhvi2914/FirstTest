package firstTest;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BlazeDemoTest {
	
	WebDriver driver;

	@Before
	public void setUp() throws Exception {
		

		// 1. setup selenium and  webdriver
		
		System.setProperty("webdriver.chrome.driver", 
				"/Users/satramprudhvi/Desktop/chromedriver");
	    driver = new ChromeDriver();
		
		// 2. go to the website
		driver.get("http://blazedemo.com/");
	}

	@After
	public void tearDown() throws Exception {
		
		//closes the driver
		
		Thread.sleep(5000);
		driver.close();
	}


	@Test
	public void TC1() throws InterruptedException  {
		
		
		
		
//		String headerText= driver.findElement(By.className("click-before-outline")).getText();
//	//comparing the actual value with expected vale
//		assertEquals("Subscribe to My McD’s®",headerText);
//		System.out.println("TitleText "+ headerText);
//		
		
	}
	

}
