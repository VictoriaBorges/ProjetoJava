package Ecommerce;


import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

import controller.ProdutoController;
import model.Produto;
import model.ProdutoPet;




public class Menu {

	public static void main(String[] args) throws Exception  {
		
		Scanner leia = new Scanner(System.in);
		 ProdutoController produtoController = new ProdutoController();
	
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
					
					 ProdutoPet novoProduto = new ProdutoPet(nomeProduto, valor, quantidade);
	                    produtoController.cadastrar(novoProduto);
	                    
					System.out.println("Produto Cadastrado!!!");
					System.out.println("Voce será redirecionado ao nosso menu principal");
					
	                    keyPress();
	                    
	                    break;
				case 2:
					System.out.println(" Listar todos os Produtos ");
					produtoController.listarTodos();
					
	
					
					keyPress();
					break;
				case 3:
					System.out.println(" Buscar Produto: ");
					System.out.println("Digite o nome do Produto:");
					String nomeBusca = leia.nextLine();
					Produto produtoEncontrado= produtoController.buscarProduto(nomeBusca);
					 if (produtoEncontrado != null) {
	                        System.out.println(produtoEncontrado);
	                    } else {
	                        System.out.println("Produto não encontrado.");
	                    }
					
					keyPress();
					break;
					
				case 4:
					System.out.println("Atualizar Informações:");
					
					System.out.print("Digite o nome do produto a ser atualizado: ");
	                    String nomeAtualiza = leia.nextLine();

	                    System.out.print("Novo valor (R$): ");
	                    float novoValor;
	                    
	                    try {
	                        novoValor = leia.nextFloat();
	                    } catch (InputMismatchException e) {
	                        System.out.println(" Valor inválido.");
	                        leia.nextLine();
	                        break;
	                    }

	                    System.out.print("Nova quantidade em estoque: ");
	                    int novaQuantidade;
	                    try {
	                        novaQuantidade = leia.nextInt();
	                    } catch (InputMismatchException e) {
	                        System.out.println(" Quantidade inválida.");
	                        leia.nextLine();
	                        break;
	                    }
	                        leia.nextLine();
	                        if (produtoController.atualizar(nomeAtualiza, novoValor, novaQuantidade)) {
	                            System.out.println("Produto atualizado com sucesso!");
	                        } else {
	                            System.out.println("Produto não encontrado.");
	                        }
	                        
					keyPress();
					break;
	                    
				case 5:
					System.out.println(" Remover Produto: ");
					 System.out.print("Digite o nome do produto a ser removido: ");
					 String nomeRemover = leia.nextLine();

					    if (produtoController.removerProduto(nomeRemover)) {
					        System.out.println("Produto removido com sucesso!");
					    } else {
					        System.out.println("Produto não encontrado.");
					    }

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
	

		
		
		

		

	


