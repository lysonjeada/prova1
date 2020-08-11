package br.com.contmatic.empresa;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

import org.junit.Ignore;
import org.junit.Test;

public class FuncionarioTest {

	@Test
	public void test() {
		Funcionario funcionario = new Funcionario ();
		funcionario.setNome("Raimundo");
		funcionario.setIdade("19");
		
			
	}

	@Ignore ("Teste desnecessário")
    @Test
    public void testOndeTrabalha () {
        Funcionario funcionario = new Funcionario ();
        funcionario.setOndeTrabalha("Contmatic");;

        assertThat(empresa.getRazaoSocial(), is("test"));
    }
}
