import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class File_upload {

	public static void main(String[] args) throws InterruptedException {
		
		//System.setProperty("webdriver.chrome.driver", "/home/jugeswari.meher@apmosys.mahape/Downloads/chrome-linux64/chrome.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/upload-download");
		driver.manage().window().maximize();
		driver.findElement(By.id("uploadFile")).sendKeys("/home/jugeswari.meher@apmosys.mahape/Pictures/Wallpapers/Jagannath.jpeg");
		Thread.sleep(3000);
	}

}
