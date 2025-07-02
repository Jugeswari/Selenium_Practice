import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {

	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		System.setProperty("webdriver.chrome.driver", "/home/jugeswari.meher@apmosys.mahape/Downloads/chrome-linux64");
		driver.get("https://demoqa.com/select-menu");
		driver.manage().window().maximize();
		WebElement dropd = driver.findElement(By.id("oldSelectMenu"));
		Select select = new Select(dropd);
		List<WebElement> dd = select.getOptions();
		for(WebElement i: dd) {
			System.out.println(i.getText());
			
		}
		select.selectByIndex(4);
		select.selectByVisibleText("Magenta");
		select.selectByValue("6");
		
		driver.close();
		
		}

}
