package br.com.contmatic.empresa;

import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

public class EnderecoTest {

	@BeforeClass 
	public static void before () {
		System.out.println("Iniciando os testes");
	}	
	@AfterClass 
	public static void after () {
		System.out.println("Terminando os testes");
	}
	
	@FixMethodOrder(MethodSorters.NAME_ASCENDING)
	public class OrdemJunitTest {
		@Test
		public void test() {
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
		}
		
	}

}
