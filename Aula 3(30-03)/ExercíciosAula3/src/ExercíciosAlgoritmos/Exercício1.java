/*Exercício 1:
 * Faça um algoritmo que mostre o passo a passo para trocar uma de lâmpada queimada. 
 */
package ExercíciosAlgoritmos;

import java.util.Scanner;

/**
 * @author Nathy
 *Exercício1
 */
public class Exercício1 {

	public static void main(String[] args) {
				
		Scanner ler = new Scanner(System.in);
			
		System.out.println("Olá, Vamos trocar uma Lâmpada Queimada?\nDigite 1 para SIM e 2 para NÃO");

        int numeroDigitado = ler.nextInt();

        while(numeroDigitado != 1 && numeroDigitado != 2) {

            System.out.println("Número digitado não é válido.\nDigite 1 para SIM e 2 para NÃO");
            numeroDigitado = ler.nextInt();
        }

        if(numeroDigitado == 1) {

            System.out.println("Siga as instruções:\n"
                    + "1- Pegue a Escada e posicione no local aonde vai se trocar a lâmpada;\n"
                    + "2- Suba a escada e desrosqueie a lâmpada;\n3- Desça a escada e jogue fora a lâmpada;\n"
                    + "4- Pegue a lâmpada nova e suba a escada;\n5- Rosqueie a lâmpada nova e desça da escada;\n\n"
                    + "Agora vá ao interruptor e aperte o botão para acender a lâmpada e me responda:\n\n"
                    + "A lâmpada acendeu?\n\nDIGITE 1 (Para Sim);\nDIGITE 2 (Para Não);");
            int luzAcendeu = ler.nextInt();

            while (luzAcendeu != 1) {
                if (luzAcendeu == 2) {
                    System.out.println("Vamos seguir as instruções anteriores novamente\n"
                            + "1- Pegue a Escada e posicione no local aonde vai se trocar a lâmpada;\n"
                            + "2- Suba a escada e desrosqueie a lâmpada;\n3- Desça a escada e jogue fora a lâmpada;\n"
                            + "4- Pegue a lâmpada nova e suba a escada;\n5- Rosqueie a lâmpada nova e desça da escada;\n\n"
                            + "Agora vá ao interruptor e aperte o botão para acender a lâmpada e me responda:\n\n"
                            + "A lâmpada acendeu?\n\nDIGITE 1 (Para Sim)\nDIGITE 2 (Para Não)\n");
                    luzAcendeu = ler.nextInt();
                } else {
                    System.out.println("Opção inválida\n"
                            + "A lâmpada acendeu?\n\nDIGITE 1 (Para Sim)\nDIGITE 2 (Para Não)");
                    luzAcendeu = ler.nextInt();
                }
            }

            System.out.println("Parabéns lâmpada trocada com sucesso! ! !");
        } else {
            System.out.println ("Quando precisar é só acessar o programa novamente");
        }}}