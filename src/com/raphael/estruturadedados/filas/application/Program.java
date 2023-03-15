package com.raphael.estruturadedados.filas.application;

import com.raphael.estruturadedados.filas.Fila;

public class Program {

	public static void main(String[] args) {
		
		Fila<Integer> fila = new Fila<>();
		
		fila.enfileirar(1);
		fila.enfileirar(10);
		fila.enfileirar(100);
		fila.enfileirar(1000);
		
		System.out.println(fila.estaVazia());
		System.out.println(fila.tamanho());
		System.out.println(fila.espiar());
		
		
		System.out.println(fila.toString());
		
	}
	
	
	
}
