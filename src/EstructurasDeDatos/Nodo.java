package EstructurasDeDatos;

public class Nodo {

	private Nodo nodoAnterior;
	private Nodo nodoSiguiente;
	private String persona;
	
	public Nodo() {};
	
	public Nodo(Nodo nodoAnterior, Nodo nodoSiguiente, String persona) {
		this.nodoAnterior = nodoAnterior;
		this.nodoSiguiente = nodoSiguiente;
		this.persona = persona;
	}

	public Nodo getNodoAnterior() {
		return nodoAnterior;
	}

	public void setNodoAnterior(Nodo nodoAnterior) {
		this.nodoAnterior = nodoAnterior;
	}

	public Nodo getNodoSiguiente() {
		return nodoSiguiente;
	}

	public void setNodoSiguiente(Nodo nodoSiguiente) {
		this.nodoSiguiente = nodoSiguiente;
	}

	public String getPersona() {
		return persona;
	}

	public void setPersona(String persona) {
		this.persona = persona;
	}
	
	public boolean tieneSiguiente() {
		return nodoSiguiente != null;
	}
	
	public boolean tieneAnterior() {
		return nodoAnterior != null;
	}
	
}
