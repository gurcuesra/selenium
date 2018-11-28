import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task12 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "../chromedriver");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://testingpool.com/data-types-in-java/");

		List<WebElement> rows = driver.findElements(By.cssSelector(".su-table>table tr"));
		System.out.println("Total row: " + rows.size());
		
		List<WebElement> columns = driver.findElements(By.cssSelector(".su-table>table tr:nth-child(1)>td"));
		System.out.println("Total column: "+columns.size());
		
		String a = driver.findElement(By.cssSelector(".su-table>table tr:nth-child(2)>td:nth-child(3)")).getText();
		System.out.println(a);
		
		String b = driver.findElement(By.cssSelector(".su-table>table tr:nth-child(6)>td:nth-child(1)")).getText();
		System.out.println(b);
	}

}
