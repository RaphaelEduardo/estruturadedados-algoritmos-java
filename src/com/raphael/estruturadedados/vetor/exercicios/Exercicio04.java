package com.raphael.estruturadedados.vetor.exercicios;

import com.raphael.estruturadedados.vetor.Lista;

public class Exercicio04 {

	public static void main(String[] args) {

		Lista<String> lista = new Lista<>(5);

		lista.adiciona("A");
		lista.adiciona("B");
		lista.adiciona("C");
		lista.adiciona("D");
		lista.adiciona("E");
		
		System.out.println(lista.obtem(0));
		System.out.println(lista.obtem(3));
		
	}
}
