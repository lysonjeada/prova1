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
		empresa = new Empresa("42771949000135");
	}

	@After
	public final void tearDown() {
		empresa = null;
	}

	@Test(timeout = 500)
	public void deve_atribuir_nome_corretamente() {
		empresa.setNome("Contmatic");
		assertEquals("Contmatic", empresa.getNome());

	}

	@Test
	public void deve_testar_cnpj() {
		empresa.setCnpj("58119371000177");
		assertEquals("58119371000177", empresa.getCnpj());
	}

	@Test
	public void deve_testar_cnpj_nulo_e_nao_nulo() {
		empresa.setCnpj("26870272000136");
		assertNotEquals(null, empresa.getCnpj());
	}

	@Test
	public void deve_Testar_Nova_Empresa_Tipo() {
		empresa.setTipoDeEmpresa("MEI");
		assertEquals("MEI", empresa.getTipoDeEmpresa());
	}

	@Test
	public void deve_testar_porte() {
		empresa.setPorteDaEmpresa("Médio");
		assertEquals("Médio", empresa.getPorteDaEmpresa());

	}

	@Test
	public void deve_testar_nomeFantasia() {
		empresa.setNomeFantasia("CONTENTE COMERCIO E NEGOCIOS");
		assertEquals("CONTENTE COMERCIO E NEGOCIOS", empresa.getNomeFantasia());

	}

	@Test
	public void deve_testar_situacaoCadastral() {
		empresa.setSituacaoCadastral("Ativa");
		assertEquals("Ativa", empresa.getSituacaoCadastral());
		
	}

	@Test
	public void deve_testar_email() {
		empresa.setEmail("autoatendimento@contmatic.com.br");
		assertEquals("autoatendimento@contmatic.com.br", empresa.getEmail());
	}

	@Test
	public void deve_testar_situacaoEspecial() {
		empresa.setSituacaoEspecial("Ativada");
		assertEquals("Ativada", empresa.getSituacaoEspecial());

	}

	@Test(expected = NullPointerException.class)
	public void deve_acontecer_NullPointer() {
		empresa = null;
		assertThat(empresa.equals(null), is(true));
	}

	@Test
	public void nao_deve_retornar_cnpj_nulo() {
		empresa.setCnpj("58119371000177");
		assertNotEquals(null, empresa.getCnpj());

	}

	@Test
	public void deve_testar_cnpj_iguais() {
		empresa.setCnpj("26870272000136");
		Empresa empresa2 = new Empresa("26870272000136");
		empresa2.setCnpj("26870272000136");
		assertEquals(empresa, empresa2);
		assertTrue(empresa.hashCode() == empresa2.hashCode());

	}

	@Test
	public void deve_testar_cnpj_diferentes() {
		empresa.setCnpj("05170388000192");
		Empresa empresa2 = new Empresa("37279735000106");
		empresa2.setCnpj("37279735000106");
		assertNotEquals(empresa.getCnpj(), empresa2.getCnpj());

	}

	@Test
	public void deve_testar_empresa_e_funcionario() {
		empresa.setCnpj("26870272000136");
		Funcionario funcionario = new Funcionario();
		funcionario.setCpf("32159761028");
		assertNotEquals(empresa, funcionario);

	}

	@Test
	public void deve_testar_cnpj2() {
		empresa.setCnpj("26870272000136");
		Empresa empresa2 = new Empresa("72650549000132");
		empresa2.setCnpj("72650549000132");
		assertNotEquals(empresa, empresa2);

	}

	@Test
	public void testar_tostring() {
		empresa.setCnpj("26870272000136");
		assertNotEquals("26870272000136", empresa.toString());
	}

	@Test
	public void testar_doisobjetos() {
		Empresa empresa1 = empresa;
		assertEquals(empresa, empresa1);
	}

	@Test
	public void testar_null() {
		Empresa empresa1 = null;
		assertNotEquals(empresa, empresa1);
	}

	@Test
	public void nao_deve_retornar_tostring_nulo() {
		assertNotEquals(empresa.toString(), null);
	}

}