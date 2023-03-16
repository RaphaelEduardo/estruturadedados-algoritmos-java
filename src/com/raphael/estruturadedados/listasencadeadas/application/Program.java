package com.raphael.estruturadedados.listasencadeadas.application;

import com.raphael.estruturadedados.listasencadeadas.entities.ListaEncadeada;

public class Program {

	public static void main(String[] args) {
		
		ListaEncadeada<Integer> lista = new ListaEncadeada<>();
		
		lista.adicionar(7);
		lista.adicionar(12);
		lista.adicionar(17);
		
		System.out.println("Lista: " + lista.toString());
		System.out.println("Tamanho da lista: " + lista.getTamanho());
		
		lista.limpar();
		
		System.out.println("Lista: " + lista.toString());
		System.out.println("Tamanho da lista: " + lista.getTamanho());
		
		
	}
}
