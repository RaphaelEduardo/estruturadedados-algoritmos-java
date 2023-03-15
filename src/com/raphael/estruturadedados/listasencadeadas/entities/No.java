package com.raphael.estruturadedados.listasencadeadas.entities;

public class No<T> {

	private T elemento; // Onde vai ser guardado o valor.
	private No<T> proximo; 

	// Inicia o nó apontando pra null
	public No(T elemento) {
		this.elemento = elemento;
		this.proximo = null;
	}

	public No(T elemento, No<T> proximo) {
		super();
		this.elemento = elemento;
		this.proximo = proximo;
	}

	public T getElemento() {
		return elemento;
	}

	public void setElemento(T elemento) {
		this.elemento = elemento;
	}

	public No<T> getProximo() {
		return proximo;
	}

	public void setProximo(No<T> proximo) {
		this.proximo = proximo;
	}

	@Override
	public String toString() {
		return "No [elemento=" + elemento + ", proximo=" + proximo + "]";
	}

}
