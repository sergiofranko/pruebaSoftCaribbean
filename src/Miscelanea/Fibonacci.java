package Miscelanea;

import java.util.Scanner;

public class Fibonacci {

	private Scanner scanner = new Scanner(System.in);
	public void serieFibonacci() {
		
		System.out.println("\nCalcular el n-ésimo término de la seria de Fibonacci\n");
		
		
		System.out.print("Ingrese el valor del n-ésimo término de la serie: ");
		int n = scanner.nextInt();
		double serie[] = new double[n+1];
		
		for (int i = 1; i <= n; i++) {
			if (i == 1) {
				serie[i] = 1;
			} else if (i == 2) {
				serie[i] = 2;
			} else {
				serie[i] = serie[i-1]+serie[i-2];
			}
		}
		System.out.println(String.format("%s es el %s-ésimo término de la serie de fibonacci", serie[n], n));

	}
}
