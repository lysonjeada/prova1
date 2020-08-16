package br.com.contmatic.empresa;

import static org.junit.Assert.assertEquals;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class EmpresaTest {

	private Empresa novaEmpresa;
	@Before
	public final void setUp() {
		setNovaEmpresa(new Empresa());
	}

	@After
	public final void tearDown() {
		 setNovaEmpresa(null);
	}

	private Empresa empresa;
	

	@Test(timeout = 500)
	public void deve_Testar_Nova_Empresa_Nome() {
		Empresa empresa = new Empresa();
		empresa.setNome("Contmatic");
		assertEquals("Contmatic", empresa.getNome());

	}

	@Test(timeout = 500)
	public void deve_Testar_Nova_Empresa_Cnpj() {
		Empresa empresa = new Empresa();
		empresa.setCnpj("1234567");
		assertEquals("1234567", empresa.getCnpj());
	}

	@Test(timeout = 500)
	public void deve_Testar_Nova_Empresa_Quantidade_De_Funcionarios() {
		Empresa empresa = new Empresa();
		empresa.setQuantidadeDeFuncionarios("1234567");
		assertEquals("1234567", empresa.getQuantidadeDeFuncionarios());
	}

	@Test(timeout = 500)
	public void deve_Testar_Nova_Empresa_Tipo() {
		Empresa empresa = new Empresa();
		empresa.setTipoDeEmpresa("1234567");
		assertEquals("1234567", empresa.getTipoDeEmpresa());
	}

	@Test(timeout = 500)
	public void deve_Testar_Nova_Empresa_Porte() {
		Empresa empresa = new Empresa();
		empresa.setPorteDaEmpresa("1234567");
		assertEquals("1234567", empresa.getPorteDaEmpresa());
	}

	private Empresa empresa2;

	@Test(timeout = 500)
	public void deve_Testar_Nova_Empresa2_Nome() {
		Empresa empresa2 = new Empresa();
		empresa2.setNome("Contmatic");
		assertEquals("Contmatic", empresa2.getNome());

	}

	@Test(timeout = 500)
	public void deve_Testar_Nova_Empresa2_Cnpj() {
		Empresa empresa2 = new Empresa();
		empresa2.setCnpj("1234567");
		assertEquals("1234567", empresa2.getCnpj());
	}

	@Test(timeout = 500)
	public void deve_Testar_Nova_Empresa2_Quantidade_De_Funcionarios() {
		Empresa empresa2 = new Empresa();
		empresa2.setQuantidadeDeFuncionarios("1234567");
		assertEquals("1234567", empresa2.getQuantidadeDeFuncionarios());
	}

	@Test(timeout = 500)
	public void deve_Testar_Nova_Empresa2_Tipo() {
		Empresa empresa2 = new Empresa();
		empresa2.setTipoDeEmpresa("1234567");
		assertEquals("1234567", empresa2.getTipoDeEmpresa());
	}

	@Test(timeout = 500)
	public void deve_Testar_Nova_Empresa2_Porte() {
		Empresa empresa2 = new Empresa();
		empresa2.setPorteDaEmpresa("1234567");
		assertEquals("1234567", empresa2.getPorteDaEmpresa());
	}

	private Empresa empresa3;
	@Test(expected = NullPointerException.class)
	public void deve_Acontecer_NullPointer() {
		Empresa empresa3 = null;
		empresa3.setCnpj("12324");
	}

	public Empresa getEmpresa() {
		return empresa;
	}

	public void setEmpresa(Empresa empresa) {
		this.empresa = empresa;
	}

	public Empresa getEmpresa2() {
		return empresa2;
	}

	public void setEmpresa2(Empresa empresa2) {
		this.empresa2 = empresa2;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((empresa == null) ? 0 : empresa.hashCode());
		result = prime * result + ((empresa2 == null) ? 0 : empresa2.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		EmpresaTest other = (EmpresaTest) obj;
		if (empresa == null) {
			if (other.empresa != null)
				return false;
		} else if (!empresa.equals(other.empresa))
			return false;
		if (empresa2 == null) {
			if (other.empresa2 != null)
				return false;
		} else if (!empresa2.equals(other.empresa2))
			return false;
		return true;
	}

	public Empresa getNovaEmpresa() {
		return novaEmpresa;
	}

	public void setNovaEmpresa(Empresa novaEmpresa) {
		this.novaEmpresa = novaEmpresa;
	}

	public Empresa getEmpresa3() {
		return empresa3;
	}

	public void setEmpresa3(Empresa empresa3) {
		this.empresa3 = empresa3;
	}

}