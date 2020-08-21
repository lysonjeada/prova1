package br.com.contmatic.empresa;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class EmpresaTest {

	private Empresa empresa;
	private List<String> funcionarios;

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
	public void deve_testar_cnpj_nulo() {
		empresa = new Empresa();
		empresa.setCnpj("12345");
		assertNotEquals(null, empresa.getCnpj());
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

	@Test
	public void deve_testar_listaDeFuncionarios() {
		Funcionario funcionario = new Funcionario ();
		List<Funcionario> funcionarios = new ArrayList <> ();
		funcionarios.add(funcionario);
		Funcionario funcionario2 = new Funcionario ();
		List <Funcionario> funcionarios2 = new ArrayList <> ();
		funcionarios2.add(funcionario2);
		Empresa empresa2 = new Empresa ();
		assertThat(funcionarios.equals(funcionarios2), is(true));
		assertTrue(funcionarios.hashCode() == funcionarios2.hashCode());
		assertEquals(empresa.getFuncionarios(), empresa2.getFuncionarios());	
	}

	@Test(expected = NullPointerException.class)
	public void deve_acontecer_NullPointer() {
		empresa = null;
		assertThat(empresa.equals(null), is(true));
	}
	@Test
	public void teste_cpf_nulo (){
		empresa = new Empresa ();
		empresa.setCnpj(null);
		assertEquals(null, empresa.getCnpj());
		
	}
	@Test
	public void teste_cpf_nulo2(){
		empresa = new Empresa ();
		empresa.setCnpj("12345");
		assertNotEquals(null, empresa.getCnpj());
		
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

	@Test
	public void deve_testar_cnpj_diferentes() {
		Empresa empresa = new Empresa();
		empresa.setCnpj("12345");
		Empresa empresa2 = new Empresa();
		empresa2.setCnpj("123435");
		assertThat(empresa.equals(empresa2), is(false));
		assertFalse(empresa.hashCode() == empresa2.hashCode());

	}
	@Test
	public void deve_testar_empresa_e_funcionario() {
		Empresa empresa = new Empresa();
		empresa.setCnpj("12345");
		Funcionario funcionario = new Funcionario();
		assertThat(empresa.equals(funcionario), is(false));
		assertFalse(empresa.hashCode() == funcionario.hashCode());
		
	}

	@Test
	public void deve_testar_cnpj2() {
		Empresa empresa = new Empresa();
		empresa.setCnpj("12345");
		Empresa empresa2 = new Empresa();
		empresa2.setCnpj("98654");
		assertThat(empresa.equals(empresa2), is(false));
		assertFalse(empresa.hashCode() == empresa2.hashCode());

	}
	@Test
	public void deve_testar_cnpj3() {
		Empresa empresa = new Empresa();
		empresa.setCnpj(null);
		Empresa empresa2 = new Empresa();
		empresa2.setCnpj("98654");
		assertNotEquals(empresa, empresa2);
		assertThat(empresa.equals(empresa2), is(false));
		assertFalse(empresa.hashCode() == empresa2.hashCode());

	}
	@Test 
	public void testar_tostring () {
		Empresa empresa = new Empresa();
		empresa.setCnpj("12345");
		assertNotEquals("12345", empresa.toString());
	}
	@Test 
	public void testar_doisobjetos () {
		Empresa empresa = new Empresa();
		Empresa empresa1 = empresa;
		assertEquals(empresa, empresa1);
	}
	@Test 
	public void testar_null () {
		Empresa empresa = new Empresa();
		Empresa empresa1 = null;
		assertNotEquals(empresa, empresa1);
	}
	@Test
	public void nao_deve_retornar_tostring_nulo () {
		Empresa empresa = new Empresa();
		assertNotEquals(empresa.toString(), null);
	}
	
}