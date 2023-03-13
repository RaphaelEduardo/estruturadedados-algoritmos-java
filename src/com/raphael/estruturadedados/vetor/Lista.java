package com.raphael.estruturadedados.vetor;

// Utilizando Generics
public class Lista<T> {

	
	private T[] elementos;
	private int tamanho;

	// Cria um vetor com a capacidade de elementos informada
	public Lista(int capacidade) {
		this.elementos =  (T[]) new Object[capacidade]; // Solução do livro "Java Efetivo"
		this.tamanho = 0;
	}

	/*
	 * #Solução alternativa
	 *public Lista(int capacidade, Class<T> tipoClasse) {
	 *  this.elementos = (T[]) Array.newInstance(tipoClasse, capacidade);
	 *	this.tamanho = 0;
	 *}
	 */
	
	
	// Adiciona um elemento no final do vetor
	public boolean adiciona(T elemento) {
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
	public boolean adicionaPorPosicao(int posicao, T elemento) {
		if (!(posicao >= 0 && posicao<tamanho)) {
			throw new IllegalArgumentException("Posição inválida!");
		}
		this.aumentaCapacidade();
		for (int i=this.tamanho-1; i>=posicao; i--) {
			elementos[i+1] = elementos [i];
		}
		elementos[posicao] = elemento;
		tamanho++;
		return true;
	}
	
	// Adicionar capacidade ao vetor (sempre que precisar de mais espaço)
	private void aumentaCapacidade() {
		if (this.tamanho == this.elementos.length) {
			T[] elementosNovos = (T[]) new Object[this.elementos.length * 2];
			for (int i=0; i<this.elementos.length; i++) {
				elementosNovos[i] = elementos[i];
			}
			this.elementos = elementosNovos;
		}
	}

	// Remove elementos do vetor pela posicao
	public void remove(int posicao) {
		if (!(posicao >= 0 && posicao<tamanho)) {
			throw new IllegalArgumentException("Posição inválida!");
		}
		for (int i=posicao; i<this.tamanho-1; i++) {
			elementos[i] = elementos[i+1];
		}
		this.tamanho--;
		
	}
	
	// Busca elemento no vetor (pela posição)
	public Object busca(int posicao) {
		if (!(posicao >= 0 && posicao < tamanho)) {
			throw new IllegalArgumentException("Posição invalida");
		}
		return this.elementos[posicao];
	}	

	/*
	 *  Verificar se um elemento existe no vetor
	 *  Se existir, retorna a posição que foi encontrado
	 *  Se não, retorna -1 que é uma posição inexistente no vetor
	 */
	public int existe(T elemento) {
		// Busca Sequencial
		for (int i=0; i<this.tamanho; i++) {
			if (this.elementos[i].equals(elemento)) {
				return i;
			}			
		} 
		return -1;
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
