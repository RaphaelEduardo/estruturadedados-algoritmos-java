package com.raphael.estruturadedados.pilha.application;

import com.raphael.estruturadedados.pilha.Pilha;

public class Program {

	public static void main(String[] args) {
		
		
		Pilha<Integer> pilha = new Pilha<>();
		
		for (int i=1; i<=10; i++) {
			pilha.empilha(i);
		}
		
		System.out.println(pilha);
		System.out.println(pilha.tamanho());
	
	
	
	
	}
}
