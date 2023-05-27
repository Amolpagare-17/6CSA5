package Close_and_Quit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class Quit {
public static void main(String[] args) {
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.netflix.com/in/");
	driver.switchTo().newWindow(WindowType.TAB);
	driver.close();
	
}
}
