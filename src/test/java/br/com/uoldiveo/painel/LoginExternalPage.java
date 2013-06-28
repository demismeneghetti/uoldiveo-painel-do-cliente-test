package br.com.uoldiveo.painel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginExternalPage {

	private WebDriver driver;

	public LoginExternalPage(WebDriver driver) {
		this.driver = driver;
	}

	public void loga(String usuario, String senha) {
		
		WebElement txtUsuario = driver.findElement(By.id("username"));
		WebElement txtSenha = driver.findElement(By.id("password"));

		txtUsuario.sendKeys(usuario);
		txtSenha.sendKeys(senha);

		txtSenha.submit();
	}

}