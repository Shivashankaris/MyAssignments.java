package week7.day1;

	 import org.openqa.selenium.By;
	import org.openqa.selenium.*;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.support.ui.Select;

	import io.github.bonigarcia.wdm.WebDriverManager;

	public class Register {
		public static void main(String[] args) {
			WebDriverManager.chromedriver().setup();
			WebDriver driver = new ChromeDriver();
			driver.get("https://www.opencart.com/index.php?route=account/register");
			driver.manage().window().maximize();
			driver.findElement(By.id("input-username")).sendKeys("shiva");
			driver.findElement(By.id("input-firstname")).sendKeys("shiva");
			driver.findElement(By.id("input-lastname")).sendKeys("shankari");
			driver.findElement(By.id("input-email")).sendKeys("shivashankaris2010@gmail.com");
			WebElement dropdown = driver.findElement(By.id("input-country"));
			Select dd1 = new Select(dropdown);
			dd1.selectByIndex(99);
			driver.findElement(By.id("input-password")).sendKeys("shiva123456");
			driver.findElement(By.xpath("//button[text()='Register']")).click();
			
			
			
			
		}

	

		
			
			
		

	}


