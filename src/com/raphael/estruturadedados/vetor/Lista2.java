package com.raphael.estruturadedados.vetor;

import com.raphael.estruturadedados.base.EstruturaEstatica;

public class Lista2<T> extends EstruturaEstatica<T> {

	public Lista2() {
		super();
	}
	
	public Lista2(int capacidade) {
		super(capacidade);
	}
	
	public boolean adiciona(T elemento) {
		return super.adiciona(elemento);
	}

	public boolean adicionaPorPosicao(int posicao, T elemento) {
		return super.adicionaPorPosicao(posicao, elemento);
	}
	
	public void remove(int posicao) {
		super.remove(posicao);
	}
	
	public T busca(int posicao) {
		if (!(posicao >= 0 && posicao < tamanho)) {
			throw new IllegalArgumentException("Posição invalida");
		}
		return elementos[posicao];
	}	
	
	public int existe(T elemento) {
		for (int i=0; i<this.tamanho; i++) {
			if (this.elementos[i].equals(elemento)) {
				return i;
			}			
		} 
		return -1;
	}
	
}
