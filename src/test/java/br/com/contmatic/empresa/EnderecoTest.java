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
	private Object endereco;
	
	

	@Test
	public void deveTestarUmEndereco() {
		Empresa empresa = new Empresa();
		Endereco endereco = new Endereco ();
		endereco.setCep("12345");
		endereco.setCidade("Sao Paulo");
		endereco.setNumero("1234");
		endereco.setPais("Brasil");
		endereco.setRua("Rua Berto Conde");
		empresa.setEndereco(endereco);
		
		assertEquals("Sao Paulo", endereco.getCidade());
		assertEquals("1234", endereco.getNumero());
		assertEquals("Brasil", endereco.getPais());
		assertEquals("Rua Berto Conde", endereco.getRua());
		
		System.out.println((endereco.toString()));
		
		
	
		}
	Object testaEndereco = endereco;
	private Object endereco2;
	@Test
	public void deveTestarUmEndereco2 () {
		Empresa empresa2 = new Empresa();
		Endereco endereco2 = new Endereco ();
		endereco2.setCep("54321");
		endereco2.setCidade("Rio de Janeiro");
		endereco2.setNumero("7654321");
		endereco2.setPais("Brasil");
		endereco2.setRua("Rua Antonio da Costa");
		empresa2.setEndereco(endereco2);
		
		assertEquals("Rio de Janeiro", endereco2.getCidade());
		assertEquals("7654321", endereco2.getNumero());
		assertEquals("Brasil", endereco2.getPais());
		assertEquals("Rua Antonio da Costa", endereco2.getRua());
		System.out.println((endereco2.toString()));
		
	}
	Object testaEndereco2 = endereco2;
	@Test 
	public void deveTestarOsDoisEnderecos () {

		
		boolean retorna = endereco.hashCode() == endereco2.hashCode();
		System.out.println(retorna);
		
		System.out.println(endereco.equals(endereco2));
	}
}
