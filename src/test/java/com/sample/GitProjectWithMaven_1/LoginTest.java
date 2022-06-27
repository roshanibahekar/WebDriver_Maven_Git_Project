package com.sample.GitProjectWithMaven_1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class LoginTest {
	public static WebDriver driver;

	@BeforeTest
	public void setUp() {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium_Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		// System.out.println("Launching Browser");
	}

	@Test
	public void doLogin() {

		System.out.println("Executing Login Test");
		driver.get("https://www.facebook.com/login/");

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		driver.findElement(By.cssSelector("#email")).sendKeys("roshanibahekar@gmail.com");

		driver.findElement(By.cssSelector("#pass")).sendKeys("qwerty");

		driver.findElement(By.cssSelector("#loginbutton")).click();

	}

	@AfterTest
	public void QuitDriver() {
		if (driver != null)
			driver.close();

	}
}