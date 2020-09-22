package Miscelanea;

import java.util.Scanner;

public class Multiplos4 {

	private Scanner scanner = new Scanner(System.in);
	
	public void multiplosDe4HastaN() {
		
		System.out.println("Calcular los múltiplos de 4 comprendidos entre 4 y N , donde N es un valor\n" + 
				"introducido por consola.");
		
		
		System.out.print("Ingrese el número N mayor o igual que 4: ");
		int numero = scanner.nextInt();
		
		String respuesta = "";
		if (numero >= 4) {
			System.out.print(String.format("Los múltiplos de 4 comprendidos entre 4 y %s son: ", numero));
			for(int i = 4; i <= numero; i++)
			{
				if(i%4==0) {
					respuesta += String.format("%s, ", i);
				}
			}
			System.out.println(respuesta.substring(0, respuesta.length()-2));
		} else {
			System.out.println(String.format("El número %s no es mayor o igual a 4", numero));
		}
	}
}
