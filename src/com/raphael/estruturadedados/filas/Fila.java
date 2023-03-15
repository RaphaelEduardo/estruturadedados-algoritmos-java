package com.raphael.estruturadedados.filas;

import com.raphael.estruturadedados.base.EstruturaEstatica;

public class Fila<T> extends EstruturaEstatica<T>{

	public Fila() {
		super();
	}

	public Fila(int capacidade) {
		super(capacidade);
	}
	
	// Adiciona um elemento no final da fila
	public void enfileirar(T elemento) {
		/* 
		 * 1ª SOLUÇÃO:
		 * this.elementos[this.tamanho] = elemento;
		 * this.tamanho++;
		 * 
		 * 2ª SOLUÇÃO: 
		 * this.elementos[this.tamanho++] = elemento;
		 */
		
		this.adiciona(elemento);
	}

	// Verifica se a fila está vazia
	public boolean estaVazia() {
		return false;
	}

	// Espia o final ou inicio da fila
	public T espiar() {
	}

	// Remove um elemento do inicio da fila
	public T desenfileirar(T elemento) {
		return elemento;
	}

}
