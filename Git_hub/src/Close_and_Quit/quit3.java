package Close_and_Quit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class quit3 {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver = new EdgeDriver();
	driver.get("https://www.actitime.com/");
	Thread.sleep(3000);
	driver.close();
}
}
