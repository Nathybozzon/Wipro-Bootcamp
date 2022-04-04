/*EXERCÍCIO 4:
 * Faça um algoritmo que mostre o passo a passo para lavar um copo.
 */
package ExercíciosAlgoritmos;

import java.util.Scanner;

/**
 * @author Nathy
 *
 */
public class Exercício4 {

		public static void main(String[] args) {
			Scanner ler = new Scanner(System.in);
			
			System.out.println("Quer saber como se lava um copo?\n\nDigite 1 para SIM\nDigite 2 para NÃO");
			
			int numeroDigitado = ler.nextInt();
			
			while (numeroDigitado != 1 && numeroDigitado != 2) {
	 	    	System.out.println ("Número Inválido\nDigite 1 para SIM\nDigite 2 para NÃO");
	 	    	numeroDigitado = ler.nextInt(); 			
		}
			if(numeroDigitado == 1) {
				    System.out.println ("Siga as instruções:\n\n"
				    		+ "1- Pegue o copo sujo na pia e segure com uma mão\n"
				    		+ "2- Com a outra mão aperte a embalagem do detergente posicionando a boca dele em direção à buchinha de lavar louça\n"
				    		+ "3- Coloque o detergente no lugar e pegue a buchinha de lavar louça"
				    		+ "4- Friccione com muito cuidado a buchinha por todo o copo, por dentro e por fora, de forma que ele fique todo ensaboado\n"
				    		+ "5- Guarde a buchinha de lavar louça no lugar onde encontrou\n"
				    		+ "6- Abra a torneira com a mão livre\n"
				    		+ "7- Passe o copo por toda a água, até que saia todo o sabão dele\n"
				    		+ "8- Feche a torneira com a mão que está livre\n"
				    		+ "9- Coloque o copo no escorredor de louça\n\n"
				    		+ " Pronto! Agora seu copo está limpinho");
				
			}
			else {
				    System.out.println("Quando mudar de idéia, acesse este programa novamente");
			}
			
				
            
	}

}
