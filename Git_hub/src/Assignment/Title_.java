package Assignment;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Title_ {
public static void main(String[] args) {
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.netflix.com/in/");
	String actualresult =driver.getTitle();
	System.out.println(actualresult);
	String exceptedResult = "Netflix India – Watch TV Shows Online, Watch Movies Online";
	if(actualresult.equals(exceptedResult)) {
		System.out.println("Pass");
	}
	else {
		System.out.println("Fail");
	}
}

}
