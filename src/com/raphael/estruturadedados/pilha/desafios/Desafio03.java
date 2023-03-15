package com.raphael.estruturadedados.pilha.desafios;

import java.util.Stack;

public class Desafio03 {
	// Desafio conversão decimal-binário
	public static void main(String[] args) {
		
		imprimeResultado(25);
		imprimeResultado(32);
		imprimeResultado(75);
		
		imprimeResultadoQualquerBase(2, 16);
		imprimeResultadoQualquerBase(128, 8);
		imprimeResultadoQualquerBase(516, 16);

	}
	// Métodos Auxiliares

	public static void imprimeResultado(int numero) {
		System.out.println(numero  + " em binario é: " + converteDecimalParaBinario(numero));
	}
	
	public static String converteDecimalParaBinario(int numero) {
		Stack<Integer> pilha = new Stack<>();
		String numeroBinario = "";
		int restoDivisao;
		
		while (numero > 0) {
			restoDivisao = numero % 2;
			pilha.push(restoDivisao);
			numero /= 2; // o mesmo de: numero = numero /2;
		}
		while (!(pilha.isEmpty())) {
			numeroBinario += pilha.pop();
		}
		return numeroBinario;
	}
	
	public static void imprimeResultadoQualquerBase(int numero, int base) {
		System.out.println(numero  + " na base " + base + " é: " + converteDecimalParaQualquerBase(numero, base));
	}
	
	public static String converteDecimalParaQualquerBase(int numero, int base) {
		
		if (base > 16) {
			throw new IllegalArgumentException("");
		}
		
		Stack<Integer> pilha = new Stack<>();
		String numeroBase = "";
		int restoDivisao;
		String bases = "0123456789ABCDEF";
		
		while (numero > 0) {
			restoDivisao = numero % base;
			pilha.push(restoDivisao);
			numero /= base; // o mesmo de: numero = numero /2;
		}
		while (!(pilha.isEmpty())) {
			numeroBase += bases.charAt(pilha.pop());
		}
		return numeroBase;
	}
}
