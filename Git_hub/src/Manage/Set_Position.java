package Manage;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Set_Position {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.youtube.com/");
		Point p = new Point (50,50);
		driver.manage().window().setPosition(p);
	}
}
