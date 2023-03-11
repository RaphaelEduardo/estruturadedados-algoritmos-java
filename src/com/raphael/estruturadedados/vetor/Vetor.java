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
	public void adiciona(String elemento) throws Exception {
		if (this.tamanho < this.elementos.length) {
			 this.elementos[this.tamanho] = elemento;
			 this.tamanho++;	
		} else {
			throw new Exception("O vetor já está cheio, não é possivel adicionar mais elementos!");
		}
		
	}
	
	
	
}
