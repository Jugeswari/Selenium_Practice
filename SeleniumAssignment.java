import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import net.bytebuddy.asm.Advice.OffsetMapping.Target.AbstractReadOnlyAdapter;

public class SeleniumAssignment {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		System.setProperty("Webdriver.chrome.driver", "/home/jugeswari.meher@apmosys.mahape/Downloads/chrome-linux64");
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		
		WebElement image = driver.findElement(By.xpath("//img[@src='/web/images/ohrm_branding.png?v=1721393199309']"));
		image.click();
		
		if (image.isDisplayed()) {
            System.out.println("image is  present");
        }
        else {
            System.out.println("image is not present");
        }
		
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Barsha");
		
		Thread.sleep(2000);

		List<WebElement> allLinks = driver.findElements(By.tagName("a"));
		for(WebElement mylink : allLinks) {
			if(mylink.getText().trim().equalsIgnoreCase("OrangeHRM, Inc")) {
				mylink.click();
				break;
			}
		}
		
	}

}
