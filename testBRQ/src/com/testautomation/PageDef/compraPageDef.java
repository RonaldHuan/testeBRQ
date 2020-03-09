package com.testautomation.PageDef;

import org.openqa.selenium.By;

public class compraPageDef {
	
	public By getContainerImg = By.xpath("//*[@id='homefeatured']/li[1]/div/div[2]/h5/a");
	public By getBtnAddToCart = By.id("add_to_cart");
	public By getBtnCheckout = By.xpath("//*[@id='layer_cart']/div[1]/div[2]/div[4]/a"); 
	public By getBtnCheckout_2 = By.xpath("//*[@id='center_column']/p[2]/a[1]");
	public By getLblQtdCarrinho = By.xpath("//*[@id='header']/div[3]/div/div/div[3]/div/a/span[1]");
	public By getCampoEmail = By.xpath("//*[@id='email_create']");
	public By getBtnCreateAccount = By.xpath("//*[@id='SubmitCreate']");
	public By getRadioMr = By.xpath("//*[@id='account-creation_form']/div[1]/div[1]/div[1]/label");
	public By getPrimeiroNome = By.xpath("//*[@id='customer_firstname']");
	public By getSegundoNome = By.xpath("//*[@id='customer_lastname']");
	public By getCampoSenha = By.id("passwd");
	public By getCampoDia = By.xpath("//*[@id='days']");
	public By getCampoMes = By.id("months");
	public By getCampoAno = By.id("years");
	public By getPrimeiroCheckBox = By.id("newsletter");
	public By getSegundoCheckBox = By.id("optin");
	public By getCampoEndereco = By.id("address1");
	public By getCampoCidade = By.id("city");
	public By getSeletorEstado = By.id("id_state");
	public By getCampoCodigoPostal = By.id("postcode");
	public By getCampoTelefoneCelular = By.id("phone_mobile");
	public By getBtnRegistrar = By.id("submitAccount");
	public By getBtnCheckout_3 = By.xpath("//*[@id='center_column']/form/p/button");
	public By getTerceiroCheckBox = By.id("cgv");
	public By getBtnCheckout_4 = By.xpath("//*[@id='form']/p/button");
	public By getBtnTransferenciaBancaria = By.xpath("//*[@id='HOOK_PAYMENT']/div[1]/div/p");
	public By getBtnConfirmacao = By.xpath("//*[@id='cart_navigation']/button");
	public By getLblValidacao = By.xpath("//*[@id='center_column']/div/p/strong");
}
