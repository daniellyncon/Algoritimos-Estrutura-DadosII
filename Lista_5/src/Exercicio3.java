
public class Exercicio3 {
	public static void main(String[] args) {

		for (int i = 0; i <= 47; i++) {
			System.out.println("========================================================");
			System.out
					.println("[Fib Iterativo Sem Impress�o] = Tempo Execu��o: " + calcTempoIteSemImpressao(i) + "ms\n");
			System.out.print(" || Tempo Execu��o: " + calcTempoIteComImpressao(i) + "ms\n");
			System.out.println(
					"\n[Fib Recursivo Sem Impress�o] = Tempo Execu��o: " + calcTempoRecSemImpressao(i) + "ms\n");
			System.out.print(" || Tempo Execu��o: " + calcTempoRecComImpressao(i) + "ms\n");
			System.out.println("========================================================");
			System.out.println();

		}
	}

	public static long fibonacciIterativo(int n) {
		int F = 0, ant = 0;

		for (int i = 1; i <= n; i++) {

			if (i == 1) {
				F = 1;
				ant = 0;
			} else {
				F += ant;
				ant = F - ant;
			}
		}
		return F;
	}

	private static long calcTempoIteSemImpressao(int n) {
		long start = System.currentTimeMillis();

		fibonacciIterativo(n);

		long finish = System.currentTimeMillis();
		long timeElapsed = finish - start;
		return timeElapsed;
	}

	private static long calcTempoIteComImpressao(int n) {
		long start = System.currentTimeMillis();

		System.out.print("Fibonacci (" + n + ") com Impress�o: " + fibonacciIterativo(n));

		long finish = System.currentTimeMillis();
		long timeElapsed = finish - start;
		return timeElapsed;
	}

	public static long fibonacciRecursivo(int n) {
		if (n < 2) {
			return n;
		} else {
			return fibonacciRecursivo(n - 1) + fibonacciRecursivo(n - 2);
		}
	}

	private static long calcTempoRecSemImpressao(int n) {
		long start = System.currentTimeMillis();

		fibonacciRecursivo(n);

		long finish = System.currentTimeMillis();
		long timeElapsed = finish - start;

		return timeElapsed;
	}

	private static long calcTempoRecComImpressao(int n) {
		long start = System.currentTimeMillis();

		System.out.print("Fibonacci: (" + n + ") com Impress�o: " + fibonacciRecursivo(n));

		long finish = System.currentTimeMillis();
		long timeElapsed = finish - start;
		return timeElapsed;
	}

}
