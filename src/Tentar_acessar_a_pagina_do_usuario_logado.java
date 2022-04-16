import static org.junit.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Tentar_acessar_a_pagina_do_usuario_logado {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver","C:\\Users\\lynin\\Downloads\\geckodriver-v0.31.0-win64\\geckodriver.exe"); // Setting system properties of FirefoxDriver
		WebDriver driver = new FirefoxDriver(); //Creating an object of FirefoxDriver

 	    driver.get("https://account.blip.ai/account?portalUrl=https://natanael-guedes-12qiv.blip.ai"); 
	    assertEquals("Minha conta", driver.findElement(By.xpath("//form[@id='account-form']/div/p")).getText());
	  }



}
