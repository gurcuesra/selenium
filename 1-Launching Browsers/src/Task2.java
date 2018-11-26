import org.openqa.selenium.chrome.ChromeDriver;

public class Task2 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "../chromedriver");
		ChromeDriver driver = new ChromeDriver();
		
		//1
		driver.get("https://www.dice.com/");
		//2
		driver.navigate().to("https://www.indeed.com/");
		
		//3
		driver.navigate().back();
		
		//4
		String title = driver.getTitle();
		System.out.println(title);
		
		String url = driver.getCurrentUrl();
		System.out.println(url);
		
		//5
		driver.navigate().forward();
		
		//6
		String title2 = driver.getTitle();
		System.out.println(title2);
		
		String url2 = driver.getCurrentUrl();
		System.out.println(url2);
		
		//7
		driver.close();
		
		//8
		driver.quit();
		
		/*Output:
		 * Find Jobs in Tech | Dice.com
		 * https://www.dice.com/
		 * Job Search | Indeed
		 * https://www.indeed.com/
		 */

	}

}
