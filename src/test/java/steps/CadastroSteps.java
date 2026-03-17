package steps;

import static org.junit.Assert.assertTrue;

import java.util.List;

import db.PessoaDAO;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import Tabelas.Pessoa;
import pages.CadastroPage;
import support.Hooks;

public class CadastroSteps extends Hooks {

    private CadastroPage cadastroPage;
    private Pessoa pessoa;

    @Given("que acesso o banco {string}")
    public void queAcessoOBanco(String url) throws InterruptedException {
        abrirnavegador(url);
        cadastroPage = new CadastroPage(driver);
        pausa(2000);
    }

    @When("seleciono o botão Quero ser Nubank")
    public void selecionoOBotaoQueroSerNubank() throws InterruptedException {
        
        clicar(cadastroPage.getBtnQuerosernubank());
        pausa(2000);
    }

    @And("preencho o formulario com pessoas vindas do banco de dados")
    public void preenchoOFormularioComPessoasVindasDoBancoDeDados() throws InterruptedException {
        PessoaDAO dao = new PessoaDAO();
        List<Pessoa> pessoas = dao.buscarPessoas();

        if (pessoas.isEmpty()) {
            throw new RuntimeException("Nenhuma pessoa encontrada na tabela PESSOA.");
        }

        pessoa = pessoas.get(0);

        escrever(cadastroPage.getCampoCpf(), pessoa.getCpf());
        pausa(1000);
        
        escrever(cadastroPage.getCampoNome(), pessoa.getNome());
        pausa(1000);

        escrever(cadastroPage.getCampoTelefone(), pessoa.getCelular());
        pausa(1000);

        escrever(cadastroPage.getCampoEmail(), pessoa.getEmail());
        pausa(1000);

        escrever(cadastroPage.getCampoConfirmaEmail(), pessoa.getConfirmaEmail());
        pausa(1000);

    }

    @And("seleciono o checkbox de termos de aceite")
    public void selecionoOCheckboxDeTermosDeAceite() throws InterruptedException {
        clicar(cadastroPage.getCampodeaceite());
        pausa(2000);
    }

    @Then("o botão de continuar deve estar habilitado")
    public void oBotaoDeContinuarDeveEstarHabilitado() {
        boolean botaoHabilitado = driver.findElement(cadastroPage.getBtnContinuar()).isEnabled();
        assertTrue("O botão continuar não está habilitado.", botaoHabilitado);
    }
}