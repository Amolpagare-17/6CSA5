package Close_and_Quit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigate {
public static void main(String[] args) {
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.netflix.com/in/");
	driver.get("https://www.facebook.com/");
	driver.navigate().to("https://online.qspiders.com/student/");
	driver.navigate().to("https://www.netflix.com/in/");
	driver.navigate().back();
	driver.navigate().forward();
	driver.navigate().refresh();
}
}
