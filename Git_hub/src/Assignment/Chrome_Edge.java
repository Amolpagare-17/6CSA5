package Assignment;



import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Chrome_Edge {
	public static void main(String[] args) {
		WebDriver driver1 = new ChromeDriver();
		WebDriver driver2 = new EdgeDriver();
		Dimension d1 = new Dimension(672, 800);
		driver1.manage().window().setSize(d1);
		Dimension d2 = new Dimension(669, 800);
		driver2.manage().window().setSize(d2);
		Point a = new Point(0, 0);
		driver1.manage().window().setPosition(a);
		Point b = new Point(700,0 );
		driver2.manage().window().setPosition(b);
	}
}
