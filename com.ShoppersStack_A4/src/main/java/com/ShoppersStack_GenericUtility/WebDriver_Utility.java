package com.ShoppersStack_GenericUtility;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;

public class WebDriver_Utility {
	
	Java_Utility javaUtility=new Java_Utility();

	public void getWebPageScreenShot(WebDriver driver) throws IOException {

		TakesScreenshot ts = (TakesScreenshot) driver;
		File temp = ts.getScreenshotAs(OutputType.FILE);
		File dest = new File(FrameWorkConstants.screenshotPath+javaUtility.getLocalDateAndTime()+".png");
		FileHandler.copy(temp, dest);

	}

	public void getWebElementScreenShot(WebElement element) throws IOException {

		File temp = element.getScreenshotAs(OutputType.FILE);
		File dest = new File(FrameWorkConstants.screenshotPath+javaUtility.getLocalDateAndTime()+".png");
		FileHandler.copy(temp, dest);

	}

	public void selectByValue(WebElement element, String value) {

		Select sel = new Select(element);
		sel.selectByValue(value);

	}

	public void actionsScrollToElement(WebDriver driver, WebElement element) {

		Actions act = new Actions(driver);
		act.scrollToElement(element).perform();

	}

	public void javascriptClick(WebDriver driver, WebElement element) {

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", element);

	}

}
