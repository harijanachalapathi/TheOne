package pack1;

import org.testng.annotations.*;
import static org.testng.Assert.*;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver; 
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.*;
import org.testng.annotations.*;

public class chrometest {

  @Test
  public void VedamTest() {
	  System.out.println("running tests..............");
	  int x = 0;
	  int y = 0;
	  Assert.assertEquals(x, y);
	  }
  @Test
  public void vedalu() {
	  int a = 1;
	  int b = 1;
	  Assert.assertEquals(a, b);
  }

  public void afterCommitMethod() {
	  int me = 1;
	  int you = 1;
	  Assert.assertEquals(me, you);
			 
  }
}
  