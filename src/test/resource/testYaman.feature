#language: pt
#encoding: utf-8
#Author: aleksander-yaman


	Funcionalidade: pesquisa google

  @yamanTest
  Cenario: Validar o retorno da busca
    Dado que estou na pagina inicial da google
    Quando realizo uma busca por "jenkins"
    Entao deve ser apresentado itens relacionados

