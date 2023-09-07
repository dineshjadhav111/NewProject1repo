package Practice;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class goIbiboFlightSearch {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
//		WebDriverManager.firefoxdriver().setup();
//		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(8));
		
		
		driver.get("https://www.goibibo.com/flights/");
		
		driver.findElement(By.xpath("//span[@class='logSprite icClose']")).click();
		
		Thread.sleep(1000);
		//from station textbox    //without clicking on textbox passing value and get "ElementNotInteractableException" 
		driver.findElement(By.xpath("//div[@class='sc-12foipm-34 keCaow']//span[text()='From']/following-sibling::p")).click();
		driver.findElement(By.xpath("//div[@class='sc-12foipm-38 lgsmMM']/input")).sendKeys("India");
		
		List<WebElement> fromlist = driver.findElements(By.xpath("//ul[@id='autoSuggest-list']//li"));
		System.out.println(fromlist.size());
		for(WebElement list : fromlist) {
			if(list.getText().contains("Sindhudurg, India")) {
				list.click();
				break;
			}
		}
		
		//driver.findElement(By.xpath("//p[text()='One-way']")).click();   //To Handle "ElementClickInterceptedException" 
		//driver.findElement(By.xpath("//div[@class='sc-12foipm-34 keCaow']//span[text()='To']/following-sibling::p")).click();
		
		WebElement textbox2 = driver.findElement(By.xpath("//div[@class='sc-12foipm-34 keCaow']//span[text()='To']/following-sibling::p"));
           /*JavascriptExecutor use to handle "ElementClickInterceptedException" because JavascriptExecutor 
            perform operation on DOM level not UI level and find Element in dom and perform click operation*/   
		JavascriptExecutor js =(JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", textbox2);
		
		driver.findElement(By.xpath("//div[@class='sc-12foipm-38 lgsmMM']/input")).sendKeys("India");
		
		List<WebElement> tolist = driver.findElements(By.xpath("//ul[@id='autoSuggest-list']//li"));
		System.out.println(tolist.size());
		for(WebElement list : tolist) {
			if(list.getText().contains("New Delhi, India")) {
				list.click();
				break;
			}
		}
		//JavascriptExecutor use to handle "ElementClickInterceptedException"
		WebElement calenderClick = driver.findElement(By.xpath("(//div[contains(@class,'sc-12foipm-16 dwhdnN fswFld')])[3] "));
		JavascriptExecutor js1 =(JavascriptExecutor) driver;
		js1.executeScript("arguments[0].click();", calenderClick);
		
		//(//div[@class='DayPicker-Body'])[2]//div[@class='DayPicker-Week']
		//List<WebElement> calender1 = driver.findElements(By.xpath("(//div[@class='DayPicker-Body'])[2]//div[@class='DayPicker-Week']"));
		List<WebElement> calender1 = driver.findElements(By.xpath("(//div[@class='DayPicker-Body'])[2]//div[@class='DayPicker-Day']/p"));

		System.out.println(calender1.size());
		
		for(WebElement day : calender1) {
			if(day.getText().contains("21")) {
				day.click();
				break;
			}
		}
		
		driver.findElement(By.xpath("//span[text()='Done']")).click();
		
		WebElement classSelect = driver.findElement(By.xpath("(//div[contains(@class,'sc-12foipm-16 dwhdnN fswFld ')])[5]"));
		JavascriptExecutor js2 =(JavascriptExecutor) driver;
		js2.executeScript("arguments[0].click();", classSelect);
		driver.findElement(By.xpath("//ul[@class='sc-12foipm-58 DHGSM']/li[text()='business']")).click();
		
		driver.findElement(By.xpath("//div[contains(@class,'sc-12foipm-75 cpQUwj')]/a[2]")).click();
		
		WebElement searchFlightButton = driver.findElement(By.xpath("//span[contains(text(),'SEARCH FLIGHTS')]"));
		searchFlightButton.click();
	}

}
