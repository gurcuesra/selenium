import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task5 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "../chromedriver");
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("http://juliemr.github.io/protractor-demo/");

		driver.findElement(By.xpath("/html/body/div/div/form/input[1]")).sendKeys("6");
		driver.findElement(By.xpath("/html/body/div/div/form/select/option[2]")).click();
		driver.findElement(By.xpath("/html/body/div/div/form/input[2]")).sendKeys("2");
		driver.findElement(By.xpath("/html/body/div/div/form/button")).click();
		
		driver.close();
		driver.quit();
		
	}

}
