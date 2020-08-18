package br.com.contmatic.empresa;

import java.util.ArrayList;
import java.util.List;

public class Empresa {

	private String nome;
	private String cnpj;
	private Endereco endereco;
	private String listaDeFuncionarios; // lista de funcionário 
	private String tipoDeEmpresa; // enum
	private String porteDaEmpresa;

	List<ListaDeFuncionarios> lista_DeFuncionarios = new ArrayList<ListaDeFuncionarios>();
	
	
	public String getPorteDaEmpresa() {
		return porteDaEmpresa;
	}

	public void setPorteDaEmpresa(String porteDaEmpresa) {
		this.porteDaEmpresa = porteDaEmpresa;
	}

	public String getListaDeFuncionarios() {
		return listaDeFuncionarios;
	}

	public void setListaDeFuncionarios(String listaDeFuncionarios) {
		this.listaDeFuncionarios = listaDeFuncionarios;
	}

	public String getTipoDeEmpresa() {
		return tipoDeEmpresa;
	}

	public void setTipoDeEmpresa(String tipoDeEmpresa) {
		this.tipoDeEmpresa = tipoDeEmpresa;
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

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((cnpj == null) ? 0 : cnpj.hashCode());
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
		Empresa other = (Empresa) obj;
		if (cnpj == null) {
			if (other.cnpj != null)
				return false;
		} else if (!cnpj.equals(other.cnpj))
			return false;
		return true;
	}

}