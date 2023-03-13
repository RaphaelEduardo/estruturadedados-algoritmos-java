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
	
	// Remove elementos do vetor tendo o elemento como parametro
	public void removeElemento(T elemento) {
		int posicao = this.existe(elemento);
		if (posicao > -1) {
			this.remove(posicao);
		}
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
		for (int i=0; i<this.tamanho; i++) {
			if (this.elementos[i].equals(elemento)) {
				return i;
			}			
		} 
		return -1;
	}
	
	// Retorna um elemento a partir da posição (similar ao get)
	public T obtem(int posicao) {
		return (T) this.busca(posicao);
	}
	
	// Metodo similar ao lastIndexOf() - Grava a ultima posição que o elemento foi encontrado na lista.
	public int ultimoIndice(T elemento) {
		// Buscando de tras pra frente (para tornar o processo mais rapido)
		for (int i=this.tamanho-1; i>=0; i--) {
			if (this.elementos[i].equals(elemento)) {
				return i;
			}
		}
		return -1;
	}
	
	
	// metodo contem
	public boolean contem(T elemento) {
	
		/*
		 * int posicao = existe(elemento);
		 * if (posicao > -1) {
		 *     return true;
		 * }
		 * return false;
		 */
		
		return existe(elemento) > -1; // >=0
	
	}
	
	// Esvaziar a lista, apagar todos os elementos
	public void limpar() {
		/*
		 * Alternativa 1:
		 * this.elementos = new Object[(T[]) this.elementos.lenght];
		 * 
		 * Alternativa 2:
		 * this.tamanho = 0;
		 * 
		 * Alternativa 3:
		 */
		
		for (int i=0; i<this.tamanho; i++) {
			this.elementos[i] = null;
		}
		this.tamanho = 0;
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
