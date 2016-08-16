package br.edu.pacoteUm;

import java.util.HashMap;

/**
 * Generics usados no Java
 * 
 * 	E - Elements
 *  K - Keys
 *  N - Numbers
 *  T - Type
 *  V - Value
 * 
 * @author welder
 *
 * @param <T>
 */


public class PessoaList<T extends Pessoa<String>> {

	private HashMap<String,T> pessoas = new HashMap<String,T>();
	
	public T getPessoa(int i){
		return pessoas.get(i);
	}
	
	public void addPessoa(T pessoa){
		pessoas.put(pessoa.getInfo(),pessoa);
	}
	
}
