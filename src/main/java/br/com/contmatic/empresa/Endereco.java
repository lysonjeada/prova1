package br.com.contmatic.empresa;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

public class Endereco {

	private String logradouro;
	
	private Integer numero;
	
	private String cidade;
	
	private String pais;
	
	private String cep;

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	public String getLogradouro() {
		if (logradouro.length() > 9 ) {
			throw new IllegalArgumentException("O logradouro do endereço não pode ter mais que 9 caracteres.");
		} else if (logradouro.length() < 0){
			throw new IllegalArgumentException("O logradouro do endereço não pode ter menos de 0 caracteres");
		} else if (logradouro.isEmpty()) {
			throw new IllegalArgumentException("O logradouro do endereço não pode ser vazio");
		} else if (logradouro.equals(null)) {
			throw new IllegalArgumentException("O logradouro do endereço não pode ser nulo");
		}
		return logradouro;
	}

	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(Integer numero) {
		if (numero > 150 ) {
			throw new IllegalArgumentException("O numero do endereço não pode ser maior que ");
		} else if (numero <= 16){
			throw new IllegalArgumentException("O numero do endereço não pode ser menor que ");
		} else if (numero == 0){
			throw new IllegalArgumentException("O numero do endereço não pode ser nulo");
		}
		this.numero = numero;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		if (cidade.length() > 9 ) {
			throw new IllegalArgumentException("A cidade do endereço não pode ter mais que 9 caracteres.");
		} else if (cidade.length() < 0){
			throw new IllegalArgumentException("A cidade do endereço não pode ter menos de 0 caracteres");
		} else if (cidade.isEmpty()) {
			throw new IllegalArgumentException("A cidade do endereço não pode ser vazio");
		} else if (cidade.equals(null)) {
			throw new IllegalArgumentException("A cidade do endereço não pode ser nulo");
		}
		this.cidade = cidade;
	}

	public String getPais() {		
		return pais;
	}

	public void setPais(String pais) {
		if (pais.length() > 9 ) {
			throw new IllegalArgumentException("O país do endereço não pode ter mais que 9 caracteres.");
		} else if (pais.length() < 0){
			throw new IllegalArgumentException("O país do endereço não pode ter menos de 0 caracteres");
		} else if (pais.isEmpty()) {
			throw new IllegalArgumentException("O país do endereço não pode ser vazio");
		} else if (pais.equals(null)) {
			throw new IllegalArgumentException("O país do endereço não pode ser nulo");
		}
		this.pais = pais;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((cep == null) ? 0 : cep.hashCode());
		result = prime * result + ((numero == null) ? 0 : numero.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (getClass() != obj.getClass())
			return false;
		Endereco other = (Endereco) obj;
		if (cep == null) {
			if (other.cep != null)
				return false;
		} else if (!cep.equals(other.cep))
			return false;
		if (numero == null) {
			if (other.numero != null)
				return false;
		} else if (!numero.equals(other.numero))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Endereco [logradouro=" + logradouro + ", numero=" + numero + ", cidade=" + cidade + ", pais=" + pais
				+ ", cep=" + cep + "]";
	}
}
