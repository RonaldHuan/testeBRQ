package com.testautomation.StepDef;

import com.testautomation.LogicDef.compraLogicDef;

import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Entao;
import cucumber.api.java.pt.Quando;

public class compraStepDef {
	private compraLogicDef logic = new compraLogicDef();
	
	
	@Dado("^que abro o navegador e acesso o site$")
	public void abrirNavegador() throws Throwable{
		logic.abrirNavegador();
	}
	
	@Quando("^realizo compra$")
	public void realizarCompra() throws Throwable{
		logic.realizarCompra();
		logic.realizarCadastro();
	}
	
	@Entao("^valido compra efetuada$")
	public void validarCompra() throws Throwable{
		logic.validarCompra();
	}
	
}
