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
      driver.get("http://ec2-54-172-142-110.compute-1.amazonaws.com:3001/");
      driver.findElement(By.xpath("./html/body/form/div/div/div/div[1]/div[2]/input")).click();
      driver.findElement(By.id("login")).sendKeys(sUsername);
      driver.findElement(By.id("password")).sendKeys(sPassword);
      driver.findElement(By.id("click")).click();
      driver.findElement(By.xpath("./html/body/form/div/div/div/div[1]/div[2]/input")).click();
      driver.quit();

  }
 
}
