package com.raphael.estruturadedados.vetor.application;

import com.raphael.estruturadedados.vetor.Vetor;

public class Program {

	public static void main(String[] args) {

		Vetor vetor = new Vetor(3);

		vetor.adiciona("A");
		vetor.adiciona("B");
		vetor.adiciona("C");
		vetor.adiciona("D");
		System.out.println(vetor);
		
		vetor.remove(vetor.existe("B"));
		System.out.println(vetor);
		
		
		
	}
}
