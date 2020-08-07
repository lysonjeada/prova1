package br.com.contmatic.empresa;
public class Empresa {

    private String nome;
    private String cnpj;
    private Endereco endereco;                                                                                                                                                                                                                                                                                                                                                                                                                            
    
    public Empresa () {
    	
    }
	public Empresa (String cnpj, String nome, Endereco endereco) {
    	this.cnpj = cnpj;
    	this.nome = nome;
    	this.endereco = endereco;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getCnpj() {
        return cnpj;
    }
    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }
    public Endereco getEndereco() {
		return endereco;
	}
    public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
  
}