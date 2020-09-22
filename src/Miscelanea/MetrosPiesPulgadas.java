package Miscelanea;

import java.util.Scanner;

public class MetrosPiesPulgadas {
	
	private static final double METROS_PULGADAS = 39.37;
	private static final double METROS_PIES = 39.37 / 12;
	private Scanner scanner = new Scanner(System.in);
	
	public void metros() {
		
		System.out.println("\nConvertir metros a pies y a pulgadas (1 Metro = 39.37 pulgadas)\n");
		
		
		System.out.print("Ingrese el número de metros: ");
		double metros = Math.abs(scanner.nextDouble());
		double metrosPulgadas = metrosPulgadas(metros);
		double metrosPies = metrosPies(metros);
		System.out.println(String.format("%s metros, equivalen a %s pulgadas y %s pies", metros, metrosPulgadas, metrosPies));
	}
	
	private double metrosPulgadas(double metros) {
		return Math.abs(metros * METROS_PULGADAS);
	}
	
	private double metrosPies(double metros) {
		return Math.abs(metros * METROS_PIES);
	}
	
}
