package assignmentselenium3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateContact {

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
		WebElement contact = driver.findElement(By.linkText("Contacts"));
		contact.click();
		WebElement createContact = driver.findElement(By.linkText("Create Contact"));
		createContact.click();
		WebElement firstName = driver.findElement(By.id("firstNameField"));
		firstName.sendKeys("kiran");
		WebElement lastName = driver.findElement(By.id("lastNameField"));
		lastName.sendKeys("kumar");
		WebElement firstNameLocal = driver.findElement(By.id("createContactForm_firstNameLocal"));
		firstNameLocal.sendKeys("kiran");
		WebElement lastNameLocal = driver.findElement(By.id("createContactForm_lastNameLocal"));
		lastNameLocal.sendKeys("kumar");
		WebElement department = driver.findElement(By.id("createContactForm_departmentName"));
		department.sendKeys("Testing");
		WebElement description = driver.findElement(By.id("createContactForm_description"));
		description.sendKeys("automation tesing");
		WebElement mail = driver.findElement(By.id("createContactForm_primaryEmail"));
		mail.sendKeys("testleaf007@gmail.com");
		
		WebElement state = driver.findElement(By.id("createContactForm_generalStateProvinceGeoId"));
		Select stateinput = new Select(state);
		stateinput.selectByVisibleText("New York");
		
		WebElement createContactButton = driver.findElement(By.xpath("//input[@class='smallSubmit']"));
		createContactButton.click();
		WebElement edit = driver.findElement(By.xpath("//a[@class='subMenuButton']"));
		edit.click();
		
		WebElement descriptionEdit = driver.findElement(By.id("updateContactForm_description"));
		descriptionEdit.clear();
		WebElement importantNote = driver.findElement(By.id("updateContactForm_importantNote"));
		importantNote.sendKeys("nothing");
		WebElement update = driver.findElement(By.xpath("//input[@value='Update']"));
		update.click();
		
		String title = driver.getTitle();
		System.out.println("Title of Resulting Page : " + title);
		
		
		Thread.sleep(3000);
		driver.close();
	}

}
