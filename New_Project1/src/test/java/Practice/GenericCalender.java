package Practice;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GenericCalender {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(8));
		driver.get("https://www.irctc.co.in/nget/train-search");

		// calender
		WebElement dateClick = driver.findElement(By.xpath("//span[@class='ng-tns-c58-10 ui-calendar']"));
		dateClick.click();
		
		Thread.sleep(1000);
		//Select Day,Month and Year
		//1st Approach
	/*	while(!driver.findElement(By.xpath("//div[@class='ui-datepicker-title ng-tns-c58-10']")).getText().contains("December")) 
		{
			driver.findElement(By.xpath("//span[@class='ui-datepicker-next-icon pi pi-chevron-right ng-tns-c58-10']")).click();
		}
		
		//Select Date
		List<WebElement> allDates = driver.findElements(By.xpath("//tbody/tr/td/a"));
		System.out.println(allDates.size());
		
		for(WebElement date : allDates) {
			if(date.getText().contains("21")) {
				date.click();
				break;
			}
		}
	*/	
		
		// 2nd Approach
	 String ExpectedDay="21";
	 String ExpectedMonth="December";
	 String ExpectedYear="2023";
		
		while (true) {

			String monthText = driver.findElement(By.xpath("//div[@class='ui-datepicker-title ng-tns-c58-10']/span[1]"))
					.getText();
			String yearText = driver.findElement(By.xpath("//div[@class='ui-datepicker-title ng-tns-c58-10']/span[2]"))
					.getText();

			if (monthText.equals(ExpectedMonth) & yearText.equals(ExpectedYear)) {
				break;
			} else {
				driver.findElement(
						By.xpath("//span[@class='ui-datepicker-next-icon pi pi-chevron-right ng-tns-c58-10']")).click();
			}
		}
		
		
		//Select Date
		List<WebElement> allDates = driver.findElements(By.xpath("//tbody/tr/td/a"));
		System.out.println(allDates.size());

		for (WebElement date : allDates) {
			if (date.getText().contains(ExpectedDay)) {
				date.click();
				break;
			}
		}
		
	}

}
