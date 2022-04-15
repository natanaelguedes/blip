import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Login_Blig {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver","C:\\Users\\lynin\\Downloads\\geckodriver-v0.31.0-win64\\geckodriver.exe"); // Setting system properties of FirefoxDriver

		WebDriver driver = new FirefoxDriver(); //Creating an object of FirefoxDriver
		    driver.get("https://account.blip.ai/login");
		  //  driver.findElement(By.xpath("//div[@id='ncid-3c32']/div")).click();
		    //driver.findElement(By.id("email")).click();
		    driver.findElement(By.id("email")).click();
		    //driver.findElement(By.id("email")).clear();
		    driver.findElement(By.id("email")).sendKeys("natanaelgs@hotmail.com");
		    driver.findElement(By.id("login-fieldset")).click();
		    driver.findElement(By.id("password")).click();
		    driver.findElement(By.id("password")).clear();
		    driver.findElement(By.id("password")).sendKeys("Silvinha1!");
		    driver.findElement(By.xpath("//main[@id='blip-login-page']/section")).click();
		    driver.findElement(By.id("blip-login")).click();
		    driver.get("https://account.blip.ai/account");
		    assertEquals("Minha conta", driver.findElement(By.xpath("//form[@id='account-form']/div/p")).getText());
		    driver.get("https://account.blip.ai/account");
		 
		  }

	}

