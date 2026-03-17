import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

class BancoInter {

	//chamei o meu WebDriver que é um código do selenium
	WebDriver driver;
	
	
	@BeforeEach
	void setUp() throws Exception {
		//comando para abrir o navegador escolhido
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		//comando para instanciar meu driver
		driver = new ChromeDriver();
		//comando para acessar um URL
		driver.get("https://www.4devs.com.br/gerador_de_pessoas");
		//comando para maximizar a tela
		driver.manage().window().maximize();
		
		
	}

	@AfterEach
	void tearDown() throws Exception {
		Thread.sleep(10000);
		driver.quit();
		
		
	}

	@Test
	void test() throws InterruptedException {
		//comando para interagir com um elemento
		driver.findElement(By.xpath("//input[@value='Gerar Pessoa']")).click();
		Thread.sleep(5000);
		String Nome = driver.findElement(By.id("nome")).getText();
		String Telefone = driver.findElement(By.id("celular")).getText();
		String Email = driver.findElement(By.id("email")).getText();
		String Cpf = driver.findElement(By.id("cpf")).getText();
		String Data = driver.findElement(By.id("data_nasc")).getText();
		
		driver.get("https://inter.co/");
		//comando para maximizar a tela
		driver.manage().window().maximize();
		driver.findElement(By.id("onetrust-accept-btn-handler")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button")).click();
		Thread.sleep(2000);
		driver.findElement(By.name("nome")).sendKeys(Nome);
		driver.findElement(By.id("celular")).sendKeys(Telefone);
		driver.findElement(By.name("email")).sendKeys(Email);
		driver.findElement(By.name("cpf")).sendKeys(Cpf);
		driver.findElement(By.name("dataNascimento")).sendKeys(Data);
		driver.findElement(By.xpath("(//label)[6]")).click();
		driver.findElement(By.xpath("//button[contains(text(),'Continuar')]")).click();
		
//		String textvalidacao = driver.findElement(By.xpath("(//h2)[8]")).getText();
		
/*		//comando para validação
		assertEquals (("Abra agora sua Conta Digital") , textvalidacao);
		driver.findElement(By.xpath("(//button)[11]")).click();
		Thread.sleep(2000);
		String textvalidacao2 = driver.findElement(By.xpath("//p[normalize-space()='Prontinho! Recebemos os seus dados.']")).getText();
		//comando para validação
		assertEquals (("Prontinho! Recebemos os seus dados.") , textvalidacao2);
		*/
		
		
	}

}
