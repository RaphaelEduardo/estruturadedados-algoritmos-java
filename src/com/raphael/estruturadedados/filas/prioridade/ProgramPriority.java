package com.raphael.estruturadedados.filas.prioridade;

import com.raphael.estruturadedados.filas.FilaComPrioridade;

public class ProgramPriority {

	public static void main(String[] args) {


		FilaComPrioridade<Paciente> fila = new FilaComPrioridade<>();

		fila.enfileirar(new Paciente("A", 2));
		fila.enfileirar(new Paciente("C", 1));
		fila.enfileirar(new Paciente("B", 3));

		// A fila vai ser 1 2 3 (Por conta da prioridade.
		System.out.println(fila); 

		System.out.println(fila.desenfileirar());
		
		System.out.println(fila);
		
		
	}

}
