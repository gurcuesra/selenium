import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task7 {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "../chromedriver");
		ChromeDriver driver = new ChromeDriver();		
		driver.get("https://www.etsy.com/");
		driver.manage().window().maximize();
		
		List<WebElement> links = driver.findElements(By.tagName("a"));
		
		for(WebElement we: links) {
			if(we.getText().equals("Clothing & Shoes")){
				we.click();
				break;
			}
		}
		

		
		driver.close();
		driver.quit();

	}

}
