package br.com.contmatic.empresa;

import static org.hamcrest.CoreMatchers.containsString;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class EmpresaTest {

	@Before 
	public final void setUp() { 
		
	}
	@After 
    public final void tearDown() { }
	
	@Test (timeout = 500)
	public void deve_Testar_Nova_Empresa() {
		Empresa empresa = new Empresa();
		empresa.setCnpj("1234567");
		empresa.setNome("Contmatic");
		
		assertEquals("1234567", empresa.getCnpj());
		assertEquals("Contmatic", empresa.getNome());
		
		Empresa empresa2 = new Empresa ();
		empresa2.setCnpj("7654321");
		empresa2.setNome("Berinjela Grelhada");
		
		assertEquals("7654321", empresa2.getCnpj());
		assertEquals("Berinjela Grelhada", empresa2.getNome());
		
		System.out.println((empresa.toString()));
		System.out.println((empresa2.toString()));
		
		boolean retorna = empresa.hashCode() == empresa2.hashCode();
		System.out.println(retorna);
		
		System.out.println(empresa.equals(empresa2));
		
		assertThat(empresa.getCnpj(),containsString("7654321"));
		
//		try
//		{
//			String novoCnpj = empresa.getCnpj().toUpperCase();
//			
//		}
//		catch (NullPointerException e)
//		{
//			System.out.println("O cpf está nulo.");
//			String novoCnpj = empresa.getCnpj().toUpperCase();
//			
//		}
		
	}
	
	@Test (expected = NullPointerException.class)
	public void deve_Acontecer_NullPointer () {
		Empresa empresa = null;
		empresa.setCnpj("12324");
	}
	
}