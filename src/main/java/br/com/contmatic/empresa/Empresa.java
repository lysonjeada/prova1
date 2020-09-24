package br.com.contmatic.empresa;

import br.com.contmatic.empresa.util.*;

import java.sql.Timestamp;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.time.format.ResolverStyle;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Locale;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

import br.com.contmatic.empresa.util.*;

public class Empresa {
	
	private String nome;
	
	private String nomeFantasia;
	
	private String cnpj;
	
	private String tipo;
	
	private String porte;
	
	private String situacaoCadastral;
	
	private LocalDate dataDeCriacao;
	
	private String telefone;
	
	private String email;
	
	private String situacaoEspecial;
	
	private List<Funcionario> funcionarios;
	
	private List <Endereco> enderecos;

	public Empresa(String cnpj) {
		this.setCnpj(cnpj);
	}

	public String getNomeFantasia() {
		return nomeFantasia;
	}

	public void setNomeFantasia(String nomeFantasia) {
		if (nomeFantasia.length() > 50 ) {
			throw new IllegalArgumentException("O nome fantasia da empresa não pode ter mais que 50 caracteres.");
		} else if (nomeFantasia.length() < 0){
			throw new IllegalArgumentException("O nome fantasia da empresa não pode ter menos de 0 caracteres.");
		} else if (nomeFantasia.isEmpty()) {
			throw new IllegalArgumentException("O nome fantasia da empresa não pode ser nulo.");
		} else if (nomeFantasia.equals(null))
			throw new IllegalArgumentException("A situaçaõ cadastral da empresa não pode ser nula.");
		{
			
		}
		this.nomeFantasia = nomeFantasia;
	}

	public String getSituacaoCadastral() {
		return situacaoCadastral;
	}

