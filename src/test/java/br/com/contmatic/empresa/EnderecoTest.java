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
	public static void before() {
		
	}

	@AfterClass
	public static void after() {
		
	}

	private Endereco endereco;

	Empresa empresa = new Empresa();

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
		endereco.setRua("Rua Berto Conde");
		assertEquals("Rua Berto Conde", endereco.getRua());

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
		endereco2.setRua("Rua Berto Conde");
		assertEquals("Rua Berto Conde", endereco2.getRua());

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

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	public Endereco getEndereco2() {
		return endereco2;
	}

	public void setEndereco2(Endereco endereco2) {
		this.endereco2 = endereco2;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((endereco == null) ? 0 : endereco.hashCode());
		result = prime * result + ((endereco2 == null) ? 0 : endereco2.hashCode());
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
		EnderecoTest other = (EnderecoTest) obj;
		if (endereco == null) {
			if (other.endereco != null)
				return false;
		} else if (!endereco.equals(other.endereco))
			return false;
		if (endereco2 == null) {
			if (other.endereco2 != null)
				return false;
		} else if (!endereco2.equals(other.endereco2))
			return false;
		return true;
	}

}
