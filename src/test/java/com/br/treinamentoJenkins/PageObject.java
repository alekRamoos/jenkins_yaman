package com.br.treinamentoJenkins;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PageObject {
	
	public PageObject(WebDriver driver) {
		PageFactory.initElements(driver,  this);
	}
	
	@FindBy(xpath = "//input[@name='q']")
    private WebElement searchBox;
	
	@FindBy(xpath = "//div[@class='FPdoLc tfB0Bf']//input[@name='btnK']")
    private WebElement buttonPesquisar;
	
	@FindBy(xpath = "//div[@class='a4bIc']//input[@name='q']")
    private WebElement campoAposPesquisa;
	
	

	
	
	
	public WebElement getSearchBox() {
		return searchBox;
	}
	
	public WebElement getButtonPesquisar() {
		return buttonPesquisar;
	}
	
	public WebElement getcampoAposPesquisa() {
		return campoAposPesquisa;
	}

}
