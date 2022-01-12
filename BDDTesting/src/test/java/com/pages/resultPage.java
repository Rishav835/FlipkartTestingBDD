package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.driverSetup.driverSetup;

public class resultPage extends driverSetup {

	@FindBy(xpath = "//*[@class = '_10Ermr']/span")
	WebElement check;

	@FindBy(xpath = "//*[@class='_3uDYxP' and @class='_3uDYxP']")
	WebElement priceList;

	@FindBy(xpath = "//body/div[@id='container']/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/section[2]/div[4]/div[3]/select[1]/option[4]")
	WebElement select;

	@FindBy(xpath = "//body/div[@id='container']/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/section[22]/div[1]")
	WebElement operatingSystem;

	@FindBy(xpath = "//body/div[@id='container']/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/section[22]/div[2]/div[1]/div[1]/div[1]/label[1]/div[1]")
	WebElement selectOS;

	@FindBy(xpath = "//div[contains(text(),'Newest First')]")
	WebElement newstFirst;
	//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

	public resultPage() throws Exception {
		PageFactory.initElements(driver, this);
	}

	public void verfyResult() {
		String result = "mobiles under 15000";

		if (check.getText().equalsIgnoreCase(result))
			System.out.println("The Result got verified");
		else
			System.out.println("No result is not verified");
	}

	public void setPrice() {

		priceList.click();

		select.click();
		
		
		System.out.println("setPrice passed");
	}

	public void setOperatingSystem() {
		WebDriverWait wait = new WebDriverWait(driver, 30);

		wait.until(ExpectedConditions.elementToBeClickable(operatingSystem));

		operatingSystem.click();

		wait.until(ExpectedConditions.elementToBeClickable(selectOS));

		selectOS.click();

		System.out.println("setOperatingSystem passed");

	}

	public void setNewestFirst() throws Exception {

		WebDriverWait wait = new WebDriverWait(driver, 30);

		wait.until(ExpectedConditions.elementToBeClickable(newstFirst));

		Thread.sleep(3000);
		
		newstFirst.click();
		
		System.out.println("setNewestFirst passed");
	}

	public void displayNames() {

		System.out.println("I am here");
		
		for (int i = 2; i >= 7; i++) 
		{
			WebElement name = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[3]/div[1]/div[2]/div[" + i
					+ "]/div[1]/div[1]/div[1]/a[1]/div[2]/div[1]/div[1]"));
			String n = name.getText();
			int p = Integer.parseInt(n);
			System.out.println("Mobile name is " + name.getText());

			if (i == 2) {
				int price = 30000;

				if (p <= price)
					System.out.println("The first mobile price is less than 30000");
			}
		}

//		/html[1]/body[1]/div[1]/div[1]/div[3]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/a[1]/div[2]/div[1]/div[1]
//		/html[1]/body[1]/div[1]/div[1]/div[3]/div[1]/div[2]/div[3]/div[1]/div[1]/div[1]/a[1]/div[2]/div[1]/div[1]
//		/html[1]/body[1]/div[1]/div[1]/div[3]/div[1]/div[2]/div[4]/div[1]/div[1]/div[1]/a[1]/div[2]/div[1]/div[1]
	}

}
