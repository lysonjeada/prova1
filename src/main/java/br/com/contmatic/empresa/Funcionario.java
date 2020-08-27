package br.com.contmatic.empresa;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

public class Funcionario {
	private String nome;
	private String idade;
	private String cpf;
	private String cargo;
	private String date;

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

	public String getCargo() {
		return cargo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getIdade() {
		return idade;
	}

	public void setIdade(String idade) {
		this.idade = idade;
	}

	public boolean equals(Funcionario funcionario) {
		return EqualsBuilder.reflectionEquals(this, funcionario.getCpf());
	}

	public int hashCode(Funcionario funcionario) {
		return HashCodeBuilder.reflectionHashCode(this);
	}

	public String toString(Funcionario funcionario) {
		return ToStringBuilder.reflectionToString(this);
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((cpf == null) ? 0 : cpf.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Funcionario other = (Funcionario) obj;
		if (cpf == null) {
			if (other.cpf != null)
				return false;
		} else if (!cpf.equals(other.cpf))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Funcionario [nome=" + nome + ", idade=" + idade + ", cpf=" + cpf + ", cargo=" + cargo
				+ ", tempoNaEmpresa=" + date + "]";
	}

}
