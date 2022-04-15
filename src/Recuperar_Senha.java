import static org.junit.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Recuperar_Senha {

	public static void main(String[] args) {

		System.setProperty("webdriver.gecko.driver","C:\\Users\\lynin\\Downloads\\geckodriver-v0.31.0-win64\\geckodriver.exe"); // Setting system properties of FirefoxDriver
		WebDriver driver = new FirefoxDriver(); //Creating an object of FirefoxDriver	    
		driver.get("https://account.blip.ai/login");
	    driver.findElement(By.xpath("//main[@id='blip-login-page']/section")).click();
	    driver.findElement(By.id("login-forgot-password")).click();
	    driver.findElement(By.id("Email")).click();
	    driver.findElement(By.id("Email")).clear();
	    driver.findElement(By.id("Email")).sendKeys("testesg022@gmail.com");
	    driver.findElement(By.id("submitButton")).click();
	    assertTrue(driver.findElement(By.xpath("//main[@id='forgot-password-success']/h1")).getText().matches("^Enviamos um email para t[\\s\\S]*[\\s\\S]*[\\s\\S]*[\\s\\S]*2@gmail\\.com$"));
       
	
	}
	  }
	


