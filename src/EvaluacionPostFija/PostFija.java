package EvaluacionPostFija;

import java.util.Stack;

public class PostFija {
	
	private static final String OPERADOR = "^+-*/";
	private String expresion;

	public void evalPostFija() {
		
		System.out.println("\nRealizar la evaluación de una expresión matemática usando evaluación postfija."
				+ "\nLa expresión matemática es la entrada en forma de cadena,"
				+ "\ndebe ser evaluada y retornar el resultado del cálculo.\n");
		
		expresion = "4*2-2/4*67^2";
		String expr = separar(expresion);
		String[] arrayInFija = expr.split(" ");

		Stack<String> entrada = new Stack<String>();
		Stack<String> operadores = new Stack<String>();
		Stack<String> salida = new Stack<String>();

		for (int i = arrayInFija.length - 1; i >= 0; i--) {
			entrada.push(arrayInFija[i]);
		}

		int orden = 0;
		int ordenOperador = 0;

		while (!entrada.isEmpty()) {

			if (!operadores.isEmpty()) {

				orden = orden(entrada.peek());
				ordenOperador = orden(operadores.peek());

				if (orden < ordenOperador) {

					if (OPERADOR.contains(entrada.peek())) {
						while (!operadores.isEmpty()) {
							salida.push(operadores.pop());
						}
						operadores.push(entrada.pop());
					} else {
						salida.push(entrada.pop());
					}

				} else if (orden == ordenOperador) {

					salida.push(operadores.pop());
					operadores.push(entrada.pop());

				} else {
					operadores.push(entrada.pop());
				}

			} else {
				if (OPERADOR.contains(entrada.peek())) {
					operadores.push(entrada.pop());
				} else {
					salida.push(entrada.pop());
				}
			}
		}

		while (!operadores.isEmpty()) {
			salida.push(operadores.pop());
		}

		evaluar(salida);
	}

	private String separar(String expresion) {
		String expr = "";

		for (int i = 0; i < expresion.length(); i++) {
			if (OPERADOR.contains("" + expresion.charAt(i))) {
				expr += " " + expresion.charAt(i) + " ";
			} else
				expr += expresion.charAt(i);
		}
		return expr.replaceAll("\\s+", " ").trim();
	}

	private int orden(String operador) {
		int ordenOperadores = 1000;
		
		switch (operador) {
		case "^":
			ordenOperadores = 3;
			break;

		case "/":
			ordenOperadores = 2;
			break;

		case "*":
			ordenOperadores = 2;
			break;

		case "-":
			ordenOperadores = 1;
			break;
			
		case "+":
			ordenOperadores = 1;
			break;

		default:
			ordenOperadores = 0;
			break;
		}
		
		return ordenOperadores;
	}

	private void evaluar(Stack<String> aEvaluar) {

		Stack<String> evaluacion = new Stack<String>();
		Stack<String> auxiliar = new Stack<String>();
		double resultado = 0;
		double auxiliar1 = 0;
		double auxiliar2 = 0;

		while (!aEvaluar.isEmpty()) {
			evaluacion.push(aEvaluar.pop());
		}

		while (!evaluacion.isEmpty()) {

			if (OPERADOR.contains(evaluacion.peek())) {
				String condicion = evaluacion.pop();
				auxiliar2 = Double.parseDouble(auxiliar.pop());
				auxiliar1 = Double.parseDouble(auxiliar.pop());

				if(condicion.equals("^")) {
					resultado = Math.pow(auxiliar1, auxiliar2);
				} else if (condicion.equals("/")) {
					try {
						resultado = auxiliar1 / auxiliar2;
					} catch (ArithmeticException e) {
						System.err.println("División por cero!");
					}
					
				} else if (condicion.equals("*")) {
					resultado = auxiliar1 * auxiliar2;
				} else if (condicion.equals("-")) {
					resultado = auxiliar1 - auxiliar2;
				} else if (condicion.equals("+")) {
					resultado = auxiliar1 + auxiliar2;
				} else {
					resultado = 0;
				}
				auxiliar.push(String.valueOf(resultado));
			} else {
				auxiliar.push(evaluacion.pop());

			}

		}
		System.out.println(String.format("El resultado de evaluar %s es %s",this.expresion, auxiliar.peek()));
	}}
