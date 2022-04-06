package AtividadesEstruturasDeControle;

import java.util.Random;
import java.util.Scanner;

/**
 * @author Nathy
 * Escreva um programa Java que gera um número aleatório (randômico) entre 0 e 10
(incluindo estes dois valores) e peça ao usuário para adivinhá-lo. Use um laço while para
registrar as tentativas feitas e, a cada tentativa, dê dicas informando se o número gerado é
maior ou menor que a tentativa feita. Finalmente mostre a quantidade de tentativas feitas até
que o número fosse acertado.
 */
public class Exercício1 {

    public static void main(String[] args) {
    	
    Random gerador = new Random();
    Scanner ler = new Scanner(System.in);
		
    int numero = gerador.nextInt(10);
    
    System.out.println("Olá !!! Advinhe o número que eu estou pensando entre 0 e 10 !!!\n\nEscolha um número:");
    
    int num1 = ler.nextInt();
    int contador=1;
    
     while (num1 != numero) {
    
    	 
    	 if(num1 > numero ) {
    		 
    		 System.out.println("Você escolheu um número maior, tente novamente");
    		 
    		 num1 = ler.nextInt();
    		 contador++;
    		
       	 }else {
       		 System.out.println("Você escolheu um número menor, tente novamente");
       		
       		 num1 = ler.nextInt();
       		 contador ++;
       	
     }}
     
 
     
     System.out.println("PARABÉNS !!! VOCÊ ACERTOU !!! Foi necessário "+contador+" tentativa(s) !!!");
     }
     }
    