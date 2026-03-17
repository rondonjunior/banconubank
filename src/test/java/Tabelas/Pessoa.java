package Tabelas;

public class Pessoa {

	 private int id;
	    private String cpf;
	    private String nome;
	    private String celular;
	    private String email;
	    private String confirmaEmail;

	    public int getId() {
	        return id;
	    }

	    public void setId(int id) {
	        this.id = id;
	    }

	    public String getCpf() {
	        return cpf;
	    }

	    public void setCpf(String cpf) {
	        this.cpf = cpf;
	    }

	    public String getNome() {
	        return nome;
	    }

	    public void setNome(String nome) {
	        this.nome = nome;
	    }

	    public String getCelular() {
	        return celular;
	    }

	    public void setCelular(String celular) {
	        this.celular = celular;
	    }

	    public String getEmail() {
	        return email;
	    }

	    public void setEmail(String email) {
	        this.email = email;
	    }

	    public String getConfirmaEmail() {
	        return confirmaEmail;
	    }

	    public void setConfirmaEmail(String confirmaEmail) {
	        this.confirmaEmail = confirmaEmail;
	    }
	}
