package com.raphael.estruturadedados.pilha;

import com.raphael.estruturadedados.base.EstruturaEstatica;

public class Pilha<T> extends EstruturaEstatica<T> {

	public Pilha() {
		super();
	}
	
	public Pilha(int capacidade) {
		super(capacidade);
	}
	
	// Adiciona um elemento no topo da pilha
	public void empilha(T elemento) {
		super.adiciona(elemento);
	}
	
	
	
}
