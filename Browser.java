import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Browser {
public static void main(String arg[])
 {
	System.setProperty("webdriver.chrome.driver", "C://SeleniumDriver/Chrome/chromedriver.exe");
	WebDriver  driver=new ChromeDriver();
	//Interface        //Implementation class
	driver.get("https://www.learn.upes.ac.in");
	System.out.println(driver.getCurrentUrl());
 }
}
