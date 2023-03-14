package com.raphael.estruturadedados.pilha;

import com.raphael.estruturadedados.base.EstruturaEstatica;

public class Pilha<T> extends EstruturaEstatica<T> {

	public Pilha() {
		super();
	}

	public Pilha(int capacidade) {
		super(capacidade);
	}

	// Adiciona um elemento no topo da pilha (push)
	public void empilha(T elemento) {
		super.adiciona(elemento);
	}

	// Verifica o elemento do topo da pilha
	public T topo() {
		if (this.estaVazia()) {
			return null;
		} else {
			return this.elementos[tamanho - 1];
		}
	}

	// Remover um elemento do topo da pilha (pop)
	public T desempilha() {
		if (this.estaVazia()) {
			return null;
		} else {
			/*
			 * T elemento = this.elementos[tamanho-1];
			 * tamanho--;
			 */
			return this.elementos[--tamanho];
		}
	}

}
