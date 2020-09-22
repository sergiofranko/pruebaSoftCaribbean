package EstructurasDeDatos;

public class Rama {
	
	private Rama padre;
	private Rama derecha;
	private Rama izquierda;
	private int llave;
	private int valor;
	
	public Rama(int llave) {
		
		this.llave = llave;
		this.padre = null;
		this.derecha = null;
		this.izquierda = null;
		this.valor = 0;
	}

	public Rama getPadre() {
		return padre;
	}

	public void setPadre(Rama padre) {
		this.padre = padre;
	}

	public Rama getDerecha() {
		return derecha;
	}

	public void setDerecha(Rama derecha) {
		this.derecha = derecha;
	}

	public Rama getIzquierda() {
		return izquierda;
	}

	public void setIzquierda(Rama izquierda) {
		this.izquierda = izquierda;
	}

	public int getLlave() {
		return llave;
	}

	public void setLlave(int llave) {
		this.llave = llave;
	}

	public int getValor() {
		return valor;
	}

	public void setValor(int valor) {
		this.valor = valor;
	}
	
}
