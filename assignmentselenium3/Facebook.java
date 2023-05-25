package assignmentselenium3;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Facebook {
	
	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://en-gb.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebElement createAccount = driver.findElement(By.xpath("//a[@data-testid='open-registration-form-button']"));
		createAccount.click();
		WebElement firstName = driver.findElement(By.xpath("//input[@aria-label='First name']"));
		firstName.sendKeys("Messi");
		WebElement surName = driver.findElement(By.xpath("//input[@aria-label='Surname']"));
		surName.sendKeys("Lionel");
		WebElement mobileNumber = driver.findElement(By.xpath("//input[@aria-label='Mobile number or email address']"));
		mobileNumber.sendKeys("9566824877");
		WebElement password = driver.findElement(By.xpath("//input[@id='password_step_input']"));
		password.sendKeys("abcde@4321");
		
		WebElement day = driver.findElement(By.xpath("//select[@title='Day']"));
		Select dayinput = new Select(day);
		dayinput.selectByValue("24");
		WebElement month = driver.findElement(By.xpath("//select[@title='Month']"));
		Select monthinput = new Select(month);
		monthinput.selectByValue("6");
		WebElement year = driver.findElement(By.xpath("//select[@title='Year']"));
		Select yearinput = new Select(year);
		yearinput.selectByValue("1987");
		
		WebElement radioButton = driver.findElement(By.xpath("//input[@value='2']"));
		radioButton.click();
		
		Thread.sleep(3000);
		driver.close();
		
		

	}

}
