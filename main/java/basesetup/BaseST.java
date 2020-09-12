package basesetup;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.Test;

public class BaseST {
 private WebDriver chr;
 @Test
	public  void getdriver()
	{
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Temp\\Pallavi\\chromedriver_win32\\chromedriver.exe");
	    chr=new ChromeDriver();
	    chr.get("https://www.amazon.in");
	   
	}
	@AfterSuite
	public void close()
	{
		chr.close();
	}

}
