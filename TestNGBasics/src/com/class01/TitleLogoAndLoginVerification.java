package com.class01;

import org.openqa.selenium.By;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.utils.CommonMethods;
import com.utils.Constants;

public class TitleLogoAndLoginVerification extends CommonMethods{

	@BeforeMethod
	public void openAndNavigate() {
		setUp("chrome", Constants.HRMS_URL);
	}
	@AfterMethod
	public void closeBrowser() {
		driver.quit();
	}
	@Test
	public void titleValidation() {
		String expectedTitle="Human Management System";
		String actualTitle=driver.getTitle();
		if(actualTitle.equals(expectedTitle)) {
			System.out.println("test pass");
		}else {
			System.out.println("test failed");
		}
	}
	@Test
	public void logoValidation() {
		boolean isDisplayed = driver.findElement(By.xpath("//div[@id='divLogo']/img")).isDisplayed();
		if(isDisplayed) {
			System.out.println("test pass");
		}else {
			System.out.println("test failed");
		}
	}
	@Test
	public void validLogin() {
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("Syntax@123");
		driver.findElement(By.id("btnLogin")).click();
	}
}
