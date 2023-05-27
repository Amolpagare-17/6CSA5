package Assignment;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Assi_getset {
	public static void main(String[] args) {
		System.out.println("enter 1 for chrome browser & enter 2 for Edge browser");
		Scanner sc = new Scanner (System.in);
		int value = sc.nextInt();
		switch (value) {
		case 1:{
			WebDriver driver = new ChromeDriver();
			driver.get("https://www.youtube.com/");break;
		}
		case 2:{
			WebDriver driver = new EdgeDriver();
			driver.get("https://www.youtube.com/");break;
		}
		}


	}
}
