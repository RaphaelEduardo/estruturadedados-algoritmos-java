package com.raphael.estruturadedados.filas;

import com.raphael.estruturadedados.base.EstruturaEstatica;

public class Fila<T> extends EstruturaEstatica<T> {

	public Fila() {
		super();
	}

	public Fila(int capacidade) {
		super(capacidade);
	}

	// Adiciona um elemento no final da fila (QUEUE)
	public void enfileirar(T elemento) {
		/*
		 * 1ª SOLUÇÃO: this.elementos[this.tamanho] = elemento; this.tamanho++;
		 * 
		 * 2ª SOLUÇÃO: this.elementos[this.tamanho++] = elemento;
		 */

		this.adiciona(elemento);
	}

	// Verifica qual o primeiro elemento da fila
	public T espiar() {
		return this.elementos[0];
	}

	// Remove o primeiro elemento da fila (DEQUEUE)
	public T desenfileirar(T elemento) {
		final int posicao = 0;
		if (this.estaVazia()) {
			return null;
		} else {
			T elementoRemovido = this.elementos[posicao];
			this.remove(posicao);
			return elementoRemovido;
		}
	}

}
