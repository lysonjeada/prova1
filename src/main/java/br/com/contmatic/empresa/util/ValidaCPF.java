package br.com.contmatic.empresa.util;

import java.util.InputMismatchException;

public class ValidaCPF {

	public static void validarCpf(String cpf) {
		validaErroFormadoPorNumerosIguais(cpf);
		tamanhoDoCPF(cpf);
		naoNulo(cpf);
		soContemNumeros(cpf);
		validarCpf(cpf);
	}

	public static void validaErroFormadoPorNumerosIguais(String CPF) {
		// considera-se erro CPF's formados por uma sequencia de numeros iguais
		if (CPF.equals("00000000000") || CPF.equals("11111111111") || CPF.equals("22222222222")
				|| CPF.equals("33333333333") || CPF.equals("44444444444") || CPF.equals("55555555555")
				|| CPF.equals("66666666666") || CPF.equals("77777777777") || CPF.equals("88888888888")
				|| CPF.equals("99999999999")) {
			throw new IllegalStateException(
					"O CPF do funcionário informado é inválido. Verifique se o mesmo está correto.");
		}
	}

	public static void tamanhoDoCPF(String CPF) {
		if (CPF.length() != 11) {
			throw new IllegalArgumentException("O CPF do funcionário informado é inválido. Deve ter 11 caracteres.");
		}
	}

	public static void naoNulo(String CPF) {
		if (CPF == null) {
			throw new IllegalArgumentException("O CPF do funcionário é inválido, não pode ser nulo.");
		}
	}

	public static void soContemNumeros(String CPF) {
		try {
			Double num = Double.parseDouble(CPF);
		} catch (NumberFormatException e) {
			throw new IllegalStateException("O CPF do funcionário informado é inválido, só poderá conter números.");
		}

	}

	public static void validarDigitos(String CPF) {
		int d1, d2;
		int digito1, digito2, resto;
		int digitoCPF;
		String nDigResult;
		d1 = d2 = 0;
		digito1 = digito2 = resto = 0;
		for (int nCount = 1; nCount < CPF.length() - 1; nCount++) {
			digitoCPF = Integer.valueOf(CPF.substring(nCount - 1, nCount)).intValue();
			d1 = d1 + (11 - nCount) * digitoCPF;
			d2 = d2 + (12 - nCount) * digitoCPF;
		}
		;
		resto = (d1 % 11);
		if (resto < 2) {
			digito1 = 0;
		} else {
			digito1 = 11 - resto;
		}
		d2 += 2 * digito1;
		resto = (d2 % 11);
		if (resto < 2) {
			digito2 = 0;
		} else {
			digito2 = 11 - resto;
		}
		String nDigVerific = CPF.substring(CPF.length() - 2, CPF.length());
		nDigResult = String.valueOf(digito1) + String.valueOf(digito2);
		boolean resultado = nDigVerific.equals(nDigResult);
		if (resultado == true) {
			return;
		} else {
			throw new IllegalStateException("O CPF do funcionário informado é inválido.");
		}
	}

}

