package assignement6;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class CreateLead {

	public static void main(String[] args) throws InterruptedException {
		EdgeDriver driver = new EdgeDriver();
		driver.get("http://leaftaps.com/opentaps/control/logout");
		WebElement username = driver.findElement(By.id("username"));
		username.sendKeys("DemoSalesManager");
		WebElement password = driver.findElement(By.id("password"));
		password.sendKeys("crmsfa");
		WebElement loginButton = driver.findElement(By.className("decorativeSubmit"));
		loginButton.click();
		WebElement crmsfa = driver.findElement(By.linkText("CRM/SFA"));
		crmsfa.click();
		WebElement leadstab = driver.findElement(By.linkText("Leads"));
		leadstab.click();
		WebElement createLead = driver.findElement(By.linkText("Create Lead"));
		createLead.click();
		WebElement companyName = driver.findElement(By.id("createLeadForm_companyName"));
		companyName.sendKeys("Testleaf");
		WebElement firstName = driver.findElement(By.id("createLeadForm_firstName"));
		firstName.sendKeys("Kiran");
		WebElement lastName = driver.findElement(By.id("createLeadForm_lastName"));
		lastName.sendKeys("kumar");
		WebElement firstNameLocal = driver.findElement(By.id("createLeadForm_firstNameLocal"));
		firstNameLocal.sendKeys("KiranKumar");
		WebElement department = driver.findElement(By.name("departmentName"));
		department.sendKeys("Testing");
		WebElement description = driver.findElement(By.name("description"));
		description.sendKeys("automation testing");
		WebElement mail = driver.findElement(By.id("createLeadForm_primaryEmail"));
		mail.sendKeys("testleaf007@gmail.com");
		WebElement createLeadButton = driver.findElement(By.name("submitButton"));
		createLeadButton.click();
		
		Thread.sleep(2000);
		driver.close();
	}

}
