package br.com.contmatic.empresa.util;

import java.util.InputMismatchException;

public class ValidaCPF {
	
	public static void validarCpf(String cpf){
		validaErroFormadoPorNumerosIguais(cpf);
		tamanhoDoCPF(cpf);
		naoNulo(cpf);
		soContemNumeros(cpf);
    }


	public static void validaErroFormadoPorNumerosIguais(String CPF) {
        // considera-se erro CPF's formados por uma sequencia de numeros iguais
        if (CPF.equals("00000000000") ||
            CPF.equals("11111111111") ||
            CPF.equals("22222222222") || CPF.equals("33333333333") ||
            CPF.equals("44444444444") || CPF.equals("55555555555") ||
            CPF.equals("66666666666") || CPF.equals("77777777777") ||
            CPF.equals("88888888888") || CPF.equals("99999999999") ){
        	 throw new IllegalStateException("O CPF do funcionário informado é inválido. Verifique se o mesmo está correto.");
        } }
        
	public static void tamanhoDoCPF(String CPF){
        if (CPF.length() != 11){
            throw new IllegalArgumentException("O CPF do funcionário informado é inválido. Deve ter 11 caracteres.");
        }
    }

  
  public static void naoNulo(String CPF){
        if (CPF == null){
            throw new IllegalArgumentException("O CPF do funcionário é inválido, não pode ser nulo.");
        }
    }
   
  public static void soContemNumeros(String CPF) {
	  try {
          Double num = Double.parseDouble(CPF);
      } catch (NumberFormatException e) {
    	  throw new IllegalStateException("O CPF do funcionário informado é inválido. Verifique se o mesmo está correto.");
      } 
    	  
  }

       
  }
  

