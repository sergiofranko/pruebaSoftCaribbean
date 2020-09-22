package EstructurasDeDatos;

import java.util.Scanner;

public class Arbol {

	private Rama raiz;
	private int contador = 0;
	Scanner scanner = new Scanner(System.in);

	public Rama getRaiz() {
		return raiz;
	}

	public void setRaiz(Rama raiz) {
		this.raiz = raiz;
	}

	public int getContador() {
		return contador;
	}

	public void setContador(int contador) {
		this.contador = contador;
	}

	public Arbol() {
		this.raiz = null;
	}
	
	public void datos() {
		
		System.out.println("\nEscriba un programa que recorra un árbol binario de números enteros y cuente cuantos nodos tiene\n");
		
		int llave = 0;
		
		do {
			llave++;
			System.out.print("Ingrese un número entero: ");
			insertar(llave, scanner.nextInt());
			System.out.print("¿Quiere ingresar un nuevo número entero al árbol? \n"
					+ "1. Si \n"
					+ "2. No \n"
					+ "Seleccione una opción: ");
		}while(scanner.nextInt() == 1);
	}
	
	public void insertar(int llave, int valor) {
		
		Rama ramaNueva = new Rama(llave);
		ramaNueva.setValor(valor);
		
		if (raiz == null) {
			
			raiz = ramaNueva;
			
		} else {
			
			Rama auxiliar = raiz;
			
			while(auxiliar != null) {
				
				ramaNueva.setPadre(auxiliar);
				
				if (ramaNueva.getLlave() >= auxiliar.getLlave()) {
					
					auxiliar = auxiliar.getDerecha();
					
				} else {

					auxiliar = auxiliar.getIzquierda();
					
				}
			}
			
			if (ramaNueva.getLlave() < ramaNueva.getPadre().getLlave()) {
				ramaNueva.getPadre().setIzquierda(ramaNueva);
			} else {
				ramaNueva.getPadre().setDerecha(ramaNueva);
			}
			
		}
		
	}
	
	public void recorrer(Rama rama) {
		
		if (rama != null) {
			recorrer(rama.getIzquierda());
			contador++;
			recorrer(rama.getDerecha());
		}
		
	}
}
