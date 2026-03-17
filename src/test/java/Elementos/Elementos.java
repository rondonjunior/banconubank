package Elementos;

import org.openqa.selenium.By;

public class Elementos {
	
	private By BtnCookies = By.id("onetrust-accept-btn-handler");
	private By BtnQuerosernubank = By.xpath("//button[@aria-label=\"Quero ser Nubank\"]");
	private By CampoNome = By.id("name");
	private By CampoTelefone = By.name("phone");
	private By CampoEmail = By.id("email");
	private By CampoConfirmaEmail = By.id("emailConfirmation");
	private By CampoCpf = By.xpath("//input[@aria-label='CPF']");
	private By Campodatanasc = By.id("dataNascimento");
	private By Campodeaceite = By.xpath("//span[@class=\"chakra-checkbox__control css-17p8c1m\"]");
	private By BtnContinuar = By.xpath("//button[@aria-label=\"Enviar\"]");
	
	public By getBtnCookies() {
		return BtnCookies;
	}

	public By getBtnQuerosernubank() {
		return BtnQuerosernubank;
	}

	public By getCampoNome() {
		return CampoNome;
	}

	public By getCampoTelefone() {
		return CampoTelefone;
	}

	public By getCampoCpf() {
		return CampoCpf;
	}

	public By getCampodeaceite() {
		return Campodeaceite;
	}

	public By getCampoEmail() {
		return CampoEmail;
	}
	public By getCampoConfirmaEmail() {
		return CampoConfirmaEmail;
	}

	public By getCampodatanasc() {
		return Campodatanasc;
	}

	public By getBtnContinuar() {
		return BtnContinuar;
	}


	
}
	

