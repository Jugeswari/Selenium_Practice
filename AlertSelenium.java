import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import com.google.common.base.Function;

public class AlertSelenium {
	
	public static void main(String[] args){
		
		ChromeDriver driver = new ChromeDriver();
		
		Wait<WebDriver> mywait = new FluentWait<WebDriver>(driver)
			       .withTimeout(Duration.ofSeconds(30))
			       .pollingEvery(Duration.ofSeconds(5))
			       .ignoring(NoSuchElementException.class);
		
		
		
		System.setProperty("Webdriver.chrome.driver", "/home/jugeswari.meher@apmosys.mahape/Downloads/chrome-linux64");
		driver.get("https://demoqa.com/alerts");
		
		/*driver.findElement(By.xpath("//button[@id='alertButton']")).click();
		Alert simpleAlert = driver.switchTo().alert();
		System.out.println(simpleAlert.getText());
		simpleAlert.accept();*/
		
		
		
		WebElement alertB = mywait.until(new Function<WebDriver, WebElement>(){
			public WebElement apply(WebDriver driver) {
				return driver.findElement(By.xpath("//button[@id='alertButton']"));
			}
		});
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView(true);", alertB);
		alertB.click();
		
		Alert simpleAlert = driver.switchTo().alert();
		System.out.println(simpleAlert.getText());
		simpleAlert.accept();
		
	}

}
