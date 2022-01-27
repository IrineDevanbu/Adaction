

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.SendKeysAction;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Baseclass {

	public static WebDriver driver;
	//browserlaunch
	public static void browserlaunch() {
		//browserlaunch
				WebDriverManager.chromedriver().setup();
				driver=new ChromeDriver();
				//driver.get("https://adactinhotelapp.com/index.php");
	}
	public static void urllaunch(String url) {
driver.get(url);
	
	}
	
	public static void wait(int a) {
		driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(a));

	}
	public static void geturl() {
       driver.get("https://adactinhotelapp.com/");
	}
	public static void sendkeys(WebElement ref,String value) {
ref.sendKeys(value);
}
	public static void clicks(WebElement e) {
e.click();

	}
	public static void quits() {
driver.quit();
	}
}




