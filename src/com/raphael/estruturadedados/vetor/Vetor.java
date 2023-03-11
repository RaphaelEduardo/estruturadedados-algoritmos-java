package com.raphael.estruturadedados.vetor;

import java.util.Arrays;

public class Vetor {

	private String[] elementos;

	// tamanho real do vetor
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

	// Busca elemento no vetor (pela posição)
	public String busca(int posicao) {
		if (!(posicao >= 0 && posicao < tamanho)) {
			throw new IllegalArgumentException("Posição invalida");
		} else {
			return this.elementos[posicao];
		}
	}	

	// Verifica o tamanho real do vetor
	public int tamanho() {
		return this.tamanho;
	}

	// Imprime todos os elementos do vetor
	@Override
	public String toString() {
		StringBuilder s = new StringBuilder();
		s.append("[");

		for (int i = 0; i < this.tamanho - 1; i++) {
			s.append(this.elementos[i]);
			s.append(", ");
		}
		if (this.tamanho > 0) {
			s.append(this.elementos[this.tamanho - 1]);
		}
		s.append("]");
		return s.toString();
	}

}
