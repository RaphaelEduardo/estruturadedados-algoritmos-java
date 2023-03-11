package com.raphael.estruturadedados.vetor;

public class Vetor {

	private String[] elementos;

	// Cria um vetor com a capacidade (tamanho) de elementos informada
	public Vetor(int capacidade) {
		this.elementos = new String[capacidade];
	}
	
	// Adiciona um elemento no final do vetor
	public void adiciona(String elemento) {
		 for (int i=0; i<this.elementos.length; i++) {
			 if(this.elementos[i] == null) {
				 this.elementos[i] = elemento;
				 break;
			 }
		 }
	}
	
	
	
}
