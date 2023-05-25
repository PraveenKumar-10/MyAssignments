package assignmentselenium3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class EditLead {

	public static void main(String[] args) {
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
		WebElement firstName = driver.findElement(By.id("ext-gen248"));
		firstName.sendKeys(" Academy");
		WebElement findlead = driver.findElement(By.id("ext-gen334"));
		findlead.click();
		WebElement firstlead = driver.findElement(By.xpath("//a[text()='Academy']"));
		firstlead.click();
		
		String title = driver.getTitle();
		if (title.contains("View Lead | opentaps CRM")) {
			System.out.println("Title verified successfully");
		} else {
			System.out.println("Title not verified");
		}
		WebElement editButton1 = driver.findElement(By.xpath("//a[text()='Edit']"));
		editButton1.click();
		WebElement changeCompanyName = driver.findElement(By.id("updateLeadForm_companyName"));
		changeCompanyName.clear();
		changeCompanyName.sendKeys("Wipro");
		WebElement updateButton = driver.findElement(By.className("smallSubmit"));
		updateButton.click();
		driver.close();

	}

}
