package com.raphael.estruturadedados.base;

public class EstruturaEstatica<T> {

	protected T[] elementos;
	protected int tamanho;

	@SuppressWarnings("unchecked")
	public EstruturaEstatica(int capacidade) {
		elementos = (T[]) new Object[capacidade];
		tamanho = 0;
	}

	public EstruturaEstatica() {
		this(10);
	}

	// Verifica se a pilha esta vazia
	public boolean estaVazia() {
		return this.tamanho == 0;
	}

	// Adiciona um elemento no final do vetor
	protected boolean adiciona(T elemento) {
		this.aumentaCapacidade();
		if (this.tamanho < this.elementos.length) {
			this.elementos[this.tamanho] = elemento;
			this.tamanho++;
			return true;
		} else {
			return false;
		}
	}

	// Adicionar elemento em qualquer posição
	protected boolean adicionaPorPosicao(int posicao, T elemento) {
		if (!(posicao >= 0 || posicao < tamanho)) {
			throw new IllegalArgumentException("Posição inválida!");
		}
		this.aumentaCapacidade();
		
		//Move todos os elementos
		for (int i = this.tamanho - 1; i >= posicao; i--) {
			elementos[i + 1] = elementos[i];
		}
		elementos[posicao] = elemento;
		tamanho++;
		return true;
	}

	// Remove elementos do vetor pela posicao
	protected void remove(int posicao) {
		if (!(posicao >= 0 && posicao < tamanho)) {
			throw new IllegalArgumentException("Posição inválida!");
		}
		for (int i = posicao; i < this.tamanho - 1; i++) {
			elementos[i] = elementos[i + 1];
		}
		this.tamanho--;
	}

	// Adicionar capacidade ao vetor (sempre que precisar de mais espaço)
	@SuppressWarnings("unchecked")
	protected void aumentaCapacidade() {
		if (this.tamanho == this.elementos.length) {
			T[] elementosNovos = (T[]) new Object[this.elementos.length * 2];
			for (int i = 0; i < this.elementos.length; i++) {
				elementosNovos[i] = elementos[i];
			}
			this.elementos = elementosNovos;
		}
	}

	public int tamanho() {
		return this.tamanho;
	}

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
