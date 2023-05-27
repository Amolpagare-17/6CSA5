package WebDriverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Geturl {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.actitime.com/");
	String actual=driver.getCurrentUrl();
	String excepted="https://www.actitime.com/";
	if 
	(actual.equals(excepted))
	{
		System.out.println("pass");
	}
	else 
		System.out.println("fail");
}
}
