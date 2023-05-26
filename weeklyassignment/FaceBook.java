package weeklyassignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FaceBook {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("//a[@data-testid='open-registration-form-button']")).click();
		driver.findElement(By.name("firstname")).sendKeys("PraveenKumar");
		driver.findElement(By.name("lastname")).sendKeys("Praveen");
		driver.findElement(By.xpath("(//input[@data-type='text'])[3]")).sendKeys("9566238248");
		driver.findElement(By.xpath("//input[@data-type='password']")).sendKeys("TDSVenom@10");
		WebElement date = driver.findElement(By.id("day"));
		Select dayinput = new Select(date);
		dayinput.selectByValue("10");
		WebElement month = driver.findElement(By.id("month"));
		Select monthinput = new Select(month);
		monthinput.selectByValue("5");
		WebElement year = driver.findElement(By.id("year"));
		Select yearinput = new Select(year);
		yearinput.selectByValue("2001");
		driver.findElement(By.xpath("(//input[@name='sex'])[2]")).click();
		
		Thread.sleep(3000);
		driver.close();

	}

}
