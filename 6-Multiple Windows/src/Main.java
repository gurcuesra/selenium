import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "../chromedriver");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://accounts.google.com/signup/v2/webcreateaccount?flowName=GlifWebSignIn&flowEntry=SignUp");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//*[text()='Terms']")).click();
		
		Set<String> winIds = driver.getWindowHandles();
		System.out.println(winIds.size());  //-> 2
		
		Iterator<String> it = winIds.iterator();
		
		String mainWindow = it.next();
		String firstWindow = it.next();
		
//		System.out.println(mainWindow);    // -> CDwindow-741FE8F301986D081C78FAAC6D4DD0DD

		driver.switchTo().window(firstWindow);
		driver.switchTo().window(mainWindow);
		

	}

}
