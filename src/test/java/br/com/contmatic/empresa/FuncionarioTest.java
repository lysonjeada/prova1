package br.com.contmatic.empresa;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;


import org.junit.Ignore;
import org.junit.Test;

public class FuncionarioTest {

	
	private Funcionario funcionario;
	@Test
	public void deve_testar_Nome() {
		Funcionario funcionario = new Funcionario ();
		funcionario.setNome("Raimundo");
		assertEquals("Raimundo", funcionario.getNome());
	}
	@Test
	public void deve_testar_Idade() {
		Funcionario funcionario = new Funcionario ();
		funcionario.setIdade("22");
		assertEquals("22", funcionario.getIdade());
		
	}
	@Test
	public void deve_testar_Cpf() {
		Funcionario funcionario = new Funcionario ();
		funcionario.setCpf("654321");
		assertEquals("654321", funcionario.getCpf());
	}
	@Test
	public void deve_testar_Cargo() {
		Funcionario funcionario = new Funcionario ();
		funcionario.setCargo("Analista");
		assertEquals("Analista", funcionario.getCargo());
	}
	@Test
	public void deve_testar_TempoNaEmpresa() {
		Funcionario funcionario = new Funcionario ();
		funcionario.setTempoNaEmpresa("3 anos");
		assertEquals("3 anos", funcionario.getTempoNaEmpresa());
	}
	private Funcionario funcionario2;
	@Test
	public void deve_testar_nome2() {
		Funcionario funcionario2 = new Funcionario ();
		funcionario2.setNome("Maria");
		assertEquals("Maria", funcionario2.getNome());
	}
	@Test
	public void deve_testar_idade2() {
		Funcionario funcionario2 = new Funcionario ();
		funcionario2.setIdade("20");
		assertEquals("20", funcionario2.getIdade());
		
	}
	@Test
	public void deve_testar_cpf2() {
		Funcionario funcionario2 = new Funcionario ();
		funcionario2.setCpf("1234567");
		assertEquals("1234567", funcionario2.getCpf());
	}
	@Test
	public void deve_testar_cargo2() {
		Funcionario funcionario2 = new Funcionario ();
		funcionario2.setCargo("Estagiária");
		assertEquals("Estagiária", funcionario2.getCargo());
	}
	@Test
	public void deve_testar_TempoNaEmpresa2() {
		Funcionario funcionario2 = new Funcionario ();
		funcionario2.setTempoNaEmpresa("1 ano");
		assertEquals("1 ano", funcionario2.getTempoNaEmpresa());
	}
	
	

	@Ignore ("Teste desnecessário")
    @Test
    public void deve_atribuir_ondetrabalha () {
        Funcionario funcionario = new Funcionario ();
        funcionario.setOndeTrabalha("Contmatic");;

        assertThat(funcionario.getCargo(), is("Contmatic"));
    }

	@Test 
	public void deve_testar_cpf () {
		Funcionario funcionario = new Funcionario ();
		funcionario.setCpf("654321");
		Funcionario funcionario1 = new Funcionario ();
		funcionario.setCpf("654321");
		assertThat(funcionario.equals(funcionario1), is (true));
		
		
	}
	
}
