package Ecommerce;


import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;




public class Menu {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);

		// Variáveis de entrada de dados
		int opcao=0, quantidade;
		String nomeProduto;
		float  valor;
		
		while (true) {

			System.out.println("*****************************************************");
			System.out.println("                                                     ");
			System.out.println("                PRODUTOS PETSHOP                     ");
			System.out.println("                                                     ");
			System.out.println("*****************************************************");
			System.out.println("                                                     ");
			System.out.println("            1 - Adicionar Produto                    ");
			System.out.println("            2 - Listar todos os Produtos             ");
			System.out.println("            3 - Buscar produto                       ");
			System.out.println("            4 - Atualizar Informações do Produto     ");
			System.out.println("            5 - Remover produto                      ");
			System.out.println("            6 - Sair                                 ");
			System.out.println("                                                     ");
			System.out.println("*****************************************************");
			System.out.println("Entre com a opção desejada:                          ");
			System.out.println("                                                     ");
		
			try {
				opcao = leia.nextInt();
				leia.nextLine();
				
			} catch (InputMismatchException e) {
				System.out.println("\nDigite valores inteiros!");
				leia.nextLine();
				
			}

			if (opcao == 6) {
				System.out.println( " PETSHOP AGRADECE SUA VISITA!!!");
				sobre();
				leia.close();
				System.exit(0);
				break;
			}

			switch (opcao) {
				case 1:
					System.out.println(  "Adicionar Produto\n\n");

					System.out.println("Digite o Nome do Produto: ");
					nomeProduto = leia.nextLine();
					
					System.out.println("digite o Valor (R$): ");
					valor = leia.nextFloat();
					
					System.out.println("Quantidade em Estoque: ");
					quantidade = leia.nextInt();
					
					System.out.println("Produto Cadastrado!!!");
					System.out.println("Voce será redirecionado ao nosso menu principal");
					keyPress();
					break;
				case 2:
					System.out.println(" Listar todos os Produtos ");

					keyPress();
					break;
				case 3:
					System.out.println(" Buscar Produto: ");

					keyPress();
					break;
					
				case 4:
					System.out.println("Atualizar Informações:");

					keyPress();
					break;
				case 5:
					System.out.println(" Remover Produto: ");

					keyPress();
					break;
			}
		}
	}

	public static void sobre() {
		System.out.println("\n*********************************************************");
		System.out.println("Projeto Desenvolvido por: ");
		System.out.println("Victoria Borges - victoria.borges027@gmail.com");
		System.out.println("https://github.com/VictoriaBorges");
		System.out.println("*********************************************************");
	}

	public static void keyPress() {

		try {

			System.out.println( "\n\nPressione Enter para Continuar...");
			System.in.read();

		} catch (IOException e) {

			System.out.println("Você pressionou uma tecla diferente de enter!");

		}
	}
	}
	

		
		
		

		

	


