package com.raphael.estruturadedados.listasencadeadas.application;

import com.raphael.estruturadedados.listasencadeadas.entities.ListaEncadeada;

public class Program {

	public static void main(String[] args) {
		
		ListaEncadeada<Integer> lista = new ListaEncadeada<>();
		
		lista.adicionar(7);
		
		System.out.println(lista);
		
		
	}
}
