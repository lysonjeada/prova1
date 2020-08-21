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
		empresa.setCnpj("58.119.371/0001-77");
		assertEquals("58.119.371/0001-77", empresa.getCnpj());
	}

	@Test
	public void deve_testar_cnpj_nulo_e_nao_nulo() {
		empresa = new Empresa();
		empresa.setCnpj("26.870.272/0001-36");
		assertNotEquals(null, empresa.getCnpj());
	}

	@Test
	public void deve_Testar_Nova_Empresa_Tipo() {
		empresa = new Empresa();
		empresa.setTipoDeEmpresa("MEI");
		assertEquals("MEI", empresa.getTipoDeEmpresa());
	}

	@Test
	public void deve_testar_porte() {
		empresa = new Empresa();
		empresa.setPorteDaEmpresa("Médio");
		assertEquals("Médio", empresa.getPorteDaEmpresa());

	}

	@Test
	public void deve_testar_nomeFantasia() {
		empresa = new Empresa();
		empresa.setNomeFantasia("CONTENTE COMERCIO E NEGOCIOS");
		assertEquals("CONTENTE COMERCIO E NEGOCIOS", empresa.getNomeFantasia());

	}

	@Test
	public void deve_testar_telefone() {
		empresa = new Empresa();
		empresa.setTelefone("(0011) 6942-9811");
		assertEquals("(0011) 6942-9811", empresa.getTelefone());

	}

	@Test
	public void deve_testar_situacaoCadastral() {
		empresa = new Empresa();
		empresa.setSituacaoCadastral("Ativa");
		assertEquals("Ativa", empresa.getSituacaoCadastral());

	}

	@Test
	public void deve_testar_dataSituacaoCadastral() {
		empresa = new Empresa();
		empresa.setData("26/06/2004");
		assertEquals("26/06/2004", empresa.getData());

	}

	@Test
	public void deve_testar_email() {
		empresa = new Empresa();
		empresa.setEmail("autoatendimento@contmatic.com.br");
		assertEquals("autoatendimento@contmatic.com.br", empresa.getEmail());
	}

	@Test
	public void deve_testar_situacaoEspecial() {
		empresa = new Empresa();
		empresa.setSituacaoEspecial("Ativada");
		assertEquals("Ativada", empresa.getSituacaoEspecial());

	}

	@Test
	public void deve_testar_dataSituacaoEspecial() {
		empresa = new Empresa();
		empresa.setData2("26/06/2004");
		assertEquals("26/06/2004", empresa.getData2());
	}

	@Test
	public void deve_testar_listaDeFuncionarios() {
		Funcionario funcionario = new Funcionario();
		List<Funcionario> funcionarios = new ArrayList<>();
		funcionarios.add(funcionario);
		Funcionario funcionario2 = new Funcionario();
		List<Funcionario> funcionarios2 = new ArrayList<>();
		funcionarios2.add(funcionario2);
		Empresa empresa2 = new Empresa();
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
	public void teste_cpf_nulo() {
		empresa = new Empresa();
		empresa.setCnpj(null);
		assertEquals(null, empresa.getCnpj());

	}

	@Test
	public void teste_cpf_nulo2() {
		empresa = new Empresa();
		empresa.setCnpj("12345");
		assertNotEquals(null, empresa.getCnpj());

	}

	@Test
	public void deve_testar_cnpj_iguais() {
		Empresa empresa = new Empresa();
		empresa.setCnpj("26.870.272/0001-36");
		Empresa empresa2 = new Empresa();
		empresa2.setCnpj("26.870.272/0001-36");
		assertThat(empresa.equals(empresa2), is(true));
		assertTrue(empresa.hashCode() == empresa2.hashCode());

	}

	@Test
	public void deve_testar_cnpj_diferentes() {
		Empresa empresa = new Empresa();
		empresa.setCnpj("26.870.272/0001-36");
		Empresa empresa2 = new Empresa();
		empresa2.setCnpj("35.876.272/0001-98");
		assertThat(empresa.equals(empresa2), is(false));
		assertFalse(empresa.hashCode() == empresa2.hashCode());

	}

	@Test
	public void deve_testar_empresa_e_funcionario() {
		Empresa empresa = new Empresa();
		empresa.setCnpj("26.870.272/0001-36");
		Funcionario funcionario = new Funcionario();
		assertThat(empresa.equals(funcionario), is(false));
		assertFalse(empresa.hashCode() == funcionario.hashCode());

	}

	@Test
	public void deve_testar_cnpj2() {
		Empresa empresa = new Empresa();
		empresa.setCnpj("26.870.272/0001-36");
		Empresa empresa2 = new Empresa();
		empresa2.setCnpj("56.980.272/0001-86");
		assertThat(empresa.equals(empresa2), is(false));
		assertFalse(empresa.hashCode() == empresa2.hashCode());

	}

	@Test
	public void deve_testar_cnpj3() {
		Empresa empresa = new Empresa();
		empresa.setCnpj(null);
		Empresa empresa2 = new Empresa();
		empresa2.setCnpj("26.870.272/0001-36");
		assertNotEquals(empresa, empresa2);
		assertThat(empresa.equals(empresa2), is(false));
		assertFalse(empresa.hashCode() == empresa2.hashCode());

	}

	@Test
	public void testar_tostring() {
		Empresa empresa = new Empresa();
		empresa.setCnpj("26.870.272/0001-36");
		assertNotEquals("26.870.272/0001-36", empresa.toString());
	}

	@Test
	public void testar_doisobjetos() {
		Empresa empresa = new Empresa();
		Empresa empresa1 = empresa;
		assertEquals(empresa, empresa1);
	}

	@Test
	public void testar_null() {
		Empresa empresa = new Empresa();
		Empresa empresa1 = null;
		assertNotEquals(empresa, empresa1);
	}

	@Test
	public void nao_deve_retornar_tostring_nulo() {
		Empresa empresa = new Empresa();
		assertNotEquals(empresa.toString(), null);
	}

}