package br.com.contmatic.empresa;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

public class Funcionario {
	
	private String nome;
	
	private int idade;
	
	private String cpf;
	
	private String cargo;
	
	private LocalDate dataNascimento;

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		if (cpf.length() > 11 || cpf.length() < 11) {
			throw new IllegalArgumentException("O cpf do funcionario não pode ter mais ou menos que 11 caracteres.");
		}  else if (cpf.isEmpty()) {
			throw new IllegalArgumentException("O cpf do funcionario não pode ser vazio");
		} else if (cpf.equals(null)){
			throw new IllegalArgumentException("O cpf do funcionario não pode ser nulo");
		}
		this.cpf = cpf;
	}

	public void setCargo(String cargo) {
		if (nome.length() > 50 ) {
			throw new IllegalArgumentException("O cargo do funcionario não pode ter mais que 50 caracteres.");
		} else if (nome.length() <= 2){
			throw new IllegalArgumentException("O cargo do funcionario tem que ter no mínimo 2 caracteres");
		} else if (nome.isEmpty()) {
			throw new IllegalArgumentException("O cargo do funcionario não pode ser vazio");
		}
		else if (nome.equals(null)){
			throw new IllegalArgumentException("O cargo do funcionario não pode ser nulo");
		}
		this.cargo = cargo;
	}

	public String getCargo() {
		return cargo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		if (nome.length() > 197 ) {
			throw new IllegalArgumentException("O nome do funcionario não pode ter mais que 197 caracteres.");
		} else if (nome.length() <= 2){
			throw new IllegalArgumentException("O nome do funcionario tem que ter no mínimo 2 caracteres");
		} else if (nome.isEmpty()) {
			throw new IllegalArgumentException("O nome do funcionario não pode ser vazio");
		}
		else if (nome.equals(null)){
			throw new IllegalArgumentException("O nome do funcionario não pode ser nulo");
		}
		this.nome = nome;
	}
	
	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		if (idade > 150 ) {
			throw new IllegalArgumentException("A idade não pode ser mais que 150.");
		} else if (idade <= 16){
			throw new IllegalArgumentException("A idade do funcionario tem que ser no minimo 16");
		} 
		this.idade = idade;
	}
	
	public LocalDate getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(LocalDate dataNascimento) {
		if (dataNascimento.isAfter(LocalDate.now())) {
			throw new IllegalArgumentException("A data de criação da empresa não pode ser futura.");
		} 
		this.dataNascimento = dataNascimento;
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
				+ ", tempoNaEmpresa=" + dataNascimento + "]";
	}

	
}
