package com.raphael.estruturadedados.pilha.exercicios;

import java.util.Scanner;

import com.raphael.estruturadedados.pilha.Pilha;

public class Exercicio01 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		Pilha<Integer> pilha = new Pilha<>();
		
		for (int i=1; i<10; i++) {
			System.out.println("Entre com um número:");
			int numero = sc.nextInt();
			if (numero % 2 == 0) {
				System.out.println("Empilhando o numero " + numero);
				pilha.empilha(numero);
			} else {
				Integer desempilhado = pilha.desempilha();
				if (desempilhado == null) {
					System.out.println("A pilha está vazia!");
				} else {
					System.out.println("Número ímpar, desempilhando um elemento da pilha: " + desempilhado);
				}
			}
		}
		
		System.out.println("Todos os número foram lidos, desempilhando números da pilha");
		
		while (!pilha.estaVazia()) {
			Integer desempilhado = pilha.desempilha();
			if (desempilhado == null) {
				System.out.println("A pilha está vazia!");
			} else {
				System.out.println("Número ímpar, desempilhando um elemento da pilha: " + desempilhado);
			}
		}
		
		System.out.println("Todos os elementos foram desempilhados...");
		
		sc.close();
	}

}
