package core;

import structures.*;

public class Exercicio12 {

	public static void main(String[] args) {

		CListaDup lista = new CListaDup();
		for (int i = 1; i < 30; i += 3) {
			lista.insereFim(i);
		}

		lista.imprimeFormatoLista();
		System.out.println("\nRemove atrav�s de um la�o todas as posi��es[i]: \n");

		for (int i = 10; i > 0; i--) {
			lista.removePos(i);
			lista.imprimeFormatoLista();
		}
	}
	
	// Copiar metodo removePos() em CListaDup;
}
