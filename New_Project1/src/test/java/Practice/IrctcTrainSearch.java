package Practice;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class IrctcTrainSearch {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		//WebDriverManager.firefoxdriver().setup();
		//WebDriver driver = new FirefoxDriver();
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(8));
		driver.get("https://www.irctc.co.in/nget/train-search");
		
		WebElement dest = driver.findElement(By.xpath("(//input[contains(@role,'searchbox')])[1]"));
		dest.sendKeys("Mumbai");
		
		Thread.sleep(1000);
		//List<WebElement> StationList = driver.findElements(By.xpath("//span[contains(text(),'----- Journeys -----')]/parent::li//parent::ul"));
		List<WebElement> DestStationList = driver.findElements(By.xpath("//ul[@role='listbox']//li[@role='option']/span"));
		System.out.println(DestStationList.size());
		
		for(WebElement list1 : DestStationList) {
			if(list1.getText().contains("C SHIVAJI MAH T - CSMT"))
			{
				list1.click();
				break;
			}
		}
		
		//Thread.sleep(1000);
		WebElement depart = driver.findElement(By.xpath("(//input[contains(@role,'searchbox')])[2]"));
		depart.sendKeys("Pune");
		
		Thread.sleep(1000);
		//List<WebElement> StationList = driver.findElements(By.xpath("//span[contains(text(),'----- Journeys -----')]/parent::li//parent::ul"));
		List<WebElement> DepartStationList = driver.findElements(By.xpath("//ul[@role='listbox']//li"));
		System.out.println(DepartStationList.size());
		
		for(WebElement list2 : DepartStationList) {
			if(list2.getText().contains("SHIVAJINAGAR - SVJR"))
			{
				list2.click();
				break;
			}
		}
		
		//calender
		WebElement dateClick = driver.findElement(By.xpath("//span[@class='ng-tns-c58-10 ui-calendar']"));
		dateClick.click();
		
		WebElement dateSelect = driver.findElement(By.xpath("//tbody//tr[2]//td[5]"));
		dateSelect.click();
		
		//dropdown
		driver.findElement(By.xpath("(//div[@class='form-swap col-xs-12 remove-padding'])[2]//p-dropdown")).click();
		
		List<WebElement> ticket = driver.findElements(By.xpath("//ul[@role='listbox']//p-dropdownitem//li"));
		System.out.println(ticket.size());
		
		ticket.get(4).click();
		
		//search ticket button
		driver.findElement(By.xpath("//button[@type='submit']")).click();
	}

}
