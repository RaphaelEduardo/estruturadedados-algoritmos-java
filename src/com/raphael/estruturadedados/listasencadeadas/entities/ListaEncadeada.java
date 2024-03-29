package com.raphael.estruturadedados.listasencadeadas.entities;

public class ListaEncadeada<T> {

	private No<T> inicio;
	private No<T> ultimo;
	private int tamanho = 0;

	// O inicio vai começar a apontar para o nó adicionado
	public void adicionar(T elemento) {
		No<T> no = new No<T>(elemento);
		if (tamanho == 0) {
			this.inicio = no;
			this.ultimo = no;
		} else {
			this.ultimo.setProximo(no);
		}
		this.ultimo = no;
		this.tamanho++;
	}

	public int getTamanho() {
		return this.tamanho;
	}

	public void limpar() {
		/*
		 *  ALTERNATIVA 01: MAIS SIMPLES
		 *  this.inicio = null;
		 *  this.ultimo = null;
		 *  this.tamanho = 0;
		 *  
		 *  ALTERNATIVA 02: OTIMIZADA (BOA PRÁTICA)
		 *  (Declaração/Inicialização; Condição; Incremento/Decremento)
		 */
		for (No<T> atual = this.inicio; atual != null;) {
			No<T> proximo = atual.getProximo();
			atual.setElemento(null);
			atual.setProximo(null);
			atual = proximo;
		}
		
		this.inicio = null;
		this.ultimo = null;
		this.tamanho = 0;
		
	}
	
	@Override
	public String toString() {
		// [inicio, atual, final -> null]
		if (this.tamanho == 0) {
			return "[]";
		}
		StringBuilder builder = new StringBuilder("[");

		No<T> atual = this.inicio;
		for (int i = 0; i < this.tamanho - 1; i++) {
			builder.append(atual.getElemento()).append(", ");
			atual = atual.getProximo();
		}
		builder.append(atual.getElemento()).append("]");
		/*
         * builder.append(atual.getElemento()).append(",");
         * while (atual.getProximo() != null) {
         * atual = atual.getProximo();
         * builder.append(atual.getElemento()).append(",");
         * }
         */
		return builder.toString();
	}

}
