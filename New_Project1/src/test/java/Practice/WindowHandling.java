package Practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WindowHandling {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(8));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(8));
		

		// 1st window
		driver.get("https://www.qafox.com/");

		Actions act = new Actions(driver);
		WebElement w1 = driver.findElement(By.xpath("(//a[text()='Interview Questions'])[2]"));
		act.moveToElement(w1).perform();
		//Thread.sleep(2000);
		
		WebElement w2 = driver.findElement(By.xpath("(//a[text()='Selenium Java Question and Answers'])[2]"));
//		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(2));
//		WebElement w2 =wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[text()='Selenium Java Question and Answers'])[2]")));
		//w2.click();
		act.moveToElement(w2).click().perform();
	}

}
