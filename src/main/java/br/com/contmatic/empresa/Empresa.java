package br.com.contmatic.empresa;

public class Empresa {

	private String nome;
	private String cnpj;
	private Endereco endereco;
	private String quantidadeDeFuncionarios;
	private String tipoDeEmpresa;

	public String getQuantidadeDeFuncionarios() {
		return quantidadeDeFuncionarios;
	}

	public void setQuantidadeDeFuncionarios(String quantidadeDeFuncionarios) {
		this.quantidadeDeFuncionarios = quantidadeDeFuncionarios;
	}

	public String getTipoDeEmpresa() {
		return tipoDeEmpresa;
	}

	public void setTipoDeEmpresa(String tipoDeEmpresa) {
		this.tipoDeEmpresa = tipoDeEmpresa;
	}

	public Empresa(String string, String string2, Object object, String string4, String string5) {

	}

	public Empresa(String cnpj, String nome, Endereco endereco) {
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