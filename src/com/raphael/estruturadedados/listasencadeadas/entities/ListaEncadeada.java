package com.raphael.estruturadedados.listasencadeadas.entities;

public class ListaEncadeada<T> {

	private No<T> inicio; 
	
	// O inicio vai começar a apontar para o nó adicionado
	public void adicionar(T elemento) {
		No<T> no = new No<T>(elemento);
		this.inicio = no;
	}

	@Override
	public String toString() {
		return "ListaEncadeada: Inicio -> [" + inicio + "]";
	}
	
}
