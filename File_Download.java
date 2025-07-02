import java.sql.Driver;
import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class File_Download {

	public static void main(String[] args) throws InterruptedException {

		String fileDownloadPath = "/home/jugeswari.meher@apmosys.mahape/Pictures/Wallpapers";
		Map<String, Object> prefs = new HashMap<>();
        prefs.put("download.default_directory", fileDownloadPath);
        prefs.put("download.prompt_for_download", false);
        prefs.put("safebrowsing.enabled", true);

        // Apply preferences to ChromeOptions
        ChromeOptions options = new ChromeOptions();
        options.setExperimentalOption("prefs", prefs);
        
        WebDriver driver = new ChromeDriver(options);
        driver.get("https://demoqa.com/upload-download");
        driver.manage().window().maximize();
        driver.findElement(By.id("downloadButton")).click();
        Thread.sleep(5000);
        
        driver.quit();
        
		
	}

}
