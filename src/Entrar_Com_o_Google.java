import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.Collections;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Entrar_Com_o_Google {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver","C:\\Users\\lynin\\Downloads\\geckodriver-v0.31.0-win64\\geckodriver.exe"); // Setting system properties of FirefoxDriver
		WebDriver driver = new FirefoxDriver(); //Creating an object of FirefoxDriver


	    driver.get("https://mail.google.com/mail/u/0/");

		driver.findElement(By.id("identifierId")).sendKeys(
				"testesg022@gmail.com");									 
 	    driver.findElement(By.xpath("//div[@id='identifierNext']/div/button/span")).click();
	    driver.findElement(By.name("password")).click();
 	    driver.findElement(By.name("password")).sendKeys("Silvinha1");
	    driver.findElement(By.xpath("//div[@id='passwordNext']/div/button/span")).click();
	    driver.get("https://mail.google.com/mail/u/0/");
	    driver.get("https://account.blip.ai/login");
	    driver.findElement(By.id("blip-login-with-google")).click();
	    driver.get("https://account.blip.ai/account");
	    assertEquals("Minha conta", driver.findElement(By.xpath("//form[@id='account-form']/div/p")).getText());

		  
	}
}
