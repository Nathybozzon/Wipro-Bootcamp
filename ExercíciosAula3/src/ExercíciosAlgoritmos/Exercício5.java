/*EXERCÍCIO 5:
 * Faça um algoritmo que mostre o passo a passo para postar uma foto em um rede social.
 */
package ExercíciosAlgoritmos;

import java.util.Scanner;

/**
 * @author Nathy
 *
 */
public class Exercício5 {

	
	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Quer saber como alterar sua foto nas redes sociais?\n\nDigite 1 para SIM\nDigite 2 para NÃO");
		int numeroDigitado = ler.nextInt();
		while (numeroDigitado != 1 && numeroDigitado != 2) {
 	    	System.out.println ("Número Inválido\nDigite 1 para SIM\nDigite 2 para NÃO");
 	    	numeroDigitado = ler.nextInt(); 			
	}
		if (numeroDigitado == 1) {
			System.out.println ("Siga estas instruções:\n\n"
					+ "1- Logue na rede social\n"
					+ "2- Entre nas configurações\n"
					+ "3- Aperte no botão: ALTERAR FOTO\n"
					+ "4- Selecione a foto que você quer dentro do diretório que você mantém guardado\n"
					+ "5- Aperte em abrir\n\n"
					+ "  Pronto !! Sua foto será alterada.");
		}
		else {
			System.out.println ("Quando precisar de ajuda, é só acessar este programa novamente");
		}
	}

}
