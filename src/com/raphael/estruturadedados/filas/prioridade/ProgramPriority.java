package com.raphael.estruturadedados.filas.prioridade;

import java.util.Comparator;
import java.util.PriorityQueue;

public class ProgramPriority {

	public static void main(String[] args) {

		PriorityQueue<Paciente> filaComPrioridade = new PriorityQueue<>(
				new Comparator<Paciente>() {
					@Override
					public int compare(Paciente p1, Paciente p2) {
						return Integer.valueOf(p1.getPrioridade()).compareTo(p2.getPrioridade());
					}
				}
		);

		// Enfileira
		filaComPrioridade.add(new Paciente("João", 7));
		filaComPrioridade.add(new Paciente("José", 5));

		// toString
		System.out.println(filaComPrioridade);

	}

}
