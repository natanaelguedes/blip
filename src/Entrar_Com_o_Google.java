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
	    driver.get("https://accounts.google.com/ServiceLogin/signinchooser?service=mail&passive=1209600&osid=1&continue=https%3A%2F%2Fmail.google.com%2Fmail%2Fu%2F0%2F&followup=https%3A%2F%2Fmail.google.com%2Fmail%2Fu%2F0%2F&emr=1&flowName=GlifWebSignIn&flowEntry=ServiceLogin");
	    driver.findElement(By.xpath("//div[@id='view_container']/div/div/div[2]/div/div/div/form/span/section/div/div/div/div/ul/li[2]/div/div/div[2]")).click();
	    driver.get("https://accounts.google.com/ServiceLogin/identifier?service=mail&passive=1209600&osid=1&continue=https%3A%2F%2Fmail.google.com%2Fmail%2Fu%2F0%2F&followup=https%3A%2F%2Fmail.google.com%2Fmail%2Fu%2F0%2F&emr=1&flowName=GlifWebSignIn&flowEntry=ServiceLogin");
	    driver.findElement(By.id("identifierId")).clear();
	    driver.findElement(By.id("identifierId")).sendKeys("ngsneto@gmail.com");
	    driver.findElement(By.name("hiddenPassword")).clear();
	    driver.findElement(By.name("hiddenPassword")).sendKeys("voupassar12");
	    driver.get("https://accounts.google.com/ServiceLogin?service=mail&passive=1209600&osid=1&continue=https://mail.google.com/mail/u/0/&followup=https://mail.google.com/mail/u/0/&emr=1#inbox");
	    driver.get("https://accounts.google.com/ServiceLogin/signinchooser?service=mail&passive=1209600&osid=1&continue=https%3A%2F%2Fmail.google.com%2Fmail%2Fu%2F0%2F&followup=https%3A%2F%2Fmail.google.com%2Fmail%2Fu%2F0%2F&emr=1&flowName=GlifWebSignIn&flowEntry=ServiceLogin#inbox");
	    driver.get("https://accounts.google.com/ServiceLogin/identifier?service=mail&passive=1209600&osid=1&continue=https%3A%2F%2Fmail.google.com%2Fmail%2Fu%2F0%2F&followup=https%3A%2F%2Fmail.google.com%2Fmail%2Fu%2F0%2F&emr=1&flowName=GlifWebSignIn&flowEntry=ServiceLogin");
	    driver.findElement(By.id("identifierId")).click();
	    //ERROR: Caught exception [ERROR: Unsupported command [doubleClick | id=identifierId | ]]
	    //ERROR: Caught exception [ERROR: Unsupported command [doubleClick | id=identifierId | ]]
	    driver.findElement(By.id("identifierId")).clear();
	    driver.findElement(By.id("identifierId")).sendKeys("testesg022@gmail.com");
	    driver.findElement(By.xpath("//div[@id='identifierNext']/div/button/span")).click();
	    driver.get("https://accounts.google.com/signin/v2/challenge/pwd?service=mail&passive=1209600&osid=1&continue=https%3A%2F%2Fmail.google.com%2Fmail%2Fu%2F0%2F&followup=https%3A%2F%2Fmail.google.com%2Fmail%2Fu%2F0%2F&emr=1&flowName=GlifWebSignIn&flowEntry=ServiceLogin&cid=1&navigationDirection=forward&TL=AM3QAYYAujGEqQHBTwi6XLp6mQzKlGI6sof8-DDtujCfg9xITL4UlxsRAGW_sTWu");
	    driver.findElement(By.name("password")).click();
	    driver.findElement(By.name("password")).clear();
	    driver.findElement(By.name("password")).sendKeys("Silvinha1!");
	    driver.findElement(By.xpath("//div[@id='passwordNext']/div/button/div[3]")).click();
	    driver.findElement(By.name("password")).click();
	    driver.findElement(By.name("password")).clear();
	    driver.findElement(By.name("password")).sendKeys("Silvinha1");
	    driver.findElement(By.xpath("//div[@id='passwordNext']/div/button/span")).click();
	    driver.get("https://mail.google.com/mail/u/0/");
	    driver.get("https://account.blip.ai/login");
	    driver.findElement(By.id("blip-login-with-google")).click();
	    driver.get("https://account.blip.ai/account");
	    assertEquals("Minha conta", driver.findElement(By.xpath("//form[@id='account-form']/div/p")).getText());

		  
	}
}
