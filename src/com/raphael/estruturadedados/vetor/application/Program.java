package com.raphael.estruturadedados.vetor.application;

import com.raphael.estruturadedados.vetor.Contato;
import com.raphael.estruturadedados.vetor.GeneralizarTipoDoVetor;

public class Program {

	public static void main(String[] args) {

		GeneralizarTipoDoVetor vetor = new GeneralizarTipoDoVetor(2);

		Contato c1 = new Contato("Contato 1", "9852-2518", "c1@gmail.com");
		Contato c2 = new Contato("Contato 2", "1248-5481", "c2@gmail.com");
		Contato c3 = new Contato("Contato 3", "2134-8184", "c3@gmail.com");
		
		Contato c4 = new Contato("Contato 4", "1854-9848", "c4@gmail.com");
		
		vetor.adiciona(c1);
		vetor.adiciona(c2);
		vetor.adiciona(c3);
		
		
		int pos = vetor.existe(c4);
		if (pos > -1) {
			System.out.println("Existe!");
			
		} else {
			System.out.println("Não existe!");
		}
		
		System.out.println("Tamanho = " + vetor.tamanho());
		System.out.println(vetor);

	}
}
