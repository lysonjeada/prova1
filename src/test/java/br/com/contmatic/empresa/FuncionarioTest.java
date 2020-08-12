package br.com.contmatic.empresa;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;


import org.junit.Ignore;
import org.junit.Test;

public class FuncionarioTest {

	
	@Test
	public void deveRealizarToString() {
		Funcionario funcionario = new Funcionario ();
		System.out.println((funcionario.toString()));
		Funcionario funcionario2 = new Funcionario ();
		System.out.println((funcionario2.toString()));
		
		System.out.println(funcionario.equals(funcionario2));
		
		boolean retorna = funcionario.hashCode() == funcionario2.hashCode();
		System.out.println(retorna);
		
		funcionario.setNome("Raimundo");
		funcionario.setIdade("19");
		
			
	}

	@Ignore ("Teste desnecessário")
    @Test
    public void deveAtribuirOndeTrabalha () {
        Funcionario funcionario = new Funcionario ();
        funcionario.setOndeTrabalha("Contmatic");;

        assertThat(funcionario.getOndeTrabalha(), is("Contmatic"));
    }
}
