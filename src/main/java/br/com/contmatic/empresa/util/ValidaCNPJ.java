package br.com.contmatic.empresa.util;

import java.util.InputMismatchException;

public class ValidaCNPJ {
	
	 public static void validarCnpj(String cnpj){
		 	recebeErroFormadoPorNumerosIguais(cnpj);
		 	tamanhoDoCNPJ(cnpj);
		 	naoNulo(cnpj);
		 	soContemNumeros(cnpj);
		 	validaDigitos(cnpj);
	    }

	 public static int QUANTIDADE_DIGITOS_CNPJ = 14;

	 public static void recebeErroFormadoPorNumerosIguais(String CNPJ) {
		    if (CNPJ.equals("00000000000000") || CNPJ.equals("11111111111111") ||
		        CNPJ.equals("22222222222222") || CNPJ.equals("33333333333333") ||
		        CNPJ.equals("44444444444444") || CNPJ.equals("55555555555555") ||
		        CNPJ.equals("66666666666666") || CNPJ.equals("77777777777777") ||
		        CNPJ.equals("88888888888888") || CNPJ.equals("99999999999999")) {
		    	throw new IllegalStateException("O CNPJ da empresa informado é inválido.");
		    }
	 }
	 
	  public static void tamanhoDoCNPJ(String CNPJ){
	        if (CNPJ.length() != 14){
	            throw new IllegalArgumentException("O CNPJ da empresa informado é inválido. Deve ter 14 caracteres.");
	        }
	    }

	  
	  public static void naoNulo(String CNPJ){
	        if (CNPJ == null){
	            throw new IllegalArgumentException("O CNPJ da empresa é inválido, não pode ser nulo.");
	        }
	    }

	  public static void soContemNumeros(String CNPJ) {
		  try {
	          Double num = Double.parseDouble(CNPJ);
	      } catch (NumberFormatException e) {
	    	  throw new IllegalStateException("O CPF do funcionário informado é inválido.");
	      } 
	    	  
	  }
	  
		public static void validaDigitos(String CNPJ) {
			if (CNPJ.equals("00000000000000") || (CNPJ.equals(""))) {
				throw new IllegalStateException(
						"O CPF do funcionário informado é inválido.");
			}
			int soma = 0, aux, dig;
			String cnpj_calc = CNPJ.substring(0, 12);
			char[] chr_cnpj = CNPJ.toCharArray();
			for (int i = 0; i < 4; i++) {
				if (chr_cnpj[i] - 48 >= 0 && chr_cnpj[i] - 48 <= 9) {
					soma += (chr_cnpj[i] - 48) * (6 - (i + 1));
				}
			}
			for (int i = 0; i < 8; i++) {
				if (chr_cnpj[i + 4] - 48 >= 0 && chr_cnpj[i + 4] - 48 <= 9) {
					soma += (chr_cnpj[i + 4] - 48) * (10 - (i + 1));
				}
			}
			dig = 11 - (soma % 11);
			cnpj_calc += (dig == 10 || dig == 11) ? "0" : Integer.toString(dig);
			soma = 0;
			for (int i = 0; i < 5; i++) {
				if (chr_cnpj[i] - 48 >= 0 && chr_cnpj[i] - 48 <= 9) {
					soma += (chr_cnpj[i] - 48) * (7 - (i + 1));
				}
			}
			for (int i = 0; i < 8; i++) {
				if (chr_cnpj[i + 5] - 48 >= 0 && chr_cnpj[i + 5] - 48 <= 9) {
					soma += (chr_cnpj[i + 5] - 48) * (10 - (i + 1));
				}
			}
			dig = 11 - (soma % 11);
			cnpj_calc += (dig == 10 || dig == 11) ? "0" : Integer.toString(dig);
			boolean resultado = CNPJ.equals(cnpj_calc);
			if (resultado == true) {
				return;
			} else {
				throw new IllegalStateException(
						"O CPF do funcionário informado é inválido.");
			}
		}
	}
