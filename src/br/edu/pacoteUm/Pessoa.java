package br.edu.pacoteUm;

/**
 * 
 * Generics permite definir alguns tipos de dados que metodos e 
 * atributos podem acessar.
 * Não se sabe ainda que tipo é T
 * T deverá ser sempre uma classe. Não se usa tipo primitivo.
 */
public class Pessoa<T> {

	private T info;
	
	public void setInfo(T info){
		this.info = info;
	}
	
	public T getInformacaoPessoa(){
		return info;
	};
	
	@Override
	public String toString(){
		return "Esta classe está manipulando o tipo: "+info.getClass().getSimpleName() ;
		
	}
	
}
