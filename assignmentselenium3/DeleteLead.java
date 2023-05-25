package assignmentselenium3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DeleteLead {

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
		WebElement phone = driver.findElement(By.linkText("Phone"));
		phone.click();
		WebElement findLeadButton = driver.findElement(By.xpath("//button[text()='Find Leads']"));
		findLeadButton.click();
		
		
		
		Thread.sleep(3000);
		driver.close();
	}

}
