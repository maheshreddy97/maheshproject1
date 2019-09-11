import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass {
	static WebDriver driver;
	public static WebDriver launchBrowser() {
System.setProperty("webdriver.chrome.driver", "C:\\Users\\Greens-12\\Desktop\\gow s\\Selenium\\driver\\chromedriver.exe");
driver =new ChromeDriver();
		
		return driver;
	}
	
	public static void loadUrl(String url) {
driver.get(url);
	}	
	
	public static void fill(WebElement e,String value) {
		
e.sendKeys(value);
	}

	public static void getTitle() {
String title = driver.getTitle();
System.out.println(title);
	}
	public static void getCurrentUrl() {
		String currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl);

	}
	public static void btnClick(WebElement e) {
		e.click();
		

	}
	public static void quitBrowser() {
		driver.quit();

	}
	
}