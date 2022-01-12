package com.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.driverSetup.driverSetup;

public class homePage extends driverSetup {
	
	
	@FindBy(name = "q")
	WebElement search;
	
	@FindBy(xpath = "//body/div[@id='container']/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/div[1]/button[1]")
	WebElement searchBtn;
	
	@FindBy(xpath = "//button[@class='_2KpZ6l _2doB4z']")
	WebElement popUpCrossBtn;
	
	
	
	public homePage() throws Exception
	{
		PageFactory.initElements(driver,this);
	}
	
	
	public void openUrl()
	{
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		
		driver.get(p.getProperty("url"));
		
	}
	
	public void handlePopUp()
	{
		WebDriverWait wait = new WebDriverWait(driver, 30);
				
		wait.until(ExpectedConditions.elementToBeClickable(popUpCrossBtn));
		
		popUpCrossBtn.click();
		
				
	}
	
	public resultPage searchTab() throws Exception
	{
		search.sendKeys("mobiles under 15000");
		
		search.sendKeys(Keys.ENTER);
		
		return new resultPage();
	}

}
