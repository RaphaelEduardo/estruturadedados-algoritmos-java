package com.raphael.estruturadedados.filas;

public class FilaComPrioridade<T> extends Fila<T> {

	// Adiciona um elemento levando em conta a prioridade 
	public void enfileirar(T elemento) {
		
		Comparable<T> chave = (Comparable<T>) elemento;
		
		int i;
		for (i=0; i<this.tamanho; i++) {
			if (chave.compareTo(this.elementos[i]) < 0) {
				break;
			}
		}
		this.adicionaPorPosicao(i, elemento);
	}
	
	

}
