package br.com.contmatic.empresa;

import static org.junit.Assert.*;

import org.junit.Test;

public class EmpresaTest {

	@Test (timeout = 100)
	public void test() {
		Empresa empresa = new Empresa();
		empresa.setCnpj("1234567");
		empresa.setNome("Contmatic");
		
		assertEquals("1234567", empresa.getCnpj());
		assertEquals("Contmatic", empresa.getNome());
	}
}