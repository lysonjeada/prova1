package br.com.contmatic.empresa;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;


import org.junit.Ignore;
import org.junit.Test;

public class FuncionarioTest {

	
	private Funcionario funcionario;
	@Test
	public void deve_Testar_Funcionario_Nome() {
		Funcionario funcionario = new Funcionario ();
		funcionario.setNome("Raimundo");
		assertEquals("Raimundo", funcionario.getNome());
	}
	@Test
	public void deve_Testar_Funcionario_Idade() {
		Funcionario funcionario = new Funcionario ();
		funcionario.setIdade("22");
		assertEquals("22", funcionario.getIdade());
		
	}
	@Test
	public void deve_Testar_Funcionario_Cpf() {
		Funcionario funcionario = new Funcionario ();
		funcionario.setCpf("654321");
		assertEquals("654321", funcionario.getCpf());
	}
	@Test
	public void deve_Testar_Funcionario_Cargo() {
		Funcionario funcionario = new Funcionario ();
		funcionario.setCargo("Analista");
		assertEquals("Analista", funcionario.getCargo());
	}
	@Test
	public void deve_Testar_Funcionario_TempoNaEmpresa() {
		Funcionario funcionario = new Funcionario ();
		funcionario.setTempoNaEmpresa("3 anos");
		assertEquals("3 anos", funcionario.getTempoNaEmpresa());
	}
	private Funcionario funcionario2;
	@Test
	public void deve_Testar_Funcionario2_Nome() {
		Funcionario funcionario2 = new Funcionario ();
		funcionario2.setNome("Maria");
		assertEquals("Maria", funcionario2.getNome());
	}
	@Test
	public void deve_Testar_Funcionario2_Idade() {
		Funcionario funcionario2 = new Funcionario ();
		funcionario2.setIdade("20");
		assertEquals("20", funcionario2.getIdade());
		
	}
	@Test
	public void deve_Testar_Funcionario2_Cpf() {
		Funcionario funcionario2 = new Funcionario ();
		funcionario2.setCpf("1234567");
		assertEquals("1234567", funcionario2.getCpf());
	}
	@Test
	public void deve_Testar_Funcionario2_Cargo() {
		Funcionario funcionario2 = new Funcionario ();
		funcionario2.setCargo("Estagiária");
		assertEquals("Estagiária", funcionario2.getCargo());
	}
	@Test
	public void deve_Testar_Funcionario2_TempoNaEmpresa() {
		Funcionario funcionario2 = new Funcionario ();
		funcionario2.setTempoNaEmpresa("1 ano");
		assertEquals("1 ano", funcionario2.getTempoNaEmpresa());
	}
	
	

	@Ignore ("Teste desnecessário")
    @Test
    public void deve_Atribuir_OndeTrabalha () {
        Funcionario funcionario = new Funcionario ();
        funcionario.setOndeTrabalha("Contmatic");;

        assertThat(funcionario.getCargo(), is("Contmatic"));
    }
	public Funcionario getFuncionario() {
		return funcionario;
	}
	public void setFuncionario(Funcionario funcionario) {
		this.funcionario = funcionario;
	}
	public Funcionario getFuncionario2() {
		return funcionario2;
	}
	public void setFuncionario2(Funcionario funcionario2) {
		this.funcionario2 = funcionario2;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((funcionario == null) ? 0 : funcionario.hashCode());
		result = prime * result + ((funcionario2 == null) ? 0 : funcionario2.hashCode());
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
		FuncionarioTest other = (FuncionarioTest) obj;
		if (funcionario == null) {
			if (other.funcionario != null)
				return false;
		} else if (!funcionario.equals(other.funcionario))
			return false;
		if (funcionario2 == null) {
			if (other.funcionario2 != null)
				return false;
		} else if (!funcionario2.equals(other.funcionario2))
			return false;
		return true;
	}
	
}
