import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class logintest {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "D:\\Testing-tutorial\\geckodriver-v0.26.0-win64\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		/* driver.get("http://www.demo.guru99.com/V4/");
		driver.findElement(By.name("uid")).sendKeys("mngr295514");
		driver.findElement(By.name("password")).sendKeys("ujUvytY");
		driver.findElement(By.name("btnLogin")).click(); */
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.get("http://softwaretestingplace.blogspot.com/2015/10/sample-web-page-to-test.html");
		
		driver.findElement(By.name("firstname")).sendKeys("Rashmi");
		
		String txtrecieved = driver.findElement(By.name("fullname")).getText();
		System.out.println("output = " + txtrecieved );
		
		WebElement chkbox = driver.findElement(By.name("chkbox"));
		chkbox.click();	
		
		if (chkbox.isSelected()) {
			System.out.println("Checkbox is selected");				
		}
		else {
			System.out.println("Checkbox is not selected");
		}
		
		WebElement radio1 = driver.findElement(By.name("female"));
		radio1.click();
		System.out.println("Female is selected");
		
		driver.findElement(By.name("age")).sendKeys("28");
		
		Select drpdown = new Select(driver.findElement(By.cssSelector("#post-body-5864649494765988891 > div:nth-child(1) > form:nth-child(11) > select:nth-child(25)")));
		drpdown.selectByVisibleText("Passport");
				
		//Locating 'browse' button
		WebElement browse =driver.findElement(By.id("uploadfile"));
		//pass the path of the file to be uploaded using Sendkeys method
		browse.sendKeys("D:\\Selenium\\original.txt");
		
		driver.findElement(By.cssSelector("#post-body-5864649494765988891 > div:nth-child(1) > form:nth-child(11) > table:nth-child(41) > tbody:nth-child(1) > tr:nth-child(2) > td:nth-child(1) > input:nth-child(1)")).click();
		System.out.println("Steve Jobs is selected");
		
	}

}
