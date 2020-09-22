import java.io.FileNotFoundException;
import java.util.Scanner;

import EstructurasDeDatos.Arbol;
import EstructurasDeDatos.Cola;
import EstructurasDeDatos.Pila;
import EvaluacionAgrupacion.Agrupacion;
import EvaluacionPostFija.PostFija;
import EvaluacionToken.EvalToken;
import Miscelanea.Cuadrado;
import Miscelanea.Fibonacci;
import Miscelanea.LecturaArchivo;
import Miscelanea.MetrosPiesPulgadas;
import Miscelanea.Multiplos4;
import Miscelanea.Series;

public class Menu {
	
	public void menu(Scanner scanner) {
		
		
		System.out.print("1.  Ejercicio 1:  Múltiplos de 4 \n"
				+ "2.  Ejercicio 2:  Metros a pies y pulgadas\n"
				+ "3.  Ejercicio 3:  Suma cuadrados \n"
				+ "4.  Ejercicio 4:  Lectura archivo .txt \n"
				+ "5.  Ejercicio 5:  Serie de polinomios con factorial \n"
				+ "6.  Ejercicio 6:  Serie de Fibonacci \n"
				+ "7.  Ejercicio 7:  Pila LIFO \n"
				+ "8.  Ejercicio 8:  Colas \n"
				+ "9.  Ejercicio 9:  Árbol binario \n"
				+ "10. Ejercicio 10: Palabras clave \n"
				+ "11. Ejercicio 11: Evaluación postFija \n"
				+ "12. Ejercicio 12: Lectura y procesamiento archivo JSON \n"
				+ "0. Salir\n"
				+ "Seleccione ejercicio: ");
		String option = scanner.next();
		do {
			switch(option) {
			case "0":
				break;
			case "1": 
				Multiplos4 multiplos4 = new Multiplos4();
				multiplos4.multiplosDe4HastaN();
				break;
				
			case "2":
				MetrosPiesPulgadas metrosPiesPulgadas = new MetrosPiesPulgadas();
				metrosPiesPulgadas.metros();
				break;
				
			case "3": 
				Cuadrado cuadrado = new Cuadrado();
				cuadrado.cuadradoCienNaturales();
				break;
				
			case "4":
				LecturaArchivo lecturaArchivo = new LecturaArchivo();
				try {
					lecturaArchivo.paresYPrimos();
				} catch (FileNotFoundException e) {
					System.out.println("El archivo no fue encontrado");
				}
				break;
				
			case "5":
				Series series = new Series();
				series.nesimoTermino();
				series.mayorE();
				break;
				
			case "6":
				Fibonacci fibonacci = new Fibonacci();
				fibonacci.serieFibonacci();
				break;
				
			case "7": 
				Pila pila = new Pila();
				pila.pilaLIFO();
				break;
				
			case "8":
				Cola cola = new Cola();
				cola.banco();
				break;
				
			case "9":
				Arbol arbol = new Arbol();
				arbol.datos();
				arbol.recorrer(arbol.getRaiz());
				System.out.println(String.format("El árbol tiene %s nodos", arbol.getContador()));
				break;
				
			case "10":
				EvalToken evalToken = new EvalToken();
				evalToken.token();
				break;
				
			case "11":
				PostFija postFija = new PostFija();
				postFija.evalPostFija();
				break;
				
			case "12":
				Agrupacion agrupacion = new Agrupacion();
				agrupacion.leerArchivo();
				break;
				
			default:
				System.err.println("Opción equivocada, Ingrese opción de nuevo");
				break;
			}
			
			System.out.println("Seleccione nuevo ejercicio: ");
			option = scanner.next();
		} while(!option.equals("0"));
	}
}
