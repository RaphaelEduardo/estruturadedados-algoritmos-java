package com.raphael.estruturadedados.vetor.application;

import com.raphael.estruturadedados.vetor.Vetor;

public class Program {

	public static void main(String[] args) {

		Vetor vetor = new Vetor(10);

		vetor.adiciona("Elemento 1");
		vetor.adiciona("Elemento 2");
		vetor.adiciona("Elemento 3");
		vetor.adiciona("Elemento 5");
		vetor.adiciona("Elemento 6");
		vetor.adiciona("Elemento 7");
		
		vetor.adicionaPosicao(0, "Elemento 0");
		System.out.println(vetor);
		
		vetor.adicionaPosicao(4, "Elemento 4");
		System.out.println(vetor);
		
		
	}
}
