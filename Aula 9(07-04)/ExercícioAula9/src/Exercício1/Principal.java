package Exercício1;

/**
 * 1) Crie uma classe Televisao e uma classe ControleRemoto que pode controlar o volume e
trocar os canais da televisão. O controle de volume permite:
▪ aumentar ou diminuir a potência do volume de som em uma unidade de cada vez;
▪ aumentar e diminuir o número do canal em uma unidade
▪ trocar para um canal indicado;
▪ consultar o valor do volume de som e o canal selecionado.
 * @author Nathy
 *
 */
public class Principal {

	public static void main(String[] args) {
		 
		Televisao t = new Televisao();
		ControleRemoto c = new ControleRemoto();
		
		c.ligarTV();
		c.ligarTV();
		c.aumentaVolume();
		c.aumentaVolume();
		c.aumentaVolume();
		c.diminuiVolume();
		c.aumentaCanal();
		c.aumentaCanal();
		//c.diminuiCanal();
		System.out.println("Está ligado: " + t.isLigada());
		System.out.println("Volume atual: " + c.volumeAtual());
		System.out.println("Canal atual: " + c.canalAtual());
		
	}

}