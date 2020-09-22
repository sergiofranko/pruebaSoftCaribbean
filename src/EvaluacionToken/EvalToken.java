package EvaluacionToken;

import java.util.Scanner;

public class EvalToken {
	
	private Scanner scanner = new Scanner(System.in);
	
	public void token() {
		
		System.out.println("\nTeniendo una cadena con varias palabras claves entre corchetes {},"
				+ "\nencuentra dichas palabras y retorne un Array con dichas palabras,"
				+ "\ncolocando su primera letra en mayúscula\n");
		
		System.out.print("Ingrese el texto, recuerde poner las palabras clave entre llaves ({}): ");
		String texto = scanner.nextLine();
		imprimir(palabrasClave(separar(texto)));
		
	}
	
	private String[] separar(String texto) {
		String[] vector = null;
		if(texto.contains("{")) {
			vector = texto.substring(texto.indexOf("{")).split("\\{");
		}
		
		return vector;
	}
	
	private String[] palabrasClave(String[] vector) {
		
		for (int i = 0; i < vector.length; i++) {
            if(vector[i] != null && !vector[i].isEmpty()) {
                if(vector[i].contains("{")) {
                    vector[i] = vector[i].split("\\{")[1];
                }
                if(vector[i].contains("}")) {
                    vector[i] = vector[i].split("\\}")[0];
                }
                vector[i] = vector[i].substring(0,1).toUpperCase() + vector[i].substring(1).toLowerCase();
            }
        }
		return vector;
	}
	
	private void imprimir(String[] claves) {
		if (claves != null) {
			for (int i = 0; i < claves.length; i++) {
				if (!claves[i].isEmpty()) {
					System.out.println(String.format("Palabra clave: %s", claves[i]));					
				}
			}
		} else {
			System.out.println("El texto ingresado no contiene palabras clave.");
		}
	}
}
