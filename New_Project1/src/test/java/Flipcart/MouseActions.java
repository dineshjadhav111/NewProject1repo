package Flipcart;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MouseActions {

	public static void main(String[] args) throws InterruptedException  {
		// TODO Auto-generated method stub

		//WebDriverManager.firefoxdriver().setup();
		//WebDriver driver = new FirefoxDriver();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//driver.get("https://www.flipkart.com/");
		driver.get("https://www.amazon.in/");
		Thread.sleep(2000);

		WebElement searchBox = driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
		searchBox.sendKeys("tata");
		
		
		
//		try {
//		WebElement w1 = driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']"));
//		w1.click();
//		}catch(NoSuchElementException e){
//			System.out.println("Exception got Handled");
//		}
	/*	try {
		WebElement w1 = driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']"));
		w1.click();
		}catch(NoSuchElementException e)
		{
			System.out.println("Exception got Handled");
		}
		Thread.sleep(2000);

		Actions act = new Actions(driver);		
		WebElement w2 = driver.findElement(By.xpath("//div[text()='Two Wheelers']"));
		act.moveToElement(w2).perform();
		Thread.sleep(2000);

		WebElement w3 = driver.findElement(By.xpath("//*[text()='Electric Vehicles']"));
		act.moveToElement(w3).perform();
        act.click(w3).build().perform();  */
        
        
       /* WebElement w4= driver.findElement(By.xpath("//div[text()='Fashion']"));
        act.moveToElement(w4).build().perform();
        WebElement w5= driver.findElement(By.xpath("//a[text()='Men Footwear']"));
        act.moveToElement(w5).perform();
        act.click(w5).build().perform();*/
		
//		List<WebElement> w2 = driver.findElements(By.xpath("//div[@class='_37M3Pb']//a"));
//		
//		for(WebElement list : w2)
//		{
//			System.out.println(list.getText());
//		}
		
	}
}
