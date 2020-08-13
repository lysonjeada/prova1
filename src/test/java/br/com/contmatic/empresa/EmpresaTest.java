package br.com.contmatic.empresa;

import static org.hamcrest.CoreMatchers.containsString;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class EmpresaTest {

	@Before
	public final void setUp() {
		Empresa empresa = new Empresa ();
	}

	@After
	public final void tearDown() {
		Empresa empresa = null;
	}

	@Test(timeout = 500)
	public void deve_Testar_Nova_Empresa_Nome() {
		Empresa empresa = new Empresa();
		empresa.setNome("Contmatic");
		assertEquals("Contmatic", empresa.getNome());		

	}

	@Test(timeout = 500)
	public void deve_Testar_Nova_Empresa_Cnpj() {
		Empresa empresa = new Empresa();
		empresa.setCnpj("1234567");
		assertEquals("1234567", empresa.getCnpj());
	}

	@Test(timeout = 500)
	public void deve_Testar_Nova_Empresa_Quantidade_De_Funcionarios() {
		Empresa empresa = new Empresa();
		empresa.setQuantidadeDeFuncionarios("1234567");
		assertEquals("1234567", empresa.getQuantidadeDeFuncionarios());
	}

	@Test(timeout = 500)
	public void deve_Testar_Nova_Empresa_Tipo() {
		Empresa empresa = new Empresa();
		empresa.setTipoDeEmpresa("1234567");
		assertEquals("1234567", empresa.getTipoDeEmpresa());
	}

	@Test(timeout = 500)
	public void deve_Testar_Nova_Empresa_Porte() {
		Empresa empresa = new Empresa();
		empresa.setPorteDaEmpresa("1234567");
		assertEquals("1234567", empresa.getPorteDaEmpresa());
	}

	@Test(expected = NullPointerException.class)
	public void deve_Acontecer_NullPointer() {
		Empresa empresa = null;
		empresa.setCnpj("12324");
	}
	System.out.println((empresa.toString()));
	System.out.println((empresa2.toString()));

	boolean retorna = empresa.hashCode() == empresa2.hashCode();

	equals(empresa.equals(empresa2));

	assertThat(empresa.getCnpj(), containsString("7654321"));

}