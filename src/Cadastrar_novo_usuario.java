import static org.junit.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Cadastrar_novo_usuario {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver","C:\\Users\\lynin\\Downloads\\geckodriver-v0.31.0-win64\\geckodriver.exe"); // Setting system properties of FirefoxDriver
		WebDriver driver = new FirefoxDriver(); //Creating an object of FirefoxDriver

	    driver.get("https://account.blip.ai/login");
	    driver.findElement(By.id("blip-register")).click();
	    driver.findElement(By.id("FullName")).click();
	    // ERROR: Caught exception [ERROR: Unsupported command [doubleClick | id=FullName | ]]
	    driver.findElement(By.id("FullName")).click();
	    // ERROR: Caught exception [ERROR: Unsupported command [doubleClick | id=FullName | ]]
	    driver.findElement(By.id("FullName")).clear();
	    driver.findElement(By.id("FullName")).sendKeys("Natanael Guedes da Silva Neto");
		
		 driver.findElement(By.id("Email")).clear();
		 driver.findElement(By.id("Email")).sendKeys("testesg022@gmail.com");
		 driver.findElement(By.id("Password")).clear();
		 driver.findElement(By.id("Password")).sendKeys("Silvinha2");
		 driver.findElement(By.id("PhoneNumber")).clear();
	      driver.findElement(By.id("PhoneNumber")).sendKeys("558387080608");
		 driver.findElement(By.id("ncid-cc43")).click();
		  driver.findElement(By.id("PhoneNumber")).click();
		  driver.findElement(By.id("PhoneNumber")).clear();
		 
		  driver.findElement(By.id("PhoneNumber")).sendKeys("(83) 87080-608");
		 driver.findElement(By.id("CompanySite")).click();
		 
		  driver.findElement(By.id("CompanySite")).clear();
		  driver.findElement(By.id("CompanySite")).sendKeys("http://www.cancaonova.com"
		  ); driver.findElement(By.xpath("//input[@value='Selecione']")).click();
		  driver.findElement(By.xpath(
		  "//li[@id='blip-select__option-f40852a8-39a1-8f96-0225-f1141df3f4fc']/div/span"
		  )).click();
		  driver.findElement(By.xpath("//form[@id='register-form']/div[2]/bds-checkbo ")).click(); 
		
		  driver.findElement(By.xpath("//span[@id='recaptcha-anchor']/div")).click();
		  // ERROR: Caught exception [ERROR: Unsupported command [selectFrame |
	       driver.findElement(By.id("submitButton")).click();
		  driver.findElement(By.id("success-registration")).click();
 	   // assertTrue(driver.findElement(By.xpath("//main[@id='success-registration']/h1")).getText().matches("^Enviamos um e-mail de ativa��o para t[\\s\\S]*[\\s\\S]*[\\s\\S]*[\\s\\S]*2@gmail\\.com$"));
	 // }
 		  }


		  

}
