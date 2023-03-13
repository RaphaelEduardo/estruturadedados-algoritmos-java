package com.raphael.estruturadedados.vetor.exercicios;

import java.util.ArrayList;

import com.raphael.estruturadedados.vetor.Lista;

public class Exercicio02 {

	// .lastIndexOf()
	public static void main(String[] args) {

		ArrayList<String> list = new ArrayList<>(5);

		list.add("A");
		list.add("B");
		list.add("A");
		list.add("C");
		list.add("A");

		// retorna a ultima posicao que o elemento se encontra na lista
		System.out.println(list.lastIndexOf("A"));
		
		Lista<String> lista = new Lista<>(5);

		lista.adiciona("A");
		lista.adiciona("B");
		lista.adiciona("A");
		lista.adiciona("C");
		lista.adiciona("A");

		System.out.println(lista.ultimoIndice("A"));
		
		
	}
}
