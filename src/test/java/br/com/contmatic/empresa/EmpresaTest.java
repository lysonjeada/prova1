package br.com.contmatic.empresa;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class EmpresaTest {

	private Empresa empresa;
	
	@Before
	public final void setUp() {
		empresa = new Empresa();
	}

	
	@After
	public final void tearDown() {
		empresa = null;
	}


	@Test(timeout = 500)
	public void deve_atribuir_nome_corretamente() {
		empresa = new Empresa();
		empresa.setNome("Contmatic");
		assertEquals("Contmatic", empresa.getNome());

	}

	@Test
	public void deve_testar_cnpj() {
		empresa = new Empresa();
		empresa.setCnpj("1234567");
		assertEquals("1234567", empresa.getCnpj());
	}

	@Test
	public void deve_Testar_Nova_Empresa_Tipo() {
		empresa = new Empresa();
		empresa.setTipoDeEmpresa("1234567");
		assertEquals("1234567", empresa.getTipoDeEmpresa());
	}

	@Test
	public void deve_testar_porte() {
		empresa = new Empresa();
		empresa.setPorteDaEmpresa("1234567");
		assertEquals("1234567", empresa.getPorteDaEmpresa());
	}


	@Test(expected = NullPointerException.class)
	public void deve_acontecer_NullPointer() {
		empresa = null;
		empresa.setCnpj(null);
		while (empresa.getCnpj()==null) {
			assertThat(empresa.equals(null), is(true));
		}
	    
	}

	@Test
	public void deve_testar_cnpj_iguais() {
		Empresa empresa = new Empresa();
		empresa.setCnpj("12345");
		Empresa empresa2 = new Empresa();
		empresa2.setCnpj("12345");
		assertThat(empresa.equals(empresa2), is(true));
		assertTrue(empresa.hashCode() == empresa2.hashCode());

	}

}