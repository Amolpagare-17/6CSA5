package WebDriverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetAssi {
public static void main(String[] args) {
	WebDriver driver = new ChromeDriver();
   driver.get("https://www.flipkart.com/");
   System.out.println(driver.getTitle());
}
}
