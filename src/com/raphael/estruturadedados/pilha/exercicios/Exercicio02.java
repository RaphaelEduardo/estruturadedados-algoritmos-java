package com.raphael.estruturadedados.pilha.exercicios;

import java.util.Scanner;

import com.raphael.estruturadedados.pilha.Pilha;

public class Exercicio02 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		Pilha<Integer> par = new Pilha<>(); 
		Pilha<Integer> impar = new Pilha<>();
		
		for (int i=1; i<=10; i++) {
			System.out.print("Entre com um número: ");
			int numero = sc.nextInt();
		
			if (numero == 0) {
				// Pilha Par
				Integer desempilhado = par.desempilha();
				if (desempilhado == null) {
					System.out.println("A pilha par está vazia!");
				} else {
					System.out.println("Desempilhando da pilha par: " + desempilhado);	
				}			
				// Pilha Ímpar
				desempilhado = impar.desempilha();
				if (desempilhado == null) {
					System.out.println("A pilha impar está vazia!");
				} else {
					System.out.println("Desempilhando da pilha impar: " + desempilhado);	
				}	
				
			} else if (numero % 2 == 0) {
				System.out.println("Empilhando número par, na pilha par: " + numero);
				par.empilha(numero);
			} else {
				System.out.println("Empilhando número impar, na pilha impar: " + numero);
				impar.empilha(numero);
			}
			
		}
		
		System.out.println("Desempilhando todos os número da pilha par: ");
		
		while (!par.estaVazia()) {
			System.out.println("Desempilhando da pilha par: " + par.desempilha());
		}
		
		System.out.println("Desempilhando todos os número da pilha ímpar: ");
		while (!impar.estaVazia()) {
			System.out.println("Desempilhando da pilha ímpar: " + impar.desempilha());
		}
		sc.close();
	}

}
