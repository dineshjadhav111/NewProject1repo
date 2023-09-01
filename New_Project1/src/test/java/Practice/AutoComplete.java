package Practice;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AutoComplete {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.firefoxdriver().setup();
		WebDriverManager.firefoxdriver().setup();
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver();
		//WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://www.amazon.in/");
		
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("tata");
		
		Thread.sleep(2000);
		
		List<WebElement> list = driver.findElements(By.xpath("//div[@id='nav-flyout-iss-anchor']//following::div[starts-with(@class,'left')]"));
		
		Thread.sleep(2000);

		for(WebElement l : list)
		{
			if(l.getText().equals("tata salt"))
			{
				l.click();
				break;
			}
		}
		
			//list.get(0).click();	
	}

}
