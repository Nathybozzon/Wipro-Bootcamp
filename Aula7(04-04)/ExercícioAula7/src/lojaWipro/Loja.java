package lojaWipro;

import java.util.Scanner;

public class Loja {

	static void exibirMenu(String[] produtos, double[] precos, int[] codigos, int[] estoques) {

		System.out.println("CÓDIGO  PRODUTO  QNTD. PRODUTOS  PRECO UNIT.");
		System.out.println("==============================================");

		for (int i = 0; i < produtos.length; i++) {

			System.out.printf("  %d \t %s\t\t %d\t   %.2f\n",codigos[i],produtos[i],estoques[i],precos[i]);

		}
		System.out.println("===============================================");
		System.out.println("Informe o código do produto desejado:");

	}

	public static void main(String[] args) {

		String[] produtos = { "Ovo", "Carne", "Açucar","Azeite","Mamão", "Banana","Limão","Batata","Goiaba","Peixe" };
		double[] precos = { 10.20, 50.25, 5.00, 15.50, 10.00, 4.00, 8.50, 7.50, 6.50, 31.99};
		int[] codigos = { 1, 2, 3, 4, 5, 6, 7, 8, 9,10};
		int[] estoques = { 10, 10, 10, 10, 10, 10, 10, 10, 10, 10};
		int[][] carrinho = new int[10][2];
		char continuar = 's';
		int codigo = 0;
		int quantidade = 0;
		double valorTotal = 0.00;
		int opcao = 0;
		boolean opcaoInvalida = true;
		double precoUnitarioTotal = 0.00;
		double desconto = 0.00;
		double imposto = 0.00;

		Scanner scanner = new Scanner(System.in);

		do {

			exibirMenu(produtos, precos, codigos, estoques);

			codigo = scanner.nextInt();

			if (codigo <= 10) {
				
				System.out.println("Digite a quantidade desejada do produto " + produtos[codigo - 1] + ":");
				quantidade = scanner.nextInt();

				if (estoques[codigo - 1] >= quantidade) {

					System.out.printf(quantidade + " un. de " + produtos[codigo - 1] + " foi adicionado ao carrinho!\n");
					estoques[codigo - 1] = estoques[codigo - 1] - quantidade;
			
					carrinho[codigo - 1][0] = codigo;
					carrinho[codigo - 1][1] += quantidade;

				} else {
				  System.out.println("Não temos essa quantidade do produto escolhido!");	
				}

				System.out.println("Deseja continuar a compra? S/N");

				continuar = scanner.next().charAt(0);

				System.out.println(Character.toLowerCase(continuar));

				while (Character.toLowerCase(continuar) != 'n' && Character.toLowerCase(continuar) != 's') {
					System.out.println("Opção Inválida! ");
					System.out.println("Deseja continuar a compra? S/N");
					continuar = scanner.next().charAt(0);
				}

			} else {
				
				System.out.println("Valor Inválido");
			}

		} while (continuar != 'n');

		System.out.println("==================================================================");
		System.out.println("Itens no carrinho");
		System.out.println("Código\t "+ "Produto\t" + "Quantidade\t" + "Preco Unitário\t" + "Preço Total\t");

		for (int i = 0; i < 10; i++) {

			if (carrinho[i][0] > 0) {
				
				precoUnitarioTotal = precos[i] * carrinho[i][1];
				
				System.out.printf("  %d \t %s\t\t %d\t\t   %.2f\t  "
						+ "%.2f\n",codigos[i],produtos[i],carrinho[i][1],precos[i],precoUnitarioTotal);

				valorTotal += (precos[i] * carrinho[i][1]);
			}
		}
		
		imposto = valorTotal * 0.09;
		valorTotal = valorTotal * 1.09;

		do {

			System.out.println("==================================================================");
			System.out.printf("\nO valor total com imposto é %.2f Reais",valorTotal);
			System.out.println("\n\n==================================================================");
			System.out.println("\n[1] À Vista em dinheiro no cartão Mastercard, recebe 20% de desconto");
			System.out.println("[2] À Vista no cartão Mastercard, recebe 15% de desconto");
			System.out.println("[3] Duas vezes sem juros");
			System.out.println("[4] Em três vezes, 10% juros");

			opcao = scanner.nextInt();

			switch (opcao) {

			case 1:
				desconto = valorTotal * 0.2;
				valorTotal *= 0.8;
				opcaoInvalida = false;	
				break;
			case 2:
				desconto = valorTotal * 0.15;
				valorTotal *= 0.85;
				opcaoInvalida = false;
				break;
			case 3:
				opcaoInvalida = false;
				break;
			case 4:
				opcaoInvalida = false;
				valorTotal *= 1.1;
				break;
			default:
				System.out.println("Opção Inválida");
				break;
			}

		} while (opcaoInvalida);
		
		System.out.println("\nLoja WiPro Brasil\n Rua dos Devs, nº 1000 - Lojinha LTDA\n CNPJ: 100000000-00\n" );
		
		System.out.println("\t\t\tNota Fiscal");
		System.out.println("Produto\t" + "  Quantidade\t" + "  Preco Unitário\t" + "\tPreço Total\t");
		System.out.println("==================================================================");
		
		for (int i = 0; i < 10; i++) {

			if (carrinho[i][0] > 0) {
				
				precoUnitarioTotal = precos[i] * carrinho[i][1];
				
				System.out.printf("%s\t\t %d\t\t   %.2f\t  "
						+ "%.2f\n",produtos[i],carrinho[i][1],precos[i],precoUnitarioTotal);

			}
		}
		System.out.println("==================================================================\n");
		
		
		
		System.out.printf("Desconto na compra: %.2f\n Reais", desconto);
		System.out.printf("Foi pago o valor total de %.2f Reais\n",valorTotal);
		System.out.printf("Imposto pago (9%): %.2f\n Reais", imposto);


		scanner.close();

	}

}