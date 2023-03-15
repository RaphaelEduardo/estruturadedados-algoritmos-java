package com.raphael.estruturadedados.filas.application;

import java.util.LinkedList;
import java.util.Queue;

public class Program {

	public static void main(String[] args) {

		// Interface Queue instanciada pela classe LinkedList
		Queue<Integer> fila = new LinkedList<>();

		fila.add(10); // enqueue
		fila.add(20); // enqueue

		System.out.println(fila); // toString

		System.out.println(fila.peek()); // espiar

		System.out.println(fila.remove()); // dequeue

		System.out.println(fila); // toString

	}

}
