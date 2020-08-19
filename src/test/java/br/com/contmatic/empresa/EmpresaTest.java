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
	private Empresa empresa3;
	private Empresa empresa32;
	
	@Before
	public final void setUp() {
		empresa3 = new Empresa();
	}

	
	@After
	public final void tearDown() {
		empresa3 = null;
	}

	

	@Test(timeout = 500)
	public void deve_atribuir_nome_corretamente() {
		empresa = new Empresa();
		empresa.setNome("Contmatic");
		assertEquals("Contmatic", empresa.getNome());

	}

	@Test
	public void deve_Testar_Nova_Empresa_Cnpj() {
		empresa = new Empresa();
		empresa.setCnpj("1234567");
		assertEquals("1234567", empresa.getCnpj());
	}

	@Test
	public void deve_Testar_Nova_Empresa_Quantidade_De_Funcionarios() {
		empresa = new Empresa();
		empresa.setListaDeFuncionarios("1234567");
		assertEquals("1234567", empresa.getListaDeFuncionarios());
	}

	@Test
	public void deve_Testar_Nova_Empresa_Tipo() {
		empresa = new Empresa();
		empresa.setTipoDeEmpresa("1234567");
		assertEquals("1234567", empresa.getTipoDeEmpresa());
	}

	@Test
	public void deve_Testar_Nova_Empresa_Porte() {
		empresa = new Empresa();
		empresa.setPorteDaEmpresa("1234567");
		assertEquals("1234567", empresa.getPorteDaEmpresa());
	}

	private Empresa empresa2;

	@Test(timeout = 500)
	public void deve_Testar_Nova_Empresa2_Nome() {
		empresa2 = new Empresa();
		empresa2.setNome("Contmatic");
		assertEquals("Contmatic", empresa2.getNome());

	}

	@Test
	public void deve_Testar_Nova_Empresa2_Cnpj() {
		empresa2 = new Empresa();
		empresa2.setCnpj("1234567");
		assertEquals("1234567", empresa2.getCnpj());
	}

	@Test
	public void deve_Testar_Nova_Empresa2_Quantidade_De_Funcionarios() {
		empresa2 = new Empresa();
		empresa2.setListaDeFuncionarios("1234567");
		assertEquals("1234567", empresa2.getListaDeFuncionarios());
	}

	@Test
	public void deve_Testar_Nova_Empresa2_Tipo() {
		empresa2 = new Empresa();
		empresa2.setTipoDeEmpresa("1234567");
		assertEquals("1234567", empresa2.getTipoDeEmpresa());
	}

	@Test
	public void deve_Testar_Nova_Empresa2_Porte() {
		empresa2 = new Empresa();
		empresa2.setPorteDaEmpresa("1234567");
		assertEquals("1234567", empresa2.getPorteDaEmpresa());
	}


	@Test(expected = NullPointerException.class)
	public void deve_Acontecer_NullPointer() {
		empresa32 = null;
		empresa32.setCnpj("12324");
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