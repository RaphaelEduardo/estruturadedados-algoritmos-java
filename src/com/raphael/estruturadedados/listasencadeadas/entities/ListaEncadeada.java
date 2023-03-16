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
	
	@Override
	public String toString() {
		return "Lista Encadeada: Inicio -> [" + inicio + "]";
	}
	
}