	public void setSituacaoCadastral(String situacaoCadastral) {
		if (situacaoCadastral.length() > 9 ) {
			throw new IllegalArgumentException("A situação cadastral da empresa não pode ter mais que 9 caracteres.");
		} else if (situacaoCadastral.equals(null)){
			throw new IllegalArgumentException("A situação cadastral da empresa não pode ser nulo.");
		} else if (situacaoCadastral.isEmpty()) {
			throw new IllegalArgumentException("A situaçaõ cadastral da empresa não pode ser vazio.");
		}
		this.situacaoCadastral = situacaoCadastral;
	}

	
	
	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		if (telefone.length() > 9) {
			throw new IllegalArgumentException("O telefone da empresa não pode ter mais que 9 caracteres.");
		} else if (telefone.length() < 0) {
			throw new IllegalArgumentException("O telefone da empresa não pode ter menos de 0 caracteres.");
		} else if (telefone.isEmpty()) {
			throw new IllegalArgumentException("O telefone da empresa não pode ser vazio.");
		} else if (telefone.equals(null)) {
			throw new IllegalArgumentException("O telefone da empresa não pode ser nulo.");
		}
		this.telefone = telefone;
	}

	public String getPorteDaEmpresa() {
		return porte;
	}

	public void setPorteDaEmpresa(String porteDaEmpresa) {
		if (porteDaEmpresa.length() > 7 ) {
			throw new IllegalArgumentException("O porte da empresa não pode ter mais que 7 caracteres.");
		} else if (porteDaEmpresa.length() < 0){
			throw new IllegalArgumentException("O porte da empresa não pode ter menos de 0 caracteres.");
		} else if (porteDaEmpresa.isEmpty()) {
			throw new IllegalArgumentException("O porte da empresa não pode ser vazio.");
		}
		else if (porteDaEmpresa.equals(null)){
			throw new IllegalArgumentException("O porte da da empresa não pode ser nulo.");
		}
		this.porte = porteDaEmpresa;
	}

	public String getTipoDeEmpresa() {
		return tipo;
	}

	public void setTipoDeEmpresa(String tipoDeEmpresa) {
		if (tipoDeEmpresa.length() > 9 ) {
			throw new IllegalArgumentException("O tipo da empresa não pode ter mais que 9 caracteres.");
		} else if (tipoDeEmpresa.length() < 0){
			throw new IllegalArgumentException("O tipo da empresa não pode ter menos de 0 caracteres.");
		} else if (tipoDeEmpresa.isEmpty()) {
			throw new IllegalArgumentException("O tipo da empresa não pode ser vazio.");
		}
		else if (tipoDeEmpresa.equals(null)){
			throw new IllegalArgumentException("O tipo da empresa não pode ser nulo.");
		}
		this.tipo = tipoDeEmpresa;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		if (nome.length() > 9 ) {
			throw new IllegalArgumentException("O nome da empresa não pode ter mais que 9 caracteres.");
		} else if (nome.length() < 0){
			throw new IllegalArgumentException("O nome da empresa não pode ter menos de 0 caracteres.");
		} else if (nome.isEmpty()) {
			throw new IllegalArgumentException("O nome da empresa não pode ser vazio.");
		}
		else if (nome.equals(null)){
			throw new IllegalArgumentException("O nome da empresa não pode ser nulo.");
		}
		this.nome = nome;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		ValidaCNPJ.naoNulo(cnpj);
		ValidaCNPJ.soContemNumeros(cnpj);
		ValidaCNPJ.tamanhoDoCNPJ(cnpj);
		ValidaCNPJ.recebeErroFormadoPorNumerosIguais(cnpj);
		ValidaCNPJ.validaDigitos(cnpj);
		this.cnpj = cnpj;
	}

	public List<Funcionario> getFuncionarios() {
		return funcionarios;
	}
	
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		if (email.length() > 50 ) {
			throw new IllegalArgumentException("O email da empresa não pode ter mais que 50 caracteres.");
		} else if (email.length() < 10){
			throw new IllegalArgumentException("O email da empresa não pode ter menos de 10 caracteres.");
		} else if (email.isEmpty()) {
			throw new IllegalArgumentException("O telefone da empresa não pode ser nulo.");
		} else if (email.equals(null)) {
			throw new IllegalArgumentException("O email da empresa não pode ser nulo.");
		}
		this.email = email;
	}

	public String getSituacaoEspecial() {
		return situacaoEspecial;
	}

	public void setSituacaoEspecial(String situacaoEspecial) {
		if (situacaoEspecial.length() > 9 ) {
			throw new IllegalArgumentException("A situação especial da empresa não pode ter mais que 9 caracteres.");
		} else if (situacaoEspecial.length() < 0){
			throw new IllegalArgumentException("A situação especial da empresa não pode ter menos de 0 caracteres.");
		} else if (situacaoEspecial.isEmpty()) {
			throw new IllegalArgumentException("A situação especial da empresa não pode ser vazio.");
		} else if (situacaoEspecial.equals(null)) {
			throw new IllegalArgumentException("A situação especial da empresa não pode ser nulo.");
		}
		this.situacaoEspecial = situacaoEspecial;
	}
	
	public LocalDate getDataDeCriacao() {
		return dataDeCriacao;
	}

	public void setDataDeCriacao(LocalDate dataDeCriacao) {
		if (dataDeCriacao.isAfter(LocalDate.now())) {
			throw new IllegalArgumentException("A data de criação da empresa não pode ser futura.");
		} else if (dataDeCriacao.equals(null)) {
			throw new IllegalArgumentException("A data de criação da empresa não pode ser nula.");
		}
		this.dataDeCriacao = dataDeCriacao;
	}

	public List <Endereco> getEnderecos() {
		return enderecos;
	}

	public void setEnderecos(List <Endereco> enderecos) {
		if (enderecos.equals(null)) {
			throw new IllegalArgumentException("A lista de endereços da empresa não pode ser nula.");
		} else if (enderecos.isEmpty()) {
			throw new IllegalArgumentException("A lista de endereços da empresa não pode ser vazia.");
		}
	}

	public void setFuncionarios(List<Funcionario> funcionarios) {
		if (funcionarios.equals(null)) {
			throw new IllegalArgumentException("A lista de funcionarios da empresa não pode ser nula.");
		} else if (funcionarios.isEmpty()) {
			throw new IllegalArgumentException("A lista de funcionarios da empresa não pode ser vazia.");
		} else if (funcionarios.size() < 2) {
			throw new IllegalArgumentException("A lista de funcionarios da empresa não pode ter menos que 2 funcionários.");
		}
		this.funcionarios = funcionarios;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((cnpj == null) ? 0 : cnpj.hashCode());
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
		Empresa other = (Empresa) obj;
		if (cnpj == null) {
			if (other.cnpj != null)
				return false;
		} else if (!cnpj.equals(other.cnpj))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Empresa [nome=" + nome + ", cnpj=" + cnpj + ", tipoDeEmpresa=" + tipo + ", porteDaEmpresa="
				+ porte + ", funcionarios=" + funcionarios + "]";
	}

	
	

}