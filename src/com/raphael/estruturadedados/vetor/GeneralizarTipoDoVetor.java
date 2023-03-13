package com.raphael.estruturadedados.vetor;



public class GeneralizarTipoDoVetor {

	// "Classe pai" de todos o tipos
	private Object[] elementos;

	// tamanho real do vetor
	private int tamanho;

	// Cria um vetor com a capacidade de elementos informada
	public GeneralizarTipoDoVetor(int capacidade) {
		this.elementos = new Object[capacidade];
		this.tamanho = 0;
	}

	// Adiciona um elemento no final do vetor
	public boolean adiciona(Object elemento) {
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
	public boolean adicionaPorPosicao(int posicao, Object elemento) {
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
			Object[] elementosNovos = new Object[this.elementos.length * 2];
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
	public int existe(Object elemento) {
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
