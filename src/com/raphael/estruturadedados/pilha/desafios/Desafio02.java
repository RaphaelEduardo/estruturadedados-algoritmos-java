package com.raphael.estruturadedados.pilha.desafios;

import com.raphael.estruturadedados.pilha.Pilha;

public class Desafio02 {
	// Desafio dos Símbolos Balanceados
	public static void main(String[] args) {

		imprimeResultado("A + B");
		imprimeResultado("A + B * (C + D)");
		imprimeResultado("{[(A + B) * C - D] + (E - F) * A}");
		imprimeResultado("{[(]}[]{()}");
		imprimeResultado("(A * B) + (C * D))");
	}
	
	// Métodos Auxiliares
	public static void imprimeResultado(String expressao) {
		System.out.println(expressao + " está balanceada? " + verificaSimbolosBalanceados(expressao));
	}

	final static String ABRE = "([{";
	final static String FECHA = ")]}";

	public static boolean verificaSimbolosBalanceados(String expressao) {

		Pilha<Character> pilha = new Pilha<>();
		int index = 0;
		char simbolo, topo;

		while (index < expressao.length()) {
			simbolo = expressao.charAt(index);

			if (ABRE.indexOf(simbolo) > -1) {
				pilha.empilha(simbolo);
			} else if (FECHA.indexOf(simbolo) > -1) {
				
				if (pilha.estaVazia()) {
					return false;
				} else {
					topo = pilha.desempilha();
					if (ABRE.indexOf(topo) != FECHA.indexOf(simbolo)) {
						return false;
					}
				}
			}
			index++;
		}
		return true;
	}

}
