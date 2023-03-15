package com.raphael.estruturadedados.pilha.desafios;

import java.util.Stack;

public class Desafio04 {
	// Desafio Torre de Hanoi
	public static void main(String[] args) {
		
		Stack<Integer> original = new Stack<>();
		Stack<Integer> destinho = new Stack<>();
		Stack<Integer> auxiliar = new Stack<>();
		
		original.push(5);
		original.push(4);
		original.push(3);
		original.push(2);
		original.push(1);
	
		torreDeHanoi(original.size(), original, destinho, auxiliar);
	}
	// Métodos Auxiliares

		public static void imprimeResultado() {
			System.out.println();
		}
		
		public static void torreDeHanoi(int n, Stack<Integer> original, Stack<Integer> destino, Stack<Integer> auxiliar) {
			
			if (n > 0) {
				torreDeHanoi(n-1, original, auxiliar, destino);
				destino.push(original.pop());
				System.out.println("----------------------");
				System.out.println("Original: " + original);
				System.out.println("Destino: " + destino);
				System.out.println("Auxiliar: " + auxiliar);
				torreDeHanoi(n-1, auxiliar, destino, original);
			
			}
			
		}
}
