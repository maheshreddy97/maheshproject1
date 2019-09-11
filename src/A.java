import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class A {
	public static void main(String[] args) throws InterruptedException, AWTException, IOException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Greens-12\\Desktop\\gow s\\Selenium\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.greenstechnologys.com/");
		String pw = driver.getWindowHandle();
		WebElement m1 = driver.findElement(By.xpath("//a[text()='CONTACT US']"));
		Actions acc=new Actions(driver);
		acc.contextClick(m1).perform();
		Robot r=new Robot();
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(5000);
		Set<String> all = driver.getWindowHandles();
		List<String> li=new ArrayList<>();
		li.addAll(all);
		Thread.sleep(5000);
		driver.switchTo().window(li.get(1));
		Thread.sleep(5000);
		WebElement m2 = driver.findElement(By.xpath("(//a[text()='Courses '])[1]"));
		WebElement m3 = driver.findElement(By.xpath("(//a[text()='Oracle Training '])[1]"));
		WebElement m4 = driver.findElement(By.xpath("//span[text()='Oracle SQL and PLSQL Training']"));
		acc.moveToElement(m2).perform();
		acc.moveToElement(m3).perform();
		m4.click();
		TakesScreenshot tk=(TakesScreenshot)driver;
		File s = tk.getScreenshotAs(OutputType.FILE);
		File dst=new File("C:\\Users\\Greens-12\\Downloads\\out.png");
		FileUtils.copyFile(s, dst);
		
		
		
		
		
		
		
	
	}

}
