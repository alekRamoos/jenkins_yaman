package com.br.treinamentoJenkins;

import junit.framework.Assert;

public class Funcionalidade extends utils{

	
	private PageObject page = new PageObject(driver);
	
	
	

	public void buscaGoogle(String busca) {
		
		page.getSearchBox().sendKeys(busca);
		page.getButtonPesquisar().click();
	}
	
	
	public Boolean validarRetornoPesquisa() {
		try {
			String validacao = page.getcampoAposPesquisa().getText();
			Assert.assertEquals("", validacao);
		} catch (Exception e) {
		    return false;
		}
		return true;
	}
	
}
