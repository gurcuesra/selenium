import org.openqa.selenium.chrome.ChromeDriver;

public class Task3 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "../chromedriver");
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("http://www.rediff.com/");
		
		String title = driver.getTitle();
		
		if(title.contains("Business")) {
			System.out.println("verified");
		}else {
			System.out.println("not-verified");
		}
		
		driver.close();
		driver.quit();
		

	}

}
