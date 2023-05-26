package weeklyassignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class LeafGround {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://leafground.com/button.xhtml;jsessionid=node015v440wf8dpbh4rmszx5td07w271363.node0");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("(//span[@class='ui-button-text ui-c'])[1]")).click();
		String title = driver.getTitle();
		System.out.println("Title is : " + title);
		driver.get("https://leafground.com/button.xhtml;jsessionid=node015v440wf8dpbh4rmszx5td07w271363.node0");
		boolean button = driver.findElement(By.xpath("(//div[@class='card'])[2]")).isEnabled();
		if(button == true) {
			System.out.println("button is disabled");
		}else {
			System.out.println("button is enabled");
		}
		
		driver.get("https://leafground.com/select.xhtml");
		WebElement tools = driver.findElement(By.xpath("//select[@class='ui-selectonemenu']"));
		Select toolsinput = new Select(tools);
		toolsinput.selectByVisibleText("Selenium");
		//to choose your preferred country
		driver.findElement(By.xpath("(//span[@class='ui-icon ui-icon-triangle-1-s ui-c'])[1]")).click();
		//to select to India
		driver.findElement(By.xpath("(//li[@class='ui-selectonemenu-item ui-selectonemenu-list-item ui-corner-all'])[3]")).click();
		//to choose course
		driver.findElement(By.xpath("//span[@class='ui-button-icon-primary ui-icon ui-icon-triangle-1-s']")).click();
		//to select Selenium
		driver.findElement(By.xpath("//li[@data-item-label='Selenium WebDriver']")).click();
		//to choose language
		driver.findElement(By.xpath("(//span[@class='ui-icon ui-icon-triangle-1-s ui-c'])[3]")).click();
		//to select English
		driver.findElement(By.xpath("(//li[@class='ui-selectonemenu-item ui-selectonemenu-list-item ui-corner-all'])[4]")).click();
		//to Select 'Two' irrespective of the language chosen
	    driver.findElement(By.xpath("(//span[@class='ui-icon ui-icon-triangle-1-s ui-c'])[4]")).click();
		//to select one
	    driver.findElement(By.xpath("//li[@data-label='One']")).click();
		
		Thread.sleep(4000);
		driver.close();

	}

}
