package Practice;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class NewChallenge1 {
	public static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		String xpath_currentPopulation = "//div[@class='maincounter-number']/span[@class='rts-counter']";
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(8));
		driver.get("https://www.worldometers.info/world-population/");
		
//		int count=1;
//		while(count<=10) {
//			
//			if(count==11)
//				break;
//			
//		List<WebElement> popList = driver.findElements(By.xpath("//div[@class='maincounter-number']/span[@class='rts-counter']"));
//		
//		for(WebElement e : popList)
//		{
//			System.out.println(e.getText());
//		}
//		Thread.sleep(1000);
//		count++;
//	  }
		
		printPopolationData(xpath_currentPopulation);
	}
	
	//Generic Method
	public static void printPopolationData(String locator) throws InterruptedException
	{
		
		int count=1;
		while(count<=10) 
		{
			if(count==11)
				break;
			
		List<WebElement> popList = driver.findElements(By.xpath(locator));
		
		for(WebElement w1 : popList)
		{
			System.out.println(w1.getText());
		}
		Thread.sleep(1000);
		count++;
		
	   }
  }
	
}
