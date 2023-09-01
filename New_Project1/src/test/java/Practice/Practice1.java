package Practice;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Practice1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

	/*	driver.get("https://qavalidation.com/demo-form/");
		WebElement w1 = driver.findElement(By.xpath("//button[text()='Submit!']"));

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView()", w1);

		Thread.sleep(2000);

		WebElement w2 = driver.findElement(By.xpath("//input[@id='g4072-email']//preceding-sibling::label[text()='Email']"));
		js.executeScript("arguments[0].scrollIntoView()", w2);

		WebElement w3 = driver.findElement(By.xpath("(//span[contains(@class,'ui-selectmenu-text')])[2]"));
		w3.click();
		
		Thread.sleep(2000);
		Actions act = new Actions(driver);
		WebElement w4 = driver.findElement(By.xpath("//div[text()='Cypress']"));
		w4.click();
//		act.moveToElement(w4).build().perform();
//		act.click(w4).build().perform();  
	*/	
		driver.get("https://demo.automationtesting.in/Frames.html");
		
		WebElement singleframe = driver.findElement(By.id("singleframe"));
		driver.switchTo().frame(singleframe);
		
		WebElement w1 = driver.findElement(By.xpath("(//input[@type='text'])[1]"));
		w1.sendKeys("Dinesh");
		
		driver.switchTo().defaultContent();
		
		WebElement w2 = driver.findElement(By.xpath("//a[text()='Iframe with in an Iframe']"));
		w2.click();
		
		WebElement frame1 = driver.findElement(By.xpath("//div[@id='Multiple']//iframe"));
		driver.switchTo().frame(frame1);
		
		WebElement frame2 = driver.findElement(By.xpath("//div[@class='iframe-container']//iframe"));
		driver.switchTo().frame(frame2);
		
		WebElement w3 = driver.findElement(By.xpath("(//input[@type='text'])[1]"));
		w1.sendKeys("Dinesh");
		
		
		
	}

}
