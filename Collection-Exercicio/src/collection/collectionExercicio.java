package collection;

import java.util.ArrayList;
import java.util.Scanner;

public class collectionExercicio {


				public static void main(String[] args) {
					
					Scanner ler = new Scanner(System.in);
					int opcao;
					ArrayList<String> estoque = new ArrayList<String>();
					String armazenar, Remover, apresentar, atualizar;
					do {
						System.out.printf("\nEstoque");
						System.out.printf("\n1. Adicionar ao estoque");
						System.out.printf("\n2. Remover do estoque");
						System.out.printf("\n3. Alterar o estoque");
						System.out.printf("\n4. Exibir o estoque atual");
						System.out.printf("\n0. Encerrar\n");
						opcao = ler.nextInt();
						
						switch(opcao) {
							
							case 0:
								ler.nextLine();
								System.out.printf("\nInforme o produto: ");
								armazenar = ler.nextLine();
								estoque.add(armazenar);
								break;
							
							case 1:
								ler.nextLine();
								System.out.printf("\nProduto removido: ");
								Remover = ler.nextLine();
								if(estoque.contains(Remover)) estoque.remove(Remover);
								else System.out.printf("\nProduto não encontrado, informe um item válido");
								break;
							
							case 2:
								ler.nextLine();
								System.out.printf("\nQual item sera alterado? ");
								apresentar = ler.nextLine();
								
								System.out.printf("\nQual item substitui %s? ");
								atualizar = ler.nextLine();
								if(estoque.contains(atualizar)) {
									estoque.remove(atualizar );
									estoque.add(atualizar);

								} else {
									System.out.printf("\n%s não existe no estoque atualmente", atualizar);
								}
								break;
							
							case 3:
								ler.nextLine();
								System.out.printf("\nEstoque atual: %s\n", estoque);
								break;
							default:
								System.out.printf("\n\tEncerrando...\n");
						}
					
					} while(opcao != 0);
	}
			

	}


