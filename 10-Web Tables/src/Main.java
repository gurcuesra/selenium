import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "../chromedriver");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://money.rediff.com/gainers/bse/daily/groupall");
		
		List<WebElement> names = driver.findElements(By.xpath("//*[@class='dataTable']/tbody/tr/td[1]"));
		System.out.println(names.size());
		
		List<WebElement> price = driver.findElements(By.xpath("//*[@class='dataTable']/tbody/tr/td[4]"));
		System.out.println(price.size());
		
		String companyName = "Jyoti";
		
//		// find a company
//		for(WebElement name: names) {
//			if(name.getText().equals(companyName)) {
//				System.out.println(name.getText());
//			}
//			
//		}
		
		//find price of a company
		for(int i=0; i<names.size(); i++) {
			if(names.get(i).getText().equals(companyName)) {
				System.out.println(price.get(i).getText());
				break;
			}
		}
		
		// how many total rows?
		System.out.println(names.size());
		
		//how many total columns?
		List<WebElement> column = driver.findElements(By.cssSelector(".dataTable>thead>tr>th"));
		System.out.println(column.size());
		

	}

}
