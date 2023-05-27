package Manage;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Set_P {
public static void main(String[] args) {
	WebDriver driver1 = new ChromeDriver();
	WebDriver driver2 = new ChromeDriver();
	Dimension d1=new Dimension(672, 800);
	driver1.manage().window().setSize(d1);		
	Dimension d2=new Dimension(669,800);
	driver2.manage().window().setSize(d2);
//	driver.get("https://www.youtube.com/");
	Point p =new Point(0,0);
	driver1.manage().window().setPosition(p);
	Point p2 = new Point(700, 0);
	driver2.manage().window().setPosition(p2);
}
}
