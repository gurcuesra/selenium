import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PrintSpecificBox {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "../chromedriver");
		ChromeDriver driver = new ChromeDriver();		
		driver.get("https://www.cnn.com/");
		driver.manage().window().maximize();
		
		// get the box
		WebElement box = driver.findElement(By.cssSelector(".cn-container_33924866-1FBA-7484-9434-55FB07FA31B2"));
		
		// get the list items
		List<WebElement> links = box.findElements(By.tagName("li"));
		
		System.out.println(links.size());
		
//		for(WebElement link:links) {
//			//System.out.println(link.getText());
//			WebElement box = driver.findElement(By.cssSelector(".cn-container_33924866-1FBA-7484-9434-55FB07FA31B2"));
//			links = box.findElements(By.tagName("li"));
//			
//			link.click();
//			driver.navigate().back();
//		}
		
		
		
		for(int i=00; i<links.size(); i++) {
			links.get(i).click();
			driver.navigate().back();
			box = driver.findElement(By.cssSelector(".cn-container_33924866-1FBA-7484-9434-55FB07FA31B2"));
			links = box.findElements(By.tagName("li"));
		}

	}

}
