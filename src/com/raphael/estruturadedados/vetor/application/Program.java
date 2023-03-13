package com.raphael.estruturadedados.vetor.application;

import java.util.ArrayList;

public class Program {

	// Utilizando a collection ArrayList
	public static void main(String[] args) {

		ArrayList<String> arraylist = new ArrayList<>();

		// Adiciona
		arraylist.add("A");
		arraylist.add("C");
		arraylist.add("D");
		
		// Adiciona passando a posição e o elemento
		arraylist.add(1, "B");
		
		// Busca se o elemento existe no ArrayList
		boolean existe = arraylist.contains("A");
		if (existe) {
			System.out.println("Existe");
		} else {
			System.out.println("Não existe");
		}
		
		// Busca e retorna a posição do elemento
		int posicao = arraylist.indexOf("B");
		if (posicao > -1) {
			System.out.println("Existe");
		} else {
			System.out.println("Não existe" + posicao);
		}
		
		// Busca por posição e retorna o objeto
		System.out.println(arraylist.get(1));
		
		// Remove o elemento pelo indice
		arraylist.remove(0);
		
		// Remove o elemento passando o objeto
		arraylist.remove("B");
		
		// Retorna o tamanho do Arraylist
		System.out.println(arraylist.size());
		
		// Imprime o ArrayList
		System.out.println(arraylist);

	}
}
