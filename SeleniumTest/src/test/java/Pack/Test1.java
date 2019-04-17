package Pack;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class Test1 {
	WebDriver driver;
  @Test
  public void check_Title() {
	  System.out.println("Sample test");
	  String head=driver.findElement(By.tagName("h2")).getText();
	  System.out.println(head);
	  Assert.assertEquals("Hello World!", head);
  }
  @BeforeMethod
  public void beforeMethod() {
	  System.setProperty("webdriver.chrome.driver", "C:\\Jenkins_training\\chromedriver.exe");
	  driver=new ChromeDriver();
	  driver.get("http://localhost:8083/MavenProject2.war/");
  }

  @AfterMethod
  public void afterMethod() {
	  
	  driver.close();
  }

  

}
