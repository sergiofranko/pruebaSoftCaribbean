package Miscelanea;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class LecturaArchivo {

	public void paresYPrimos() throws FileNotFoundException {
		
		System.out.println("\nLeer un archivo que solo contiene números y sumar los números pares y primos.\n");
		
		System.out.println(String.format("La suma de los números pares y los número primos del archivo es %s", suma(leerArchivo())));
	}
	
	private String[] leerArchivo() throws FileNotFoundException {
		File archivo = new File("archivos/numeros.txt");
		Scanner leer = new Scanner(archivo);
		String plano = null;
		
		while (leer.hasNextLine()) {
			plano = leer.nextLine();
		}
		leer.close();
		return plano.split(",");
	}
	
	private boolean primo(int numero) {
		int control = 0;
		for (int i = 1; i < numero; i++) {
			if (numero % i == 0) {
				control += 1; 
			}
		}
		
		if (control < 2) {
			return true;
		}else {
			return false;
		}
	}
	
	private double suma(String[] numeros) {
		double suma = 0;
		for (int i = 0; i < numeros.length; i++) {
			int numero = 0;
			if (numerico(numeros[i])) {
				numero = Integer.parseInt(numeros[i]);
			}
			
			if (numero % 2 == 0 || primo(numero)) {
				suma += numero;
			}
		}
		return suma;
	}
	
	private static boolean numerico(String s){
		try {
			Integer.parseInt(s);
			return true;
		} catch (NumberFormatException e){
			return false;
		}
	}
}
