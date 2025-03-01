package com.ShoppersStack_TestScripts;

import java.io.IOException;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Test;

import com.ShoppersStack_GenericUtility.Base_Test;
import com.ShoppersStack_POM.MyAddresses_Page;
import com.ShoppersStack_POM.MyProfile_Page;

public class TC_002_Verify_user_is_able_to_delete_address_or_not_Test extends Base_Test {

	@Test
	public void deleteAddress() throws InterruptedException, IOException {

		homePage.getAccountSettings().click();
		homePage.getMyProfileBtn().click();

		MyProfile_Page myProfilePage = new MyProfile_Page(driver);
		myProfilePage.getMyAddressesBtn().click();

		MyAddresses_Page myAddressesPage = new MyAddresses_Page(driver);
		Thread.sleep(2000);
		myAddressesPage.getDeleteBtn().click();
		Thread.sleep(2000);
		myAddressesPage.getYesBtn().click();

		wait.until(ExpectedConditions.alertIsPresent());
		driver.switchTo().alert().accept();

		Thread.sleep(2000);
		webdriverUtility.getWebPageScreenShot(driver);

	}

}
