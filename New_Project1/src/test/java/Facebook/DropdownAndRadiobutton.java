package Facebook;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropdownAndRadiobutton {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(8));
		
		driver.get("https://www.facebook.com/");
		WebElement w1 = driver.findElement(By.xpath("//a[text()='Create new account']"));
		w1.click();
		
		Thread.sleep(2000);
		
//		List<WebElement> AllDays = driver.findElements(By.xpath("//select[@id='day']"));
//		for(WebElement days : AllDays)
//		{
//			//System.out.println(days.getText());
//			if(days.getText().equalsIgnoreCase("21"))
//			{
//				days.click();
//			}
//		}
		
		/* Dropdown Handling Using Select class */
		 
		WebElement Day = driver.findElement(By.xpath("//select[@id='day']"));
		WebElement month = driver.findElement(By.xpath("//select[@id='month']"));
		WebElement year = driver.findElement(By.xpath("//select[@id='year']"));

		Select selDay = new Select(Day);
		selDay.selectByVisibleText("21");
		
		Select selMonth = new Select(month);
		selMonth.selectByIndex(11);
		
		Select selYear = new Select(year);
		selYear.selectByValue("1994");
		
		/* RadioButton Handling */
		
		List<WebElement> radioButtons = driver.findElements(By.xpath("//input[@name='sex']"));
		for(WebElement opt : radioButtons )
		{
			if(opt.getAttribute("value").equalsIgnoreCase("2"))
			{
				opt.click();
			}		
		}
	}

}
