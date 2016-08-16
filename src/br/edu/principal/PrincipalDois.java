package br.edu.principal;

import br.edu.pacoteUm.Pessoa;
import br.edu.pacoteUm.PessoaList;

public class PrincipalDois {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PessoaList<Pessoa<String>> pessoasList = new PessoaList<Pessoa<String>>();
		
		/**
		 * Adicionando duas pessoas na listagem
		 */
		Pessoa<String> pessoa1 = new Pessoa<String>();
		
		pessoa1.setInfo("Ciclano");
		
		pessoasList.addPessoa(pessoa1);

		Pessoa<String> pessoa2 = new Pessoa<String>();
		
		pessoa2.setInfo("Fulano");
		
		pessoasList.addPessoa(pessoa2);		
		
		pessoasList.addPessoa(pessoa2);
		
	}

}
