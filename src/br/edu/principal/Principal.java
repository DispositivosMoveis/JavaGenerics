package br.edu.principal;

import br.edu.pacoteUm.Pessoa;

public class Principal {

	public static void main(String[] args) {
		/**
		 * Instanciando uma classe com generics
		 * Aqui é passado o tipo String, assim todos os métodos definidos com generics
		 * irão assumir esta característica
		 */
		Pessoa<String> pString = new Pessoa<String>();
		
		pString.setInfo("Esta informação é uma String");
		
		System.out.println("Valor digitado: "+pString.getInformacaoPessoa());
		System.out.println(pString);
		System.out.println();
		
		/**
		 * A mesma classe assumindo o tipo inteiro
		 * Generics só aceitam classes, nunca tipos primitivos
		 */
		Pessoa<Integer> pInteger = new Pessoa<Integer>(); 
		pInteger.setInfo(100);
		System.out.println("Valor digitado: "+pInteger.getInformacaoPessoa());
		System.out.println(pInteger);
	
		/**
		 * A mesma classe assumindo o tipo double
		 * Generics só aceitam classes, nunca tipos primitivos
		 */
		Pessoa<Double> pDouble = new Pessoa<Double>(); 
		pDouble.setInfo(100.00);
		System.out.println("Valor digitado: "+pDouble.getInformacaoPessoa());
		System.out.println(pDouble);		
		
	}

}
