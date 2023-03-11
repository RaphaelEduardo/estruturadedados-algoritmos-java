package com.raphael.estruturadedados.vetor.teste;

import com.raphael.estruturadedados.vetor.Vetor;

public class Teste {

	public static void main(String[] args) {
		
		Vetor vetor = new Vetor(2);

		try {
			vetor.adiciona("2");
			vetor.adiciona("2");
			vetor.adiciona("2");
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}
