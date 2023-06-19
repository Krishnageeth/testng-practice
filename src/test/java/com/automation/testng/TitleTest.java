package com.automation.testng;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TitleTest {
	@Test
	public void verifyGoogleTitle() {
		WebDriverManager.chromedriver().setup();
		WebDriver webDriver = new ChromeDriver();
		webDriver.manage().window().maximize();
		webDriver.get("https://www.google.com");
		String title = webDriver.getTitle();
		assertEquals("Google", title);
		webDriver.close();
	}

	@Test
	public void verifyFacebokTitle() {
		WebDriverManager.chromedriver().setup();
		WebDriver webDriver = new ChromeDriver();
		webDriver.manage().window().maximize();
		webDriver.get("https://www.facebook.com");
		String title = webDriver.getTitle();
		assertEquals("Facebook – log in or sign up", title);
		webDriver.close();
	}

	@Test
	public void verifyAlphabet() {
		WebDriverManager.chromedriver().setup();
		WebDriver webDriver = new ChromeDriver();
		webDriver.manage().window().maximize();
		webDriver.get("https://abc.xyz/");
		String title = webDriver.getTitle();
		assertEquals("Alphabet", title);
		webDriver.close();
	}
}
