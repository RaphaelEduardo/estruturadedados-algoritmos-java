package com.raphael.estruturadedados.vetor.exercicios;

import java.util.Scanner;

import com.raphael.estruturadedados.vetor.Contato;
import com.raphael.estruturadedados.vetor.Lista;

public class Exercicio06 {

	public static void main(String[] args) {

		// CRIAÇÃO DAS VARIÁVEIS
		Scanner sc = new Scanner(System.in);

		// VETOR (20)
		Lista<Contato> lista = new Lista<>(20);

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
	private static void imprimirVetor(Lista<Contato> lista) {
		System.out.println(lista);
	}
	
	private static void limparVetor(Lista<Contato> lista) {
		lista.limpar();
		System.out.println("Todos os contatos do vetor foram exluídos!");
	}
	
	private static void imprimirTamanhoDoVetor(Lista<Contato> lista) {
		System.out.println("O tamanho do vetor é: " + lista.tamanho());
	}
	
	private static void excluirContato(Scanner sc, Lista<Contato> lista) {
		int posicao = lerInformacaoInt("Entre com a posição a ser removida", sc);
	
		try {
			Contato c = lista.obtem(posicao);
			lista.removeElemento(c);
			System.out.println("Contato exluido!");
			
		} catch (Exception e) {
			System.out.println("Posição inválida!");
		}
	}
	
	private static void excluirPorPosicao(Scanner sc, Lista<Contato> lista) {
		int posicao = lerInformacaoInt("Entre com a posição a ser removida", sc);
	
		try {
			lista.remove(posicao);
			System.out.println("Contato excluído!");
		} catch (Exception e) {
			System.out.println("Posição inválida!");
		}
	}

	private static void obtemContatoPorPosicao(Scanner sc, Lista<Contato> lista) {
		int posicao = lerInformacaoInt("Entre com a posição a ser pesquisada", sc);
	
		try {
			Contato c = lista.obtem(posicao);
			System.out.println("Contato existe, seguem os dados:");
			System.out.println(c); // chama o toString do contato
		} catch (Exception e) {
			System.out.println("Posição inválida!");
		}
	}
	
	private static void obtemContato(Scanner sc, Lista<Contato> lista) {
		int posicao = lerInformacaoInt("Entre com a posição a ser pesquisada", sc);
	
		try {
			Contato c = lista.obtem(posicao);
			System.out.println("Contato existe, seguem os dados:");
			System.out.println(c); // chama o toString do contato
			
			System.out.println("Fazendo pesquisa do contato encontrado:");
			posicao = lista.existe(c);
			
			System.out.println("Contato encontrado na posição " + posicao);
		} catch (Exception e) {
			System.out.println("Posição inválida!");
		}
	}
	
	private static void verificarSeContatoExiste(Scanner sc, Lista<Contato> lista) {
		int posicao = lerInformacaoInt("Entre com a posição a ser pesquisada", sc);
	
		try {
			Contato c = lista.obtem(posicao);
			System.out.println("Contato existe, seguem os dados:");
			System.out.println(c); // chama o toString do contato
			
			boolean existe = lista.contem(c);
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
	
	private static void ultimoIndiceDoContato(Scanner sc, Lista<Contato> lista) {
		int posicao = lerInformacaoInt("Entre com a posição a ser pesquisada", sc);
	
		try {
			Contato c = lista.obtem(posicao);
			System.out.println("Contato existe, seguem os dados:");
			System.out.println(c); // chama o toString do contato
			
			System.out.println("Fazendo pesquisa do último indice do contato encontrado:");
			posicao = lista.ultimoIndice(c);
			
			System.out.println("Contato encontrado pela ultima vez na posição " + posicao);
		} catch (Exception e) {
			System.out.println("Posição inválida!");
		}
	}
	
	private static void adicionarContatoFinal(Scanner sc, Lista<Contato> lista) {
		System.out.println("Criando um contato, entra com as informações:");
		String nome = lerInformacao("Entre com o nome", sc); 
		String telefone = lerInformacao("Entre com o telefone", sc);
		String email = lerInformacao("Entre com o email", sc);
		
		Contato c = new Contato(nome, telefone, email);
		lista.adiciona(c);
		System.out.println("Contato adicionado com sucesso!");
		System.out.println(c); // chama o toString do Contato.
	}
	
	private static void adicionarContatoPorPosicao(Scanner sc, Lista<Contato> lista) {
		System.out.println("Criando um contato, entra com as informações:");
		String nome = lerInformacao("Entre com o nome", sc); 
		String telefone = lerInformacao("Entre com o telefone", sc);
		String email = lerInformacao("Entre com o email", sc);
		
		Contato c = new Contato(nome, telefone, email);
		int posicao = lerInformacaoInt("Entre com a posição que deseja adicionar o contato", sc);
		
		try {
			lista.adicionaPorPosicao(posicao, c);
			System.out.println("Contato adicionado com sucesso!");
			System.out.println(c);
		} catch (Exception e) {
			System.out.println("Posição inválida, contato não adicionado!");
		}
	}
	
	private static String lerInformacao(String msg, Scanner sc) {
		System.out.println(msg);
		String entrada = sc.nextLine();
		
		return entrada;
	}
	
	private static int lerInformacaoInt(String msg, Scanner sc) {
		boolean entradaValida = false;
		int num = 0;
		
		while (!entradaValida) {
			try {
				System.out.println(msg);
				String entrada = sc.nextLine();
				
				num = Integer.parseInt(entrada);	
			} catch (Exception e) {
				System.out.println("Entrada inválida, digite novamente...");
			}
		}
		return num;
	}
	
	private static int obterOpcaoMenu(Scanner sc) {

		boolean entradaValida = false;
		int opcao = 0;
		String entrada;

		while (!entradaValida) {
			System.out.println("Digite a opção desejada: ");
			System.out.println("1. Adicionar contato no final do vetor");
			System.out.println("2. Adicionar contato em uma posição espefica");
			System.out.println("3. Consultar contato de uma posição específica");
			System.out.println("4. Consultar contato");
			System.out.println("5. Consultar ultimo indice do contato");
			System.out.println("6. Verificar se o contato existe");
			System.out.println("7. Excluir por posição");
			System.out.println("8. Excluir contato");
			System.out.println("9. Verificar tamanho do vetor");
			System.out.println("10. Limpar o vetor");
			System.out.println("11. Imprimir vetor");
			System.out.println("0. Sair");

			try {
				entrada = sc.nextLine();
				opcao = Integer.parseInt(entrada);

				if (opcao >= 0 && opcao <= 11) {
					entradaValida = true;
				} else {
					throw new Exception();
				}

			} catch (Exception e) {
				System.out.println("Entrada inválida, digite novamente... \n\n");
			}
		}
		return opcao;
	}

	private static void criarContatosDinamicamente(int quantidade, Lista<Contato> lista) {
		Contato c;
		for (int i = 1; i <= quantidade; i++) {
			c = new Contato();
			c.setNome("Contato" + i);
			c.setTelefone("1111111" + i);
			c.setEmail("contato" + i + "@gmail.com");

			lista.adiciona(c);
		}

	}

}
