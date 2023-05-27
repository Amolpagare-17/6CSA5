package WebDriverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetAssi4 {
public static void main(String[] args) {
	WebDriver driver =new ChromeDriver();
	driver.get("https://www.actitime.com/");
	String actual=driver.getTitle();
	String excepted="actiTIME - Time Tracking Software for Cost-Effective Projects";
	if
	( actual.equals(excepted)) {
		System.out.println("PASS");
	}
	else
		System.out.println("fail");
	
}
}
