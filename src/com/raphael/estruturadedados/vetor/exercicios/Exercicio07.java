package com.raphael.estruturadedados.vetor.exercicios;

import java.util.ArrayList;
import java.util.Scanner;

import com.raphael.estruturadedados.vetor.Contato;

public class Exercicio07 extends Exercicio06 {

	
	public static void main(String[] args) {

		// CRIAÇÃO DAS VARIÁVEIS
		Scanner sc = new Scanner(System.in);

		// VETOR (20)
		ArrayList<Contato> lista = new ArrayList<>(20);

		// ADICIONANDO CONTATOS (30)
		criarContatosDinamicamente(5, lista);

		// MENU
		int opcao = 1;
		while (opcao != 0) {
			opcao = obterOpcaoMenu(sc);
			
			switch (opcao) {
			case 1:
				adicionarContatoFinal(sc, lista);
				break;
			case 2:
				adicionarContatoPorPosicao(sc, lista);
				break;
			case 3:
				obtemContatoPorPosicao(sc, lista);
				break;
			case 4:
				obtemContato(sc, lista);
				break;
			case 5:
				ultimoIndiceDoContato(sc, lista);
				break;
			case 6:
				verificarSeContatoExiste(sc, lista);
				break;	
			case 7:
				excluirPorPosicao(sc, lista);
				break;
			case 8:
				excluirContato(sc, lista);
				break;
			case 9:
				imprimirTamanhoDoVetor(lista);
				break;
			case 10:
				limparVetor(lista);
				break;				
			case 11:
				imprimirVetor(lista);
				break;		
			default: 
				break;
			}
		}
		System.out.println("O usuário digitou 0, programa encerrado!");
	}

	// MÉTODOS AUXILIARES
	private static void imprimirVetor(ArrayList<Contato> lista) {
		System.out.println(lista);
	}
	
	private static void limparVetor(ArrayList<Contato> lista) {
		lista.clear();
		System.out.println("Todos os contatos do vetor foram exluídos!");
	}
	
	private static void imprimirTamanhoDoVetor(ArrayList<Contato> lista) {
		System.out.println("O tamanho do vetor é: " + lista.size());
	}
	
	private static void excluirContato(Scanner sc, ArrayList<Contato> lista) {
		int posicao = lerInformacaoInt("Entre com a posição a ser removida", sc);
	
		try {
			Contato c = lista.get(posicao);
			lista.remove(c);
			System.out.println("Contato exluido!");
			
		} catch (Exception e) {
			System.out.println("Posição inválida!");
		}
	}
	
	private static void excluirPorPosicao(Scanner sc, ArrayList<Contato> lista) {
		int posicao = lerInformacaoInt("Entre com a posição a ser removida", sc);
	
		try {
			lista.remove(posicao);
			System.out.println("Contato excluído!");
		} catch (Exception e) {
			System.out.println("Posição inválida!");
		}
	}

	private static void obtemContatoPorPosicao(Scanner sc, ArrayList<Contato> lista) {
		int posicao = lerInformacaoInt("Entre com a posição a ser pesquisada", sc);

		try {
			Contato c = lista.get(posicao);
			System.out.println("Contato existe, seguem os dados:");
			System.out.println(c); // chama o toString do contato
		} catch (Exception e) {
			System.out.println("Posição inválida!");
		}
	}
	
	private static void obtemContato(Scanner sc, ArrayList<Contato> lista) {
		int posicao = lerInformacaoInt("Entre com a posição a ser pesquisada", sc);
	
		try {
			Contato c = lista.get(posicao);
			System.out.println("Contato existe, seguem os dados:");
			System.out.println(c); // chama o toString do contato
			
			System.out.println("Fazendo pesquisa do contato encontrado:");
			posicao = lista.indexOf(c);
			
			System.out.println("Contato encontrado na posição " + posicao);
		} catch (Exception e) {
			System.out.println("Posição inválida!");
		}
	}
	
	private static void verificarSeContatoExiste(Scanner sc, ArrayList<Contato> lista) {
		int posicao = lerInformacaoInt("Entre com a posição a ser pesquisada", sc);
	
		try {
			Contato c = lista.get(posicao);
			System.out.println("Contato existe, seguem os dados:");
			System.out.println(c); // chama o toString do contato
			
			boolean existe = lista.contains(c);
			if (existe) {
				System.out.println("Contato existe, segue os dados:");
				System.out.println(c);
			} else {
				System.out.println("Contato não existe!");
			}
		} catch (Exception e) {
			System.out.println("Posição inválida!");
		}
	}
	
	private static void ultimoIndiceDoContato(Scanner sc, ArrayList<Contato> lista) {
		int posicao = lerInformacaoInt("Entre com a posição a ser pesquisada", sc);
	
		try {
			Contato c = lista.get(posicao);
			System.out.println("Contato existe, seguem os dados:");
			System.out.println(c); // chama o toString do contato
			
			System.out.println("Fazendo pesquisa do último indice do contato encontrado:");
			posicao = lista.lastIndexOf(c);
			
			System.out.println("Contato encontrado pela ultima vez na posição " + posicao);
		} catch (Exception e) {
			System.out.println("Posição inválida!");
		}
	}
	
	private static void adicionarContatoFinal(Scanner sc, ArrayList<Contato> lista) {
		System.out.println("Criando um contato, entra com as informações:");
		String nome = lerInformacao("Entre com o nome", sc); 
		String telefone = lerInformacao("Entre com o telefone", sc);
		String email = lerInformacao("Entre com o email", sc);
		
		Contato c = new Contato(nome, telefone, email);
		lista.add(c);
		System.out.println("Contato adicionado com sucesso!");
		System.out.println(c); // chama o toString do Contato.
	}
	
	private static void adicionarContatoPorPosicao(Scanner sc, ArrayList<Contato> lista) {
		System.out.println("Criando um contato, entra com as informações:");
		String nome = lerInformacao("Entre com o nome", sc); 
		String telefone = lerInformacao("Entre com o telefone", sc);
		String email = lerInformacao("Entre com o email", sc);
		
		Contato c = new Contato(nome, telefone, email);
		int posicao = lerInformacaoInt("Entre com a posição que deseja adicionar o contato", sc);
		
		try {
			lista.add(posicao, c);
			System.out.println("Contato adicionado com sucesso!");
			System.out.println(c);
		} catch (Exception e) {
			System.out.println("Posição inválida, contato não adicionado!");
		}
	}

	private static void criarContatosDinamicamente(int quantidade, ArrayList<Contato> lista) {
		Contato c;
		for (int i = 1; i <= quantidade; i++) {
			c = new Contato();
			c.setNome("Contato" + i);
			c.setTelefone("1111111" + i);
			c.setEmail("contato" + i + "@gmail.com");

			lista.add(c);
		}

	}

}
