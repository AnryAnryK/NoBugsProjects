package dz_skrining;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task3ui {

//	покрыть автотестами страницу логина: https://www.saucedemo.com/

	private static WebDriver driver;
	WebElement element;

	@BeforeEach
	public void setUp() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/");
	}

	@AfterAll
	public static void teardown(){
		driver.quit();
	}

	@Test
	public void loginStandard_userTest() {
		driver.findElement(By.xpath((".//*[@id='user-name']"))).sendKeys("standard_user");
		driver.findElement(By.xpath((".//*[@id='password']"))).sendKeys("secret_sauce");
		driver.findElement(By.xpath((".//*[@id='login-button']"))).click();
	}

	@Test
	public void loginStandard_userNegativeTest() {
		driver.findElement(By.xpath((".//*[@id='user-name']"))).sendKeys("standard_user1");
		driver.findElement(By.xpath((".//*[@id='password']"))).sendKeys("secret_sauce1");
		driver.findElement(By.xpath((".//*[@id='login-button']"))).click();
		driver.findElement(By.xpath((".//*[@class='error-message-container error']"))).isDisplayed();
	}


	@Test
	public void loginLocked_out_userTest() {
		driver.findElement(By.xpath((".//*[@id='user-name']"))).sendKeys("locked_out_user");
		driver.findElement(By.xpath((".//*[@id='password']"))).sendKeys("secret_sauce");
		driver.findElement(By.xpath((".//*[@id='login-button']"))).click();
		driver.findElement(By.xpath((".//*[@class='error-message-container error']"))).isDisplayed();
	}

	@Test
	public void loginProblem_userTest() {
		driver.findElement(By.xpath((".//*[@id='user-name']"))).sendKeys("problem_user");
		driver.findElement(By.xpath((".//*[@id='password']"))).sendKeys("secret_sauce");
		driver.findElement(By.xpath((".//*[@id='login-button']"))).click();
	}

	@Test
	public void loginPerformance_glitch_userTest() {
		driver.findElement(By.xpath((".//*[@id='user-name']"))).sendKeys("performance_glitch_user");
		driver.findElement(By.xpath((".//*[@id='password']"))).sendKeys("secret_sauce");
		driver.findElement(By.xpath((".//*[@id='login-button']"))).click();
	}

	@Test
	public void loginError_userTest() {
		driver.findElement(By.xpath((".//*[@id='user-name']"))).sendKeys("error_user");
		driver.findElement(By.xpath((".//*[@id='password']"))).sendKeys("secret_sauce");
		driver.findElement(By.xpath((".//*[@id='login-button']"))).click();
	}

	@Test
	public void loginVisual_userTest() {
		driver.findElement(By.xpath((".//*[@id='user-name']"))).sendKeys("visual_user");
		driver.findElement(By.xpath((".//*[@id='password']"))).sendKeys("secret_sauce");
		driver.findElement(By.xpath((".//*[@id='login-button']"))).click();
	}
}
