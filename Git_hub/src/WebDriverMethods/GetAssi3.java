package WebDriverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetAssi3 {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.get("https://wisdomondemand.thinkific.com/users/sign_in");
	System.out.println(driver.getTitle());
}
}
