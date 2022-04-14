import org.junit.Test;

public class LoginBlig {

	public static void main(String[] args) {
		// TODO Auto-generated method stub



@Test
		    driver.get("https://account.blip.ai/login");
		    driver.findElement(By.xpath("//div[@id='ncid-3c32']/div")).click();
		    driver.findElement(By.id("email")).click();
		    driver.findElement(By.id("email")).click();
		    driver.findElement(By.id("email")).clear();
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
		    driver.findElement(By.id("logout-link")).click();
		  }

	}
}
