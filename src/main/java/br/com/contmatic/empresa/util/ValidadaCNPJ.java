package br.com.contmatic.empresa.util;

import java.util.InputMismatchException;

public class ValidadaCNPJ {
	
	 public static void validarCnpj(String cnpj){
		 	recebeErroFormadoPorNumerosIguais(cnpj);
		 	tamanhoDoCNPJ(cnpj);
		 	naoNulo(cnpj);
		 	soContemNumeros(cnpj);
	    }


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
	    	  throw new IllegalStateException("O CPF do funcionário informado é inválido. Verifique se o mesmo está correto.");
	      } 
	    	  
	  }
	  
	  public static void VerificaUltimosDigitos (String CNPJ) {
		  
	  }
		  
}
