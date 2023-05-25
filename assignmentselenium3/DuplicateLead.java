package assignmentselenium3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DuplicateLead {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/logout");
		driver.manage().window().maximize();
		WebElement username = driver.findElement(By.id("username"));
		username.sendKeys("DemoSalesManager");
		WebElement password = driver.findElement(By.id("password"));
		password.sendKeys("crmsfa");
		WebElement loginButton = driver.findElement(By.className("decorativeSubmit"));
		loginButton.click();
		WebElement crmsfa = driver.findElement(By.linkText("CRM/SFA"));
		crmsfa.click();
		WebElement leads = driver.findElement(By.linkText("Leads"));
		leads.click();
		WebElement findLead = driver.findElement(By.linkText("Find Leads"));
		findLead.click();
		WebElement email = driver.findElement(By.linkText("Email"));
		email.click();
		WebElement emailAddress = driver.findElement(By.name("emailAddress"));
		emailAddress.sendKeys("test@gmail.com");
		WebElement findlead = driver.findElement(By.xpath("//button[text()='Find Leads']"));
		findlead.click();
		
		WebElement nameOfThe1stLead = driver.findElement(By.xpath("//a[text()='Aranya'][1]"));
		String text = nameOfThe1stLead.getText();
		System.out.println(text);
		nameOfThe1stLead.click();
		
		WebElement duplicate = driver.findElement(By.linkText("Duplicate Lead"));
		duplicate.click();
		
		String title = driver.getTitle();
		System.out.println(title);
		if (title.contains("Duplicate Lead")) {
			System.out.println("Title is verified");
		} else {
			System.out.println("Title mismatch");
		}
		WebElement submit = driver.findElement(By.name("submitButton"));
		submit.click();
		WebElement namedd = driver.findElement(By.id("viewLead_firstName_sp"));
		String text1 = namedd.getText();
		if (text1.equals(text)) {
			System.out.println("both names are same");
		}

		Thread.sleep(3000);
		driver.close();
	}

}
