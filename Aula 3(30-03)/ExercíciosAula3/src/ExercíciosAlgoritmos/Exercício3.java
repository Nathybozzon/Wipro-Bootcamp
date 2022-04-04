/*EXERCÍCIO 3:
 * Faça um algoritmo que mostre o passo a passo para acessar um computador.
 */
package ExercíciosAlgoritmos;
import java.util.Scanner;
/**
 * @author Nathy
 *
 */
public class Exercício3 {

		public static void main(String[] args) {
		    
			Scanner ler = new Scanner(System.in);
			
			System.out.println("Vamos acessar um computador?\n\nDigite 1 para SIM\nDigite 2 para NÃO");
			int numeroDigitado = ler.nextInt();
			
			while (numeroDigitado != 1 && numeroDigitado != 2 ) {
				System.out.println("Comando invalido.\nDigite 1 para SIM\nDigite 2 para NÃO");
				numeroDigitado = ler.nextInt();	
		}
			if (numeroDigitado == 1) {
				System.out.println ("Siga as Instruções:\n\n"
						+ "1- Ir no local onde está o computador\n"
						+ "2- Verificar se há um cadeira no local e posicionar na frente do computador\n"
						+ "3- Sente-se confortavelmente\n"
						+ "4- Aperte o botão de ligar na torre no computador\n\n"
						+ "PRONTO!!! AGORA É SÓ VOCÊ ESPERAR O COMPUTADOR PARAR DE CARREGAR POR COMPLETO, E O UTILIZAR.");
				
			 }else {
					System.out.println("Quando quiser acessar é só reiniciar este programa que iremos te orientar ");
					
				}
			
			}
	}

