package br.com.contmatic.empresa;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertFalse;

import org.junit.Ignore;
import org.junit.Test;

public class FuncionarioTest {

	@Test
	public void deve_testar_nome() {
		Funcionario funcionario = new Funcionario();
		funcionario.setNome("Raimundo");
		assertEquals("Raimundo", funcionario.getNome());
	}

	@Test
	public void deve_testar_idade() {
		Funcionario funcionario = new Funcionario();
		funcionario.setIdade(22);
		assertEquals(22, funcionario.getIdade());

	}

	@Test
	public void deve_testar_cpf() {
		Funcionario funcionario = new Funcionario();
		funcionario.setCpf("27448545060");
		assertEquals("27448545060", funcionario.getCpf());
	}

	@Test
	public void deve_testar_cargo() {
		Funcionario funcionario = new Funcionario();
		funcionario.setCargo("Analista");
		Funcionario funcionario2 = new Funcionario();
		funcionario2.setCargo("Analista");
		assertEquals(funcionario.getCargo(), funcionario2.getCargo());

	}

	@Test
	public void deve_testar_empresa_e_funcionario() {
		Empresa empresa = new Empresa("42771949000135");
		empresa.setCnpj("42771949000135");
		Funcionario funcionario = new Funcionario();
		assertNotEquals(empresa, funcionario);
		assertFalse(empresa.hashCode() == funcionario.hashCode());

	}

	@Ignore("Teste desnecessário")
	@Test
	public void deve_atribuir_cargonulo() {
		Funcionario funcionario = new Funcionario();
		funcionario.setCargo(null);

		assertThat(funcionario.getCargo(), (null));
	}

	@Test
	public void deve_testar_cpf_iguais() {
		Funcionario funcionario = new Funcionario();
		funcionario.setCpf("44065933064");
		Funcionario funcionario1 = new Funcionario();
		funcionario1.setCpf("44065933064");
		assertEquals(funcionario, funcionario1);

	}

	@Test
	public void nao_deve_retornar_tostring_nulo() {
		Funcionario funcionario = new Funcionario();
		assertNotEquals(funcionario.toString(), null);
	}

	@Test
	public void testar_doisobjetos() {
		Funcionario funcionario = new Funcionario();
		Funcionario funcionario1 = funcionario;
		assertEquals(funcionario, funcionario1);
	}

	@Test
	public void testar_null() {
		Funcionario funcionario = new Funcionario();
		Funcionario funcionario1 = null;
		assertNotEquals(funcionario, funcionario1);
	}

	@Test
	public void testar_dois_objetos_com_cpf_nulo() {
		Funcionario funcionario = new Funcionario();
		Funcionario funcionario1 = new Funcionario();
		funcionario.setCpf(null);
		funcionario1.setCpf(null);
		assertEquals(funcionario.getCpf(), funcionario1.getCpf());
	}

	@Test
	public void testar_cpfs_diferentes() {
		Funcionario funcionario = new Funcionario();
		Funcionario funcionario1 = new Funcionario();
		funcionario.setCpf("44065933064");
		funcionario1.setCpf("27448545060");
		assertNotEquals(funcionario.getCpf(), funcionario1.getCpf());
	}

	@Test
	public void testar_classes_diferentes() {
		Funcionario funcionario = new Funcionario();
		Empresa empresa = new Empresa("42771949000135");
		assertNotEquals(empresa.getClass(), funcionario.getClass());

	}
}
