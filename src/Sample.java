import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Sample extends BaseClass {
	public static void main(String[] args) {
		launchBrowser();
		loadUrl("https://www.facebook.com");
		getTitle();
		getCurrentUrl();
		WebElement e1 = driver.findElement(By.id("email"));
		fill(e1, "gowtham");
		WebElement e2 = driver.findElement(By.id("pass"));
		fill(e2, "gjgfg");
		WebElement e3 = driver.findElement(By.id("loginbutton"));
		btnClick(e3);
		quitBrowser();
		
	}
	

}
