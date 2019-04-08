package core;

import structures.*;

public class Exercicio8 {

	public static void main(String[] args) {
		
		CListaDup lista = new CListaDup();
		for (int i = 3; i < 12; i++) {
			lista.insereFim(i);
		}
		lista.imprime();
		System.out.println("\n\nOcorr�ncia de 5, indice = [" + lista.primeiraOcorrenciaDe(5) + "]");
		System.out.println("Ocorr�ncia de 9, indice = [" + lista.primeiraOcorrenciaDe(9) + "]");
		System.out.println("Ocorr�ncia de 1, indice = [" + lista.primeiraOcorrenciaDe(1) + "] (N�o existe na lista)");

	}
	
	//Inserir met�do primeiraOcorrenciaDe(), situado na classe CFila();

}
