package com.ShoppersStack_POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddressForm_Page {

	public AddressForm_Page(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "Office")
	private WebElement officeRBtn;

	@FindBy(id = "Name")
	private WebElement nameTextField;

	@FindBy(id = "House/Office Info")
	private WebElement officeTextField;

	@FindBy(id = "Street Info")
	private WebElement streetTextField;

	@FindBy(id = "Landmark")
	private WebElement landMarkTextField;

	@FindBy(id = "Country")
	private WebElement countryDD;

	@FindBy(id = "State")
	private WebElement stateDD;

	@FindBy(id = "City")
	private WebElement cityDD;

	@FindBy(id = "Pincode")
	private WebElement pincodeTextField;

	@FindBy(id = "Phone Number")
	private WebElement phoneNumberTextField;

	@FindBy(id = "addAddress")
	private WebElement addAddressBtn;

	public WebElement getOfficeRBtn() {
		return officeRBtn;
	}

	public WebElement getNameTextField() {
		return nameTextField;
	}

	public WebElement getOfficeTextField() {
		return officeTextField;
	}

	public WebElement getStreetTextField() {
		return streetTextField;
	}

	public WebElement getLandMarkTextField() {
		return landMarkTextField;
	}

	public WebElement getCountryDD() {
		return countryDD;
	}

	public WebElement getStateDD() {
		return stateDD;
	}

	public WebElement getCityDD() {
		return cityDD;
	}

	public WebElement getPincodeTextField() {
		return pincodeTextField;
	}

	public WebElement getPhoneNumberTextField() {
		return phoneNumberTextField;
	}

	public WebElement getAddAddressBtn() {
		return addAddressBtn;
	}

}
