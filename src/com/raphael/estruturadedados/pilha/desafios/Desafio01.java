package com.raphael.estruturadedados.pilha.desafios;

import java.util.Scanner;

import com.raphael.estruturadedados.pilha.Pilha;

public class Desafio01 {
	// Desafio do Palíndromo
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
	
		
		while(true) {
			System.out.println("Digite uma palavra para testar se é um Palíndromo:");
			String palavra = sc.nextLine();
			if (!(palavra.charAt(0) == 'n')) {
				imprimeResultado(palavra);
				System.out.println();
				System.out.println("Para finalizar digite: 'n'");
			} else {
				break;	
			}
		}	
		sc.close();
	}
	
	// Métodos Auxiliares
	public static void imprimeResultado(String palavra) {
		System.out.println(palavra + " é Palíndromo? " + testaPalindromo(palavra));
	}
	
	
	public static boolean testaPalindromo(String palavra) {
		
		// Palavra: ADA
		Pilha<Character> pilha = new Pilha<>();
		
		for (int i=0; i<palavra.length(); i++) {
			pilha.empilha(palavra.charAt(i));
		}
		String palavraInversa = "";
		while (!pilha.estaVazia()) {
			palavraInversa += pilha.desempilha();
		}
		if (palavraInversa.equalsIgnoreCase(palavra)) {
			return true;
		} else {
			return false;
		}
	}
}
