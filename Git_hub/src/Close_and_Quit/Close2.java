package Close_and_Quit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class Close2 {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.netflix.com/in/");
	driver.switchTo().newWindow(WindowType.WINDOW);
	Thread.sleep(3000);
	driver.close();
	
}
}
