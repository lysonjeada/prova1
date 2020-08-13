package br.com.contmatic.empresa;

import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;


@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class EnderecoTest {

	@BeforeClass 
	public static void before () {
		System.out.println("Iniciando os testes");
	}	
	@AfterClass 
	public static void after () {
		System.out.println("Terminando os testes");
	}

	Empresa empresa = new Empresa();
	@Test
	public void deve_Testar_Um_Endereco_Cep() {
		Endereco endereco = new Endereco ();
		endereco.setCep("12345");
		assertEquals("12345", endereco.getCep());	
		
	}
	@Test 
	public void deve_Testar_Um_Endereco_Cidade() {
		Endereco endereco = new Endereco ();
		endereco.setCidade("Sao Paulo");
		assertEquals("Sao Paulo", endereco.getCidade());
	}
	@Test 
	public void deve_Testar_Um_Endereco_Rua() {
		Endereco endereco = new Endereco ();
		endereco.setRua("Rua Berto Conde");
		assertEquals("Rua Berto Conde", endereco.getRua());
		
	}
	@Test 
	public void deve_Testar_Um_Endereco_Numero() {
		Endereco endereco = new Endereco ();
		endereco.setNumero("1234");
		assertEquals("1234", endereco.getNumero());
	}
	@Test 
	public void deve_Testar_Um_Endereco_Pais() {
	Endereco endereco = new Endereco (); 
	endereco.setPais("Brasil");
	assertEquals("Brasil", endereco.getPais());
	
	}
	Empresa empresa2 = new Empresa();
	@Test
	public void deve_Testar_Um_Endereco2_Cep() {
		Endereco endereco = new Endereco ();
		endereco.setCep("12345");
		assertEquals("12345", endereco.getCep());	
		
	}
	@Test 
	public void deve_Testar_Um_Endereco2_Cidade() {
		Endereco endereco = new Endereco ();
		endereco.setCidade("Sao Paulo");
		assertEquals("Sao Paulo", endereco.getCidade());
	}
	@Test 
	public void deve_Testar_Um_Endereco2_Rua() {
		Endereco endereco = new Endereco ();
		endereco.setRua("Rua Berto Conde");
		assertEquals("Rua Berto Conde", endereco.getRua());
		
	}
	@Test 
	public void deve_Testar_Um_Endereco2_Numero() {
		Endereco endereco = new Endereco ();
		endereco.setNumero("1234");
		assertEquals("1234", endereco.getNumero());
	}
	@Test 
	public void deve_Testar_Um_Endereco2_Pais() {
	Endereco endereco = new Endereco (); 
	endereco.setPais("Brasil");
	assertEquals("Brasil", endereco.getPais());
	
	}
//	@Test
//	public void deve_Testar_Um_Endereco2 () {
//		Empresa empresa2 = new Empresa();
//		Endereco endereco2 = new Endereco ();
//		endereco2.setCep("54321");
//		endereco2.setCidade("Rio de Janeiro");
//		endereco2.setNumero("7654321");
//		endereco2.setPais("Brasil");
//		endereco2.setRua("Rua Antonio da Costa");
//		empresa2.setEndereco(endereco2);
//		
//		assertEquals("Rio de Janeiro", endereco2.getCidade());
//		assertEquals("7654321", endereco2.getNumero());
//		assertEquals("Brasil", endereco2.getPais());
//		assertEquals("Rua Antonio da Costa", endereco2.getRua());
//		System.out.println((endereco2.toString()));
//		
//	}
	
	@Test 
	public void deveTestarOsDoisEnderecos () {

		
		boolean retorna = endereco.hashCode() == endereco2.hashCode();
		System.out.println(retorna);
		
		System.out.println(endereco.equals(endereco2));
	}
}
