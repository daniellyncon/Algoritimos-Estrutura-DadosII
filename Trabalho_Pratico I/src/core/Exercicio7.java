package core;
import structures.*;

public class Exercicio7 {
	
	// Copiar classe RandomQUeue;

	public static void main(String[] args) {
		RandomQueue RQ = new RandomQueue();
		
		for (int i = 0; i <= 20; i++) {
			RQ.enqueue(i);
		}

		System.out.println("Fila Completa: ");
		RQ.mostra();
		System.out.println("\nElemento aleat�rio removido: " + RQ.Dequeue());
		RQ.mostra();
		
		System.out.println("\nElemento aleat�rio removido: " + RQ.Dequeue());
		RQ.mostra();
		
		System.out.println("\nElementos aleat�rios atrav�s do Sample():");
		System.out.print(RQ.Sample() + ", ");
		System.out.print(RQ.Sample() + ", ");
		System.out.print(RQ.Sample() + ", ");
		System.out.print(RQ.Sample() + ", ");
		System.out.print(RQ.Sample() + ", ");
		System.out.print(RQ.Sample() + ", ");
		System.out.print(RQ.Sample() + ", ");
		System.out.print(RQ.Sample() + ", ");
		System.out.print(RQ.Sample() + ", ");
		System.out.print(RQ.Sample() + ". ");

	}

}
