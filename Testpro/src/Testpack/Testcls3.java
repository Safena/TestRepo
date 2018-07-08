package Testpack;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Testcls3 {

    @Test
	public void Tc1()
	{
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		WebElement e1 =driver.findElement(By.xpath("//*[@class='nav-a nav-a-2']/span[contains(text(),'Your Orders')]"));
		e1.click();
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		driver.quit();
	}

}
