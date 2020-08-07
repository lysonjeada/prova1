package br.com.contmatic.empresa;

public class Endereco {

//	public Endereco(String cep) {
//		// TODO Auto-generated constructor stub
//	}
//
//	//public void setLocal(String rua, int numero, String cidade, String pais) {
//		// TODO Auto-generated method stub
//		
//	//}
	private String cep;
	public String getCep() {
		return cep;
	}
	public void setCep(String cep) {
		this.cep = cep;
	}
	public String getRua() {
		return rua;
	}
	public void setRua(String rua) {
		this.rua = rua;
	}
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	public String getCidade() {
		return cidade;
	}
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	public String getPais() {
		return pais;
	}
	public void setPais(String pais) {
		this.pais = pais;
	}
	private String rua;
	private String numero;
	private String cidade;
	private String pais;
	
	

}
