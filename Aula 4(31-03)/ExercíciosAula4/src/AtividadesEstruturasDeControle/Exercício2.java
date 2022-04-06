package AtividadesEstruturasDeControle;

import java.util.Scanner;
/**
 * @author Nathy
 *EXERCÍCIO 2:
 *Faça um programa para receber o nome de um aluno e informar 2 notas, em seguida calcular
a média do aluno e apresentar ao final a média calculada e a situação de Aprovação do aluno.
(aprovado com média >= 6).
 */
public class Exercício2 {


	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Digite o nome do aluno(a):");
		
		String nome = ler.nextLine();
		
		System.out.println("Informe a primeira nota:");
        
		float nota1 = ler.nextFloat();
		
        System.out.println("Informe a segunda nota:");
        
		float nota2 = ler.nextFloat();
		
		float media = (nota1+nota2)/2;
				
				if (media >=6) {
					
					System.out.println(nome+", sua média foi:"+media+".\n\nParabéns você foi aprovado(a) !!!");
				}
		        
				else {
		        
					System.out.println(nome+", sua média foi:"+media+".\n\nInfelizmente você foi reprovado(a).");
	}

	}}
