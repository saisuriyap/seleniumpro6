package testblack1;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class NewTest3 {
	WebDriver driver;
  @BeforeTest
  public void beforetest() throws InterruptedException{
	  driver=new EdgeDriver();
	  WebDriverManager.edgedriver().setup();
	  driver.manage().window().maximize();
	  
  }
  
  @Test
  public void test_001() throws InterruptedException
  {
	  driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	  Thread.sleep(5000);
	  driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[1]/div/div[2]/input")).sendKeys("Admin");
	  driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[2]/div/div[2]/input")).sendKeys("admin123",Keys.ENTER);
//	  driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")).;
	  String url=driver.getCurrentUrl();
	  Assert.assertEquals(url,"https://opensource-demo.orangehrmlive.com/web/index.php/dashboard/index");
	  Thread.sleep(5000);
  }
  
  @AfterTest
  public void aftertest() {
	  driver.quit();
  }
}
