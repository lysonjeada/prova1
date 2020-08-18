package br.com.contmatic.empresa;

import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class EnderecoTest {

	private Empresa empresa;
	// 
	
	@BeforeClass
	public static void before() {
		System.out.println("Iniciando os testes");
	}

	@AfterClass
	public static void after() {
		System.out.println(" Terminando os testes");
	}

	private Endereco endereco;

	

	@Test
	public void deve_Testar_Um_Endereco_Cep() {
		Endereco endereco = new Endereco();
		endereco.setCep("12345");
		assertEquals("12345", endereco.getCep());

	}

	@Test
	public void deve_Testar_Um_Endereco_Cidade() {
		Endereco endereco = new Endereco();
		endereco.setCidade("Sao Paulo");
		assertEquals("Sao Paulo", endereco.getCidade());
	}

	@Test
	public void deve_Testar_Um_Endereco_Rua() {
		Endereco endereco = new Endereco();
		endereco.setLogradouro("Rua Berto Conde");
		assertEquals("Rua Berto Conde", endereco.getLogradouro());

	}

	@Test
	public void deve_Testar_Um_Endereco_Numero() {
		Endereco endereco = new Endereco();
		endereco.setNumero("1234");
		assertEquals("1234", endereco.getNumero());
	}

	@Test
	public void deve_Testar_Um_Endereco_Pais() {
		Endereco endereco = new Endereco();
		endereco.setPais("Brasil");
		assertEquals("Brasil", endereco.getPais());

	}

	private Endereco endereco2;
	Empresa empresa2 = new Empresa();

	@Test
	public void deve_Testar_Um_Endereco2_Cep() {
		Endereco endereco2 = new Endereco();
		endereco2.setCep("12345");
		assertEquals("12345", endereco2.getCep());

	}

	@Test
	public void deve_Testar_Um_Endereco2_Cidade() {
		Endereco endereco2 = new Endereco();
		endereco2.setCidade("Sao Paulo");
		assertEquals("Sao Paulo", endereco2.getCidade());
	}

	@Test
	public void deve_Testar_Um_Endereco2_Rua() {
		Endereco endereco2 = new Endereco();
		endereco2.setLogradouro("Rua Berto Conde");
		assertEquals("Rua Berto Conde", endereco2.getLogradouro());

	}

	@Test
	public void deve_Testar_Um_Endereco2_Numero() {
		Endereco endereco2 = new Endereco();
		endereco2.setNumero("1234");
		assertEquals("1234", endereco2.getNumero());
	}

	@Test
	public void deve_Testar_Um_Endereco2_Pais() {
		Endereco endereco2 = new Endereco();
		endereco2.setPais("Brasil");
		assertEquals("Brasil", endereco2.getPais());

	}

}
