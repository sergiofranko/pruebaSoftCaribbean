package Miscelanea;

public class Cuadrado {

	public void cuadradoCienNaturales() {
		
		System.out.println("\nCalcular la suma de los cuadrados de los 100 primeros números naturales\n");
		
		double suma = 0;
        for (int i = 1; i <= 100; i++) {
            suma += Math.pow(i, 2);
        }
        System.out.println(String.format("%s es el resultado de sumar los cien primeros números naturales ", suma));
	}
}
