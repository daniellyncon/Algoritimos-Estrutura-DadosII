package core;
import structures.*;

public class Exercicio9 {

	public static void main(String[] args) {
		
		CListaDup lista = new CListaDup();
		for (int i = 0; i < 10; i++) {
			lista.insereFim(i);
		}
		lista.insereComeco(5);
		lista.insereFim(5);
		lista.insereFim(8);
		lista.insereFim(3);
		lista.insereFim(3);
		lista.insereFim(4);
		lista.imprime();
		System.out.println("\n\nUltima Ocorr�ncia de 4: " + lista.ultimaOcorrenciaDe(4));
		System.out.println("\nUltima Ocorr�ncia de 3: " + lista.ultimaOcorrenciaDe(3));
		System.out.println("\nN�mero n�o cont�m: " + lista.ultimaOcorrenciaDe(22));

	}
	
	// Copiar Met�do de CListaDup() ultimaOcorr�nciaDe

}
