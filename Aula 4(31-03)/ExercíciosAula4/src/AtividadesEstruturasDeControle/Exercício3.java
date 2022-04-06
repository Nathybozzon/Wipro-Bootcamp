package AtividadesEstruturasDeControle;

import java.util.Scanner;
/**
 *  Faça um programa para receber os nomes de 4 candidatos a líder de uma turma, em seguida
receber os votos dos alunos existentes na sala, e ao final mostrar o total de votos de cada
candidato e ainda o candidato vencedor da eleição.
 * @author Nathy
 *
 */
public class Exercício3 {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
	    int voto1 = 0;
	    int voto2 = 0;
	    int voto3 = 0;
	    int voto4 = 0;
	    
	    String vencedor = null;
		
		System.out.println("Escreva o nome de 4 canditados a líder da turma:\n\nCandidato(a)1:");
		
		String nome1 = ler.nextLine();
		
		System.out.println("Candidato(a)2:");
		
		String nome2 = ler.nextLine();
		
        System.out.println("Candidato(a)3:");
		
		String nome3 = ler.nextLine();
		
        System.out.println("Candidato(a)4:");
		
		String nome4 = ler.nextLine();
		
		System.out.println("Digite o número para votar em seu candidato(a) preferido:\n\n "
				+ "1- Candidato(a): "+nome1+";\n "
				+ "2- Candidato(a): "+nome2+";\n "
				+ "3- Candidato(a): "+nome3+";\n "
				+ "4- Candidato(a): "+nome4+";");
				
		int voto = ler.nextInt();
		
		      if(voto == 1) {
                                       voto1 ++;
             
              }else if( voto == 2) {             
                                       voto2 ++;
                    
              }else if( voto == 3) {  
            	                       voto3 ++;
              }else {                               
                                       voto4 ++;
           }
		
	    	System.out.println("Mais alguém irá votar?\n\nDigite 1 para SIM;\nDigite 2 para NÃO;");
		
		int num = ler.nextInt();
		
		while ( num == 1) {
			
			System.out.println("Digite o número para votar em seu candidato(a) preferido:\n\n "
					+ "1- Candidato(a): "+nome1+";\n "
					+ "2- Candidato(a): "+nome2+";\n "
					+ "3- Candidato(a): "+nome3+";\n "
					+ "4- Candidato(a): "+nome4+";");
					
			  voto = ler.nextInt();
			  
			     if(voto == 1) {
		                                  voto1 ++;

		        }else if( voto == 2) {             
		                                  voto2 ++;

		        }else if( voto == 3) {  
		                                  voto3 ++;
		        }else {                               
		                                  voto4 ++;
		}		 
				  
			 System.out.println("Outra pessoa irá votar?\n\nDigite 1 para SIM;\nDigite 2 para NÃO;\n\n");
		
			 
			 num = ler.nextInt();
		
		}
	
			 		  
			 if (voto1>voto2 && voto1>voto3 && voto1>voto4) {
				                       
				                       vencedor = nome1;
				                       
			 }
			 else if (voto2>voto1 && voto2> voto3 && voto2>voto4) {
				 
				                       vencedor = nome2;
			 }
			 else if (voto3>voto1 && voto3> voto2 && voto3>voto4) {
				 
                                       vencedor = nome3;
             }
			 else if (voto4>voto1 && voto4> voto2 && voto4>voto3) {
				 
                                       vencedor = nome4;
             }
			 else{
				 
				 System.out.println("Contagem de votos:\n"
							+ nome1+" teve "+voto1+ " voto(s);\n"
							+ nome2+" teve "+voto2+" voto(s);\n"
							+ nome3+" teve "+voto3+" voto(s);\n"
							+ nome2+" teve "+voto4+" voto(s);\n\n"
							+ "Deu empate ! ! !");
				 
				 System.exit(0);
				
		     
			 }
			     		
					
			System.out.println("Contagem de votos:\n"
					+ nome1+" teve "+voto1+ " voto(s);\n"
					+ nome2+" teve "+voto2+" voto(s);\n"
					+ nome3+" teve "+voto3+" voto(s);\n"
					+ nome2+" teve "+voto4+" voto(s);\n\n"
					+ "Parabéns ! ! ! "+vencedor+" é o líder da turma ! ! !");
	}
	}
    
