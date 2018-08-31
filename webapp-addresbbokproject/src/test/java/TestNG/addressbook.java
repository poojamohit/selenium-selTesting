package TestNG;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.annotations.Parameters;
 
public class TestngParameters {
 
	private static WebDriver driver;
 
  @Test 
 
  @Parameters({ "sUsername", "sPassword" })
 
  public void test(String sUsername, String sPassword) {
 
	  driver = new ChromeDriver();
 
      driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
 
      driver.get("http://localhost:3001");
 
      driver.findElement(By.xpath(".//*[@id='account']/a")).click();
 
      driver.findElement(By.id("log")).sendKeys(sUsername);
 
      driver.findElement(By.id("pwd")).sendKeys(sPassword);
 
      driver.findElement(By.id("login")).click();
 
      driver.findElement(By.xpath(".//*[@id='account_logout']/a")).click();
 
      driver.quit();
 
  }
 
}
