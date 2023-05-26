package weeklyassignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class TamilMatrimony {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.tamilmatrimony.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement profile = driver.findElement(By.xpath("//select[@class='paddl5 txtopac']"));
		Select profileinput = new Select(profile);
		profileinput.selectByValue("1");
		driver.findElement(By.xpath("(//input[@class='hp-regform-txtfield'])[1]")).sendKeys("Praveen");
		driver.findElement(By.xpath("(//input[@class='hp-gender'])[1]")).click();
		WebElement date = driver.findElement(By.xpath("//select[@name='DOBDAY']"));
		Select dateinput = new Select(date);
		dateinput.selectByValue("10");
		WebElement month = driver.findElement(By.xpath("//select[@name='DOBMONTH']"));
		Select monthinput = new Select(month);
		monthinput.selectByValue("5");
		WebElement year = driver.findElement(By.xpath("//select[@name='DOBYEAR']"));
		Select yearinput = new Select(year);
		yearinput.selectByValue("2001");
		WebElement religion = driver.findElement(By.xpath("(//select[@class='selectfield'])[1]"));
		Select religioninput = new Select(religion);
		religioninput.selectByValue("1");
		WebElement motherTongue = driver.findElement(By.xpath("//select[@name='MOTHERTONGUE']"));
		Select motherTongueinput = new Select(motherTongue);
		motherTongueinput.selectByValue("47");
		WebElement country = driver.findElement(By.xpath("(//select[@class='paddl5'])[5]"));
		Select countryinput = new Select(country);
		countryinput.selectByValue("98");
		WebElement mobileNumber = driver.findElement(By.xpath("//select[@id='M_COUNTRYCODE']"));
		Select mobileNumberinput = new Select(mobileNumber);
		mobileNumberinput.selectByValue("98");
		driver.findElement(By.xpath("//input[@value='Mobile Number']")).sendKeys("9566238248");
		driver.findElement(By.xpath("(//input[@class='hp-regform-txtfield'])[3]")).sendKeys("testleaf007@gmail.com");
		driver.findElement(By.xpath("(//input[@type='password'])[3]")).sendKeys("TDSVenom@10");
		
		
		Thread.sleep(5000);
		driver.close();

	}

}
