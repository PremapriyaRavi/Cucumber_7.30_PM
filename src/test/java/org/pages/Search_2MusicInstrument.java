package org.pages;

import org.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Search_2MusicInstrument extends BaseClass {
 public Search_2MusicInstrument() {
	 PageFactory.initElements(driver, this);
 }
 @FindBy(xpath="//a[text()='All Categories']")
 private WebElement allCategories;
 @FindBy(xpath="//ul[@class='select-options']//li[14]")
 private WebElement selProduct;
 @FindBy(id="key")
private WebElement txtEnter;
 @FindBy(id="search_btn")
 private WebElement searchBtn;
 @FindBy(xpath="//div[@class='allproduct_lis']//li")
private WebElement lst_product;
public WebElement getAllCategories() {
	return allCategories;
}
public WebElement getSelProduct() {
	return selProduct;
}
public WebElement getTxtEnter() {
	return txtEnter;
}
public WebElement getLst_product() {
	return lst_product;
}
public WebElement getSearchBtn() {
	return searchBtn;
}
 
}
