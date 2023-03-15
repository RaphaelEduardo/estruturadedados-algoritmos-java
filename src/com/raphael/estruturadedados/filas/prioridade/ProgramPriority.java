package com.raphael.estruturadedados.filas.prioridade;

import java.util.PriorityQueue;

public class ProgramPriority {

	public static void main(String[] args) {

		PriorityQueue<Integer> filaComPrioridade = new PriorityQueue<>();
		
		// Enfileira
		filaComPrioridade.add(5);
		filaComPrioridade.add(7);
		filaComPrioridade.add(2);
		filaComPrioridade.add(10);
		
		
		// toString
		System.out.println(filaComPrioridade);

		// Desenfileira
		filaComPrioridade.remove();

		// toString
		System.out.println(filaComPrioridade);
	}

}
