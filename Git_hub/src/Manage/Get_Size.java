package Manage;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Get_Size {
public static void main(String[] args) {
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.youtube.com/");
	driver.manage().window().fullscreen();
	Dimension value = driver.manage().window().getSize();
	System.out.println(value);
}
}
