package EstructurasDeDatos;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.Stack;

public class Pila {
	
	Scanner scanner = new Scanner(System.in);
	
	public void pilaLIFO() {
		
		System.out.println("\nImplemente una Pila que opere de manera LIFO, para recibir simulación de transacciones de ventas\n");
		
		Stack<Object> stack = new Stack<Object>();
		
		System.out.println("Sistema de Ventas.");
		
		int transaccionId = 0;
		
		do {
			transaccionId++;
			
			stack.push(setTransaccion(transaccionId));
			System.out.print("¿Quiere ingresar una nueva transaccion? \n"
					+ "1. Si \n"
					+ "2. No \n"
					+ "Seleccione una opción: ");
			
		} while (scanner.next().equals("1"));
		
		while (!stack.isEmpty()) {
			System.out.println(stack.pop());
		}
		
	}
	private Producto setProducto() {
		Producto producto = new Producto();
		
		System.out.print("Ingrese el codigo del producto: ");
		try {
			producto.setProductoCodigo(scanner.nextInt());
		} catch(InputMismatchException e) {
			System.err.println(String.format("código del producto no es un número válido || error: %s", e));
		}
		System.out.print("Ingrese el nombre del producto: ");
		producto.setProductoNombre(scanner.next());
		System.out.print("Ingrese la descripcion del producto: ");
		producto.setProductoDescripcion(scanner.next());
		System.out.print("Ingrese el valor del producto: ");
		try {
			producto.setProductoValor(scanner.nextDouble());
		} catch(InputMismatchException e) {
			System.err.println(String.format("Valor del producto no es un número válido || error: %s", e));
		}
		
		
		return producto;
	}
	
	private Transaccion setTransaccion(int transaccionId) {
		Transaccion transaccion = new Transaccion();
		Producto producto = setProducto();
		
		transaccion.setTransaccionId(transaccionId);
		transaccion.setProducto(producto);
		System.out.print("Ingrese la cantidad del producto: ");
		transaccion.setProductoCantidad(scanner.nextInt());
		transaccion.setTransaccionTotal(producto.getProductoValor() * transaccion.getProductoCantidad());
		
		return transaccion;
	}
}
