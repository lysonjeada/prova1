package br.com.contmatic.empresa;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class EnderecoTest {

	@BeforeClass
	public static void before() {
		System.out.println("Iniciando os testes");
	}

	@AfterClass
	public static void after() {
		System.out.println(" Terminando os testes");
	}

	@Test
	public void deve_testar_cep() {
		Endereco endereco = new Endereco();
		endereco.setCep("12345");
		assertEquals("12345", endereco.getCep());

	}

	@Test
	public void deve_testar_cidade() {
		Endereco endereco = new Endereco();
		endereco.setCidade("Sao Paulo");
		assertEquals("Sao Paulo", endereco.getCidade());
	}

	@Test
	public void deve_testar_rua() {
		Endereco endereco = new Endereco();
		endereco.setLogradouro("Rua Berto Conde");
		assertEquals("Rua Berto Conde", endereco.getLogradouro());

	}

	@Test
	public void deve_testar_numero() {
		Endereco endereco = new Endereco();
		endereco.setNumero("1234");
		assertEquals("1234", endereco.getNumero());
	}

	@Test
	public void deve_testar_pais() {
		Endereco endereco = new Endereco();
		endereco.setPais("Brasil");
		assertEquals("Brasil", endereco.getPais());

	}

	@Test
	public void deve_testar_cep_iguais() {
		Endereco endereco = new Endereco();
		endereco.setCep("12345");
		Endereco endereco2 = new Endereco();
		endereco2.setCep("12345");
		assertThat(endereco.equals(endereco2), is(true));
		assertTrue(endereco.hashCode() == endereco2.hashCode());

	}

	@Test
	public void deve_testar_cep_diferentes() {
		Endereco endereco = new Endereco();
		endereco.setCep("12345");
		Endereco endereco2 = new Endereco();
		endereco2.setCep("135425");
		assertThat(endereco.equals(endereco2), is(false));
		assertTrue(endereco.hashCode() == endereco2.hashCode());

	}

}
