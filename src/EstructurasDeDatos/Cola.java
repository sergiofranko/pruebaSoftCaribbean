package EstructurasDeDatos;

import java.util.Scanner;

public class Cola {
	
	Scanner scanner = new Scanner(System.in);
	Nodo inicio;
	int dimension;
	
	public void banco() {
		
		System.out.println("\nTeniendo una cola doblemente enlazada de personas haciendo la fila en un banco, "
				+ "\npermita adicionar una nueva persona que se mete de colada a la fila\n");
		
		do {
			System.out.print("Ingrese el nombre de la persona a ingresar en la fila: ");
			filarPersona(scanner.next());
			System.out.print("¿Quiere ingresar una nueva persona a la fila? \n"
					+ "1. Si \n"
					+ "2. No \n"
					+ "Seleccione una opción: ");
		}while(scanner.nextInt() == 1);
		System.out.print("¿Quiere colar una persona en la fila? \n"
				+ "1. Si \n"
				+ "2. No \n"
				+ "Seleccione una opción: ");
		if (scanner.nextInt() == 1) {
			System.out.println("Ingrese el nombre de la persona a colar en la fila: ");
			colarPersona(scanner.next());
		}
		printCola();
	}
	
	private boolean filarPersona(String persona) {
		if(inicio == null) {
			inicio = new Nodo(null, null, persona);
			dimension++;  
			return true;
		} else {
			Nodo auxiliar = inicio;
			while(auxiliar.tieneSiguiente()) {
				auxiliar = auxiliar.getNodoSiguiente();
			}
			auxiliar.setNodoSiguiente(new Nodo(auxiliar, null, persona));
			dimension++;
			return true;
		}
	}
	
	private void printCola() {
		Nodo auxiliar = inicio;
		String personas = "";
		while(auxiliar != null) {
			personas += String.format("%s, ", auxiliar.getPersona());
			auxiliar = auxiliar.getNodoSiguiente();
		}
		System.out.println(personas.substring(0, personas.length()-2));
	}
	
	private void colarPersona(String persona) {
		System.out.print(String.format("Ingrese la posición en la que quiere colar la persona (Número entre 1 y %s): ", dimension));
		int posicion = scanner.nextInt();
		
		if (posicion >= 1 && posicion <= dimension) {
			Nodo auxiliar = inicio;
			Nodo siguiente = null;
			
			for (int i = 0; i < posicion-2; i++) {
				auxiliar = auxiliar.getNodoSiguiente();
			}
			siguiente = auxiliar.getNodoSiguiente();
			auxiliar.setNodoSiguiente(new Nodo(null, null, persona += "(Colado)"));
			auxiliar.getNodoSiguiente().setNodoSiguiente(siguiente);
			dimension++;
		} else {
			filarPersona(persona);
		}
	}
	
	
	
	
	
}
