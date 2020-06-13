package com.br.treinamentoJenkins.step;

import org.junit.Assert;

import com.br.treinamentoJenkins.Funcionalidade;

import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Entao;
import cucumber.api.java.pt.Quando;

public class StepDefinition {
	
	//Funcionalidade func = new Funcionalidade();
	
	
	@Dado("^que estou na pagina inicial da google$")
	public void que_estou_na_pagina_inicial_da_google() throws Throwable {
		System.out.println("teste");
	}

	@Quando("^realizo uma busca por \"(.*?)\"$")
	public void realizo_uma_busca_por(String arg1) throws Throwable {
		System.out.println("teste");
	}

	@Entao("^deve ser apresentado itens relacionados$")
	public void deve_ser_apresentado_itens_relacionados() throws Throwable {
		System.out.println("teste");
		//Assert.assertTrue(func.validarRetornoPesquisa());
	}

}
