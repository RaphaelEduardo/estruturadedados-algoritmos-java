package com.raphael.estruturadedados.vetor.exercicios;

import java.util.ArrayList;

import com.raphael.estruturadedados.vetor.Lista;

public class Exercicio05 {
	
	public static void main(String[] args) {
		
		ArrayList<String> list = new ArrayList<>(5);

		list.add("A");
		list.add("B");
		list.add("C");
		list.add("D");
		list.add("E");
		
		list.clear();
		
		System.out.println(list);
		
		
		Lista<String> lista = new Lista<>(5);

		lista.adiciona("A");
		lista.adiciona("B");
		lista.adiciona("C");
		lista.adiciona("D");
		lista.adiciona("E");
		
		lista.limpar();
		
		System.out.println(lista);
		

	}
}
