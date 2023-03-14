package com.raphael.estruturadedados.pilha.exercicios;

import com.raphael.estruturadedados.pilha.Livro;
import com.raphael.estruturadedados.pilha.Pilha;

public class Exercicio03 {

	public static void main(String[] args) {

		Pilha<Livro> pilha = new Pilha<>(20);
		
		Livro l1 = new Livro();
		l1.setNome("Livro Teste 1");
		l1.setAutor("Fulano");
		l1.setAnoLancamento(2023);
		l1.setIsbn("BX65SAX42Z");
		
		Livro l2 = new Livro();
		l2.setNome("Livro Teste 2");
		l2.setAutor("Sicrano");
		l2.setAnoLancamento(2022);
		l2.setIsbn("X25D4DS85W");
		
		Livro l3 = new Livro();
		l3.setNome("Livro Teste 3");
		l3.setAutor("Beltrano");
		l3.setAnoLancamento(2021);
		l3.setIsbn("S1DF58A4FS");
		
		Livro l4 = new Livro();
		l4.setNome("Livro Teste 4");
		l4.setAutor("Breltrano");
		l4.setAnoLancamento(2020);
		l4.setIsbn("BX6SDF1A5S");
		
		Livro l5 = new Livro();
		l5.setNome("Livro Teste 5");
		l5.setAutor("Sicrano");
		l5.setAnoLancamento(2019);
		l5.setIsbn("1CA5S4SADS");
		
		Livro l6 = new Livro();
		l6.setNome("Livro Teste 6");
		l6.setAutor("Fulano");
		l6.setAnoLancamento(2018);
		l6.setIsbn("FS1AFSA5S5");
		
		
		System.out.println("Pilha de livros criados, a pilha está vazia? " + pilha.estaVazia());
		System.out.println("Empilhando livros na pilha:");
		
		pilha.empilha(l1);
		pilha.empilha(l2);
		pilha.empilha(l3);
		pilha.empilha(l4);
		pilha.empilha(l5);
		pilha.empilha(l6);
		
		System.out.println(pilha.tamanho() + " livros foram empilhados:");
		System.out.println(pilha);
		
		System.out.println("Pilha de livros criados, a pilha está vazia? " + pilha.estaVazia());
		
		System.out.println("Espiando o topo da pilha: " + pilha.topo());
		
		System.out.println("Desempilhando livros da pilha: ");
		while (!pilha.estaVazia()) {
			System.out.println("Desempilhando livro: " + pilha.desempilha());
		}
		System.out.println("Todos os livros foram desempilhados...");
		System.out.println("Todos os livros foram desempilhados, a pilha está vazia? " + pilha.estaVazia());
	}

}
