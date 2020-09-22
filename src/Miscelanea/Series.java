package Miscelanea;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Series {

	private Scanner scanner = new Scanner(System.in);
	
	public void nesimoTermino() {
		
		System.out.println("\nCalcular Ex=1+x+(x^2/2!)+(x^3/3!)+...+(x^n/n!) para N>0\n"
				+ "a) Para N dado \n"
				+ "b) Hasta que N sea tal que (x^n/n)<E\n");
		
        System.out.print("Ingrese el n-ésimo término: ");
        int n = scanner.nextInt();
        printEDeX(n);
    }
    
    public void mayorE() {
        System.out.print("Ingrese el n-ésimo término: ");
        int n = scanner.nextInt();
        System.out.print("Ingrese un valor para x: ");
        int x = scanner.nextInt();
        System.out.print("Ingrese un valor para E, (ejemplo E = 0,0001): ");
        double e = -1000;
        try {
        	e = scanner.nextDouble();
        	printEDeX(n, x, e);
		} catch (InputMismatchException ex) {
			System.out.println("El formato del número E es incorrecto, verifique que el formato decimal sea separado con coma(,) y no con punto(.)");
		}
        
        
    }
    
    private void printEDeX(int n) {
        String expresion = "a) E(x) = ";
        for (int i = 0; i <= n; i++) {
            if(i == 0) {
            	expresion += "1 ";
            } else if(i == 1) {
            	expresion += "+ x ";
            } else {
            	expresion += String.format("+ (x^%s) / %s! ", i, i);
            }
        }
        System.out.println(expresion);
    }
    
    private void printEDeX(int n, int x, double e) {
        String expresion = String.format("b) E(%s) = ", x);
        for (int i = 0; i <= n; i++) {
            if(e != -1000 && i != 0) {
                double xALaN = Math.pow(x, i)/i;
                if (xALaN >= e) {
                    break;
                }
            }
            if(i == 0) {
            	expresion += "1 ";
            } else if(i == 1) {
            	expresion += "+ x ";
            } else {
            	expresion += String.format("+ (x^%s) / %s! ", i, i);
            }
        }
        System.out.println(expresion);
    }
}

