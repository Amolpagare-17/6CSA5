package Manage;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Set_Size {
public static void main(String[] args) {
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.youtube.com/");
	Dimension d=new Dimension(600,600);
	driver.manage().window().setSize(d);
	System.out.println(driver.manage().window().getSize());
}
}
