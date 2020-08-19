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
	public void deve_Testar_Cep() {
		Endereco endereco = new Endereco();
		endereco.setCep("12345");
		assertEquals("12345", endereco.getCep());

	}

	@Test
	public void deve_Testar_Cidade() {
		Endereco endereco = new Endereco();
		endereco.setCidade("Sao Paulo");
		assertEquals("Sao Paulo", endereco.getCidade());
	}

	@Test
	public void deve_Testar_Rua() {
		Endereco endereco = new Endereco();
		endereco.setLogradouro("Rua Berto Conde");
		assertEquals("Rua Berto Conde", endereco.getLogradouro());

	}

	@Test
	public void deve_Testar_Numero() {
		Endereco endereco = new Endereco();
		endereco.setNumero("1234");
		assertEquals("1234", endereco.getNumero());
	}

	@Test
	public void deve_Testar_Pais() {
		Endereco endereco = new Endereco();
		endereco.setPais("Brasil");
		assertEquals("Brasil", endereco.getPais());

	}

	Empresa empresa2 = new Empresa();

	@Test
	public void deve_Testar_Cep2() {
		Endereco endereco2 = new Endereco();
		endereco2.setCep("12345");
		assertEquals("12345", endereco2.getCep());

	}

	@Test
	public void deve_Testar_Cidade2() {
		Endereco endereco2 = new Endereco();
		endereco2.setCidade("Sao Paulo");
		assertEquals("Sao Paulo", endereco2.getCidade());
	}

	@Test
	public void deve_Testar_Um_Logradouro2() {
		Endereco endereco2 = new Endereco();
		endereco2.setLogradouro("Rua Berto Conde");
		assertEquals("Rua Berto Conde", endereco2.getLogradouro());

	}

	@Test
	public void deve_Testar_Numero2() {
		Endereco endereco2 = new Endereco();
		endereco2.setNumero("1234");
		assertEquals("1234", endereco2.getNumero());
	}

	@Test
	public void deve_Testar_Um_Pais2() {
		Endereco endereco2 = new Endereco();
		endereco2.setPais("Brasil");
		assertEquals("Brasil", endereco2.getPais());

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

}
