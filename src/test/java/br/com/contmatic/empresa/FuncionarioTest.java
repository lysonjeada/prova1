package br.com.contmatic.empresa;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;


import org.junit.Ignore;
import org.junit.Test;

public class FuncionarioTest {

	
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
	public void deve_testar_data() {
		Funcionario funcionario = new Funcionario ();
		funcionario.setDate("3 anos"); 
		assertEquals("3 anos", funcionario.getDate());
	}
	
	@Ignore ("Teste desnecessário")
    @Test
    public void deve_atribuir_cargonulo () {
        Funcionario funcionario = new Funcionario ();
        funcionario.setCargo(null);

        assertThat(funcionario.getCargo(), (null));
    }

	@Test 
	public void deve_testar_cpf_iguais () {
		Funcionario funcionario = new Funcionario ();
		funcionario.setCpf("654321");
		Funcionario funcionario1 = new Funcionario ();
		funcionario1.setCpf("654321");
		assertThat(funcionario.equals(funcionario1), is (true));
		assertTrue(funcionario.hashCode() == funcionario1.hashCode());	
		
	}
	
}
