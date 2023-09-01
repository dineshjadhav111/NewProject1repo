package Practice;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MultipleActions {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

//		WebDriverManager.firefoxdriver().setup();
//		WebDriver driver = new FirefoxDriver();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		 driver.get("https://qavalidation.com/demo-form/");
		 WebElement w1 = driver.findElement(By.xpath("//button[text()='Submit!']"));
//		 WebElement w2 = driver.findElement(By.xpath("//input[@id='g4072-fullname']"));
//		 w2.sendKeys("Dinesh");
		 
		 JavascriptExecutor js = (JavascriptExecutor) driver;
		 js.executeScript("arguments[0].scrollIntoView()", w1);
		//driver.get("https://www.facebook.com/");
//
//		WebElement email = driver.findElement(By.id("email"));
//		email.sendKeys("Dinesh");

		/*
		 * Thread.sleep(2000); 
		 * 
		 *  ====>> Copy Paste  <<====
		 *  
		 * email.sendKeys(Keys.CONTROL+"a");
		 * email.sendKeys(Keys.CONTROL+"c"); 
		 * email.clear();
		 * 
		 * Thread.sleep(2000);
		 * 
		 * WebElement password = driver.findElement(By.id("pass")); 
		 * password.clear();
		 * password.sendKeys(Keys.CONTROL+"v"); 
		 * password.clear();
		 * 
		 * Thread.sleep(2000);
		 */

		/*
		 * ====>> Check textbox is Empty or not <<====
		 * 
		 * String len = email.getAttribute("value");
		 * 
		 * if (len.length()==0) 
		 * { System.out.println("Textbox present is empty"); 
		 * } 
		 * else
		 * { 
		 * System.out.println("Textbox present is not Empty"); 
		 * }
		 */

		
		/*
		 * ====> css Selector <====
		 * 
		 * WebElement email = driver.findElement(By.cssSelector("input#email"));
		 * WebElement email = driver.findElement(By.cssSelector("input[type=text]"));
		 * email.sendKeys("Dinesh");
		 */

		// JavascriptExecutor js = (JavascriptExecutor)driver;
		// ******Without sendKeys()**********//
		// js.executeScript("document.getElementById('g4072-fullname').value='Welcome
		// Boss'");
		 //js.executeScript("document.getElementById('email').value='Boss'");

		// js.executeScript("document.getElementByxpath('//input[@id='email']').value='Boss'");

//*****************************************************************************************************//

		// WebElement status = driver.findElement(By.id("email"));
		// System.out.println("Display status is :"+status.isDisplayed());
		// System.out.println("status is :"+status.isEnabled());
		// System.out.println("status is :"+status.isSelected());

		/*
		 * driver.findElement(By.xpath("//a[text()='Create new account']")).click();
		 * 
		 * WebElement female = driver.findElement(By.
		 * xpath("(//*[@type='radio' and contains (@name,'sex')])[1]")); WebElement male
		 * = driver.findElement(By.
		 * xpath("(//*[@type='radio' and contains (@name,'sex')])[2]"));
		 * 
		 * male.click();
		 * 
		 * System.out.println(female.isSelected());
		 * System.out.println(male.isSelected());
		 */

//**************************************************************************************************************//

		// ****For scrolling*********//
		// js.executeScript("window.scroll(0,500)");
		// Thread.sleep(4000);

		// Press CTRL+A+(DELETE/BACKSPACE)

		/*
		 * Robot r = new Robot(); r.keyPress(KeyEvent.VK_CONTROL);
		 * r.keyPress(KeyEvent.VK_A); r.keyPress(KeyEvent.VK_DELETE);
		 * 
		 * r.keyRelease(KeyEvent.VK_CONTROL); r.keyRelease(KeyEvent.VK_A);
		 * r.keyRelease(KeyEvent.VK_DELETE);
		 * 
		 * Thread.sleep(3000);
		 * 
		 * r.keyPress(KeyEvent.VK_TAB);
		 * 
		 * Thread.sleep(3000);
		 * 
		 * r.keyPress(KeyEvent.VK_ALT); r.keyPress(KeyEvent.VK_TAB);
		 * 
		 * r.keyRelease(KeyEvent.VK_ALT); r.keyRelease(KeyEvent.VK_TAB);
		 * 
		 * Thread.sleep(3000);
		 */
		// WebElement w1 = driver.findElement(By.id("g4072-fullname"));
		// w1.sendKeys("Dinesh");
		// driver.close();
		// **********following****/////
		// WebElement w2 =
		// driver.findElement(By.xpath("//select[@id='g4072-gender']//following::span[@id='g4072-gender-button']"));
		// ********preceding**//
		// WebElement w2 =
		// driver.findElement(By.xpath("//span[@id='g4072-gender-button']//preceding::select[@id='g4072-gender']"));

		// WebElement w2 =
		// driver.findElement(By.xpath("//span[@id='g4072-gender-button']"));
		// w2.click();

		// List<WebElement>list =
		// driver.findElements(By.xpath("//input[@type='checkbox']"));

		/*
		 * for(WebElement check :list ) { check.click(); }
		 */

		// *************for selecting top2 checkboxes************///

		/*
		 * for(int i=0; i<=1; i++) { list.get(i).click(); }
		 */

		/*
		 * Actions act = new Actions(driver); act.sendKeys(Keys.SPACE).perform();
		 * act.sendKeys(Keys.TAB).perform();
		 * 
		 * WebElement w2 = driver.findElement(By.id("g4072-email"));
		 * w2.sendKeys("1@gmail.com"); act.sendKeys(Keys.TAB).perform();
		 * 
		 * WebElement w3 = driver.findElement(By.id("g4072-phonenumber"));
		 * w3.sendKeys("12345"); act.sendKeys(Keys.TAB).perform();
		 */
		/*
		 * List<WebElement> w4 =
		 * driver.findElements(By.name("g4072-yearsofexperience"));
		 * 
		 * for(WebElement opt : w4) { if(opt.getAttribute("value").equals("4")) {
		 * opt.click(); } }
		 */

		/*
		 * driver.get("https://stqatools.com/testng/"); WebElement w1 =
		 * driver.findElement(By.xpath("(//span[text()='Programs'])[1]"));
		 * 
		 * Actions Act = new Actions(driver); Act.moveToElement(w1).perform();
		 * //Thread.sleep(4000); JavascriptExecutor js = (JavascriptExecutor)driver;
		 * WebElement w2 =
		 * driver.findElement(By.xpath("(//span[text()='Selenium'])[2]"));
		 * 
		 * js.executeScript("arguments[0].click()",w2); //click with xpath
		 */
		// w2.click();
		// Act.moveToElement(w2).perform();
		// Act.click(w2).perform();
		// Thread.sleep(4000);
		// driver.findElement(By.xpath("//*[@class='bellows-subtoggle']")).click();

		// driver.findElement(By.xpath("(//ul[@class='bellows-submenu']//li)[3]")).click();

		// JavascriptExecutor js = (JavascriptExecutor)driver;
		// js.executeScript("window.scroll(0,1000)");

		// ******************************************************************************************************************//

		String url= driver.getCurrentUrl();
		System.out.println(url);
//		
//		//driver.navigate().refresh();
//		
//		WebElement linkText = driver.findElement(By.linkText("Messenger"));
//		System.out.println(linkText.getText());

		//driver.close();
		 

	}

}
