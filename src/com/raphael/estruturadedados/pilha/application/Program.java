package com.raphael.estruturadedados.pilha.application;

import java.util.Stack;

import com.raphael.estruturadedados.pilha.Pilha;

public class Program {

	public static void main(String[] args) {
		
		
		Pilha<Integer> pilha = new Pilha<>();
		
		Stack<Integer> stack = new Stack<>();
		
		//estaVazio()
		System.out.println(stack.isEmpty());
		
		//empilha()
		stack.push(1);
		stack.push(2);
		stack.push(3);
		
		//tamanho da pilha
		System.out.println(stack.size());
		
		// toString
		System.out.println(stack);
		
		// Espiar topo da pilha
		System.out.println(stack.peek());
		
		//desempilha()
		System.out.println(stack.pop());
		
		System.out.println(stack);
	}
}
