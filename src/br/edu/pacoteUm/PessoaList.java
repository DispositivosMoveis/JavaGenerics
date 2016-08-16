package br.edu.pacoteUm;

import java.util.HashMap;

public class PessoaList<T extends Pessoa<String>> {

	private HashMap<String,T> pessoas = new HashMap<String,T>();
	
	public T getPessoa(int i){
		return pessoas.get(i);
	}
	
	public void addPessoa(T pessoa){
		pessoas.put(pessoa.getInfo(),pessoa);
	}
	
}
