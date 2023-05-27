package Assignment;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Link_ {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.netflix.com/in/");
	String actualResult=driver.getCurrentUrl();
	String exceptedResult=("https://www.netflix.com/in/");
	if(actualResult.equals(exceptedResult)) {
		System.out.println("Pass");
	}
	else {
		System.out.println("Fail");
	}
}
}
