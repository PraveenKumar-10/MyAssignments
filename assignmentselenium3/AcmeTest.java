package assignmentselenium3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class AcmeTest {

	public static void main(String[] args) throws InterruptedException {
		EdgeDriver driver = new EdgeDriver();
		driver.get("https://acme-test.uipath.com/login");
		driver.manage().window().maximize();
		WebElement email = driver.findElement(By.id("email"));
		email.sendKeys("kumar.testleaf@gmail.com");
		WebElement password = driver.findElement(By.name("password"));
		password.sendKeys("leaf@12");
		WebElement loginButton = driver.findElement(By.xpath("//button[@type='submit']"));
		loginButton.click();
		String welcomepagetitle = driver.getTitle();
		System.out.println("title : " + welcomepagetitle);
		WebElement logout = driver.findElement(By.xpath("//*[@id=\"bs-example-navbar-collapse-1\"]/ul/li[3]/a"));
		logout.click();
		Thread.sleep(2000);
		driver.close();
		
		

	}
}

