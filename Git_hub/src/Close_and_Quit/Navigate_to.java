package Close_and_Quit;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigate_to {
public static void main(String[] args) throws MalformedURLException {
	WebDriver driver = new ChromeDriver();
	driver.navigate().to("https://www.netflix.com/in/");
	URL url=new URL("https://www.facebook.com/");
	driver.navigate().to(url);
}
}
