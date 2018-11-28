import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task10 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "../chromedriver");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://toolsqa.com/automation-practice-switch-windows/");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("button1")).click();
		
		Set<String> winIds = driver.getWindowHandles();
		System.out.println(winIds.size());  //-> 2
		
		Iterator<String> it = winIds.iterator();
		
		String mainWindow = it.next();
		String firstWindow = it.next();
		
		System.out.println(mainWindow);
		System.out.println(firstWindow);

		driver.switchTo().window(firstWindow);
		System.out.println("First windows title is: " + driver.getTitle());
		driver.switchTo().window(mainWindow);
		System.out.println("Main windows title is: " + driver.getTitle());
		
		

	}

}
