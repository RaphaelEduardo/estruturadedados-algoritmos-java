package com.raphael.estruturadedados.vetor;

public class Vetor {

	private String[] elementos;
	private int tamanho;
	
	// Cria um vetor com a capacidade (tamanho) de elementos informada
	public Vetor(int capacidade) {
		this.elementos = new String[capacidade];
		this.tamanho = 0;
	}
	
	// Adiciona um elemento no final do vetor
	public Boolean adiciona(String elemento) {
		if (this.tamanho < this.elementos.length) {
			 this.elementos[this.tamanho] = elemento;
			 this.tamanho++;	
			 return true;
		} else {
			return false;	
		}
	}
	
	
	
}
