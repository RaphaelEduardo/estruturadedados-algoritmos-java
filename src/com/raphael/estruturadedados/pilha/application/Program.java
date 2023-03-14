package com.raphael.estruturadedados.pilha.application;

import com.raphael.estruturadedados.pilha.Pilha;

public class Program {

	public static void main(String[] args) {
		
		
		Pilha<Integer> pilha = new Pilha<>();
		
		System.out.println("A pilha está vazia? " + pilha.estaVazia());
		
		for (int i=1; i<=10; i++) {
			pilha.empilha(i);
		}
		
		System.out.println("A pilha está vazia? " + pilha.estaVazia());
		
		System.out.println("Topo da pilha: " + pilha.topo());
	
		System.out.println("Tamanho da pilha: " + pilha.tamanho());
		
		System.out.println("Pilha: " + pilha);
		
	
	
	
	
	}
}
