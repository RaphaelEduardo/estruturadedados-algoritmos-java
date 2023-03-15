package com.raphael.estruturadedados.filas.application;

import com.raphael.estruturadedados.filas.Fila;

public class Program {

	public static void main(String[] args) {
		
		Fila<Integer> fila = new Fila<>();
		
		fila.enfileirar(1);
		fila.enfileirar(10);
		fila.enfileirar(100);
		fila.enfileirar(1000);
		
		System.out.println("A fila está vazia? " + fila.estaVazia());
		System.out.println("Tamanho da fila: " + fila.tamanho() + "\n");
		
		System.out.println("Primeiro elemento da fila: " + fila.espiar());
		System.out.println("Fila: " + fila + "\n");
		
		System.out.println("Elemento desenfileirado: " + fila.desenfileirar(2));
		System.out.println("Fila: " + fila);
		
	}
	
	
	
}
