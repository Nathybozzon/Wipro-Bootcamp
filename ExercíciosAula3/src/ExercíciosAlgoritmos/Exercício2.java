/*EXERCÍCIO 2:
 * Faça um algoritmo que mostre o passo a passo para passear com seu animal de estimação.
 */
package ExercíciosAlgoritmos;

import java.util.Scanner;

/**
 * @author Nathy
 *
 */
public class Exercício2 {

	
	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Vamos levar seu animal de estimação para passear?\n\nDigite 1 se seu animal for um Cão\nDigite 2 se seu animal for um Gato");
		int numeroDigitado = ler.nextInt();
              
		        while (numeroDigitado != 1 && numeroDigitado != 2){
    	                System.out.println("Número Invalido!!!\n\nDigite 1 se seu animal for um Cão\nDigite 2 se seu animal for um Gato");
    	                numeroDigitado = ler.nextInt();
    	     }	     
		        if (numeroDigitado==1) {
		    	    System.out.println("Você escolheu Cão:\nSiga as instruções seguintes:\n"
		    	 		+ "1- Pegar a coleira e ir de encontro ao animal\n"
		    	 		+ "2- Fazer carinho no animal chamando pelo nome\n"
		    	 		+ "3- Colocar a coleira no animal\n"
		    	 		+ "4- Puxar ele pela guia sem ser de forma brutal\n"
		    	 		+ "5- Abrir a porta da casa e ir para o lado de fora\n"
		    	 		+ "6- Trancar a porta\n"
		    	 		+ "7- Pronto! Agora é só passear!");
		     }
		    	 else {
		    	     System.out.println("Você escolheu Gato:\nSiga as instruções seguintes:\n"
				    	 		+ "1- Pegar a coleira e ir de encontro ao animal\n"
				    	 		+ "2- Fazer carinho no animal chamando pelo nome\n"
				    	 		+ "3- Colocar a coleira no animal\n"
				    	 		+ "4- Pegue ele no colo\n"
				    	 		+ "5- Abrir a porta da casa e ir para o lado de fora\n"
				    	 		+ "6- Trancar a porta\n"
				    	 		+ "7- Pronto! Agora é só passear!");	 
		    	 }
		    	
		     }
	}


