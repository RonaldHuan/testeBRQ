package com.testautomation.LogicDef;

import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import com.testautomation.PageDef.compraPageDef;
import com.testautomation.Utility.PropertiesFileReader;

public class compraLogicDef {
	
	PropertiesFileReader objeto = new PropertiesFileReader();
	private compraPageDef page = new compraPageDef();
	
	private WebDriver driver;
	String key = "webdriver.chrome.driver";
	String value = "C:\\Users\\ronald.pereira\\chrome\\chromeDriver80\\chromedriver.exe";
	
	public void abrirNavegador() throws IOException {
		System.out.println("<------------------------ INICIANDO TESTE ------------------------>");
		Properties properties = objeto.getProperty();
		System.setProperty(key, value);
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(properties.getProperty("browser.baseURL"));
	}
	
	public void realizarCompra() {
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("scrollBy(0,800)", "");
		driver.findElement(page.getContainerImg).click();
		WebElement btnAddToCar = (new WebDriverWait(driver, 10)).until(ExpectedConditions.elementToBeClickable(page.getBtnAddToCart));
		btnAddToCar.click();
		WebElement btnCheckout = (new WebDriverWait(driver, 10)).until(ExpectedConditions.elementToBeClickable(page.getBtnCheckout));
		btnCheckout.click();
		if(driver.findElement(page.getLblQtdCarrinho).isDisplayed()) {
			System.out.println(">>> CARRINHO POSSUI ITEM ADICIONADOS");
			jse.executeScript("scrollBy(0,500)", "");
			WebElement btnCheckout_2 = (new WebDriverWait(driver, 10)).until(ExpectedConditions.elementToBeClickable(page.getBtnCheckout_2));
			btnCheckout_2.click();
			jse.executeScript("scrollBy(0,500)", "");
			WebElement preencheEmail = driver.findElement(page.getCampoEmail);
			preencheEmail.sendKeys("ronaldtest11@gmail.com");
			driver.findElement(page.getBtnCreateAccount).click();
		}else {
			System.out.println(">>> CARRINHO NÃO POSSUI NENHUM ITEM");
			Assert.assertTrue(false);
		}
	}
	
	public void realizarCadastro() {
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		WebElement radioMr = (new WebDriverWait(driver, 10)).until(ExpectedConditions.elementToBeClickable(page.getRadioMr));
		radioMr.click();
		WebElement preenchePrimeiroNome = driver.findElement(page.getPrimeiroNome);
		preenchePrimeiroNome.sendKeys("ronald");
		WebElement preencheSegundoNome = driver.findElement(page.getSegundoNome);
		preencheSegundoNome.sendKeys("huan");
		WebElement preencheSenha = driver.findElement(page.getCampoSenha);
		preencheSenha.sendKeys("12345678");
		driver.findElement(page.getCampoDia).sendKeys("5");
		driver.findElement(page.getCampoMes).sendKeys("September");
		driver.findElement(page.getCampoAno).sendKeys("1999");
		driver.findElement(page.getPrimeiroCheckBox).click();
		driver.findElement(page.getSegundoCheckBox).click();
		jse.executeScript("scrollBy(0,600)", "");
		driver.findElement(page.getCampoEndereco).sendKeys("FRANKLIN ST.");
		driver.findElement(page.getCampoCidade).sendKeys("Geneva");
		driver.findElement(page.getSeletorEstado).sendKeys("New York");
		driver.findElement(page.getCampoCodigoPostal).sendKeys("14456");
		jse.executeScript("scrollBy(0,500)", "");
		driver.findElement(page.getCampoTelefoneCelular).sendKeys("11999994738");
		driver.findElement(page.getBtnRegistrar).click();
		jse.executeScript("scrollBy(0,800)", "");
		driver.findElement(page.getBtnCheckout_3).click();
		jse.executeScript("scrollBy(0,600)", "");
		driver.findElement(page.getTerceiroCheckBox).click();
		driver.findElement(page.getBtnCheckout_4).click();
		jse.executeScript("scrollBy(0,600)", "");
		driver.findElement(page.getBtnTransferenciaBancaria).click();
		jse.executeScript("scrollBy(0,800)", "");
		driver.findElement(page.getBtnConfirmacao).click();
		jse.executeScript("scrollBy(0,300)", "");
	}
	
	public void validarCompra() throws InterruptedException {
		System.out.println(">>> COMPRA EFETUADA COM SUCESSO!");
		Assert.assertTrue(driver.findElement(page.getLblValidacao).isDisplayed());
	}
}

