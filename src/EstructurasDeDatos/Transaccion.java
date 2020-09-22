package EstructurasDeDatos;

public class Transaccion {
	private int transaccionId;
	private Producto producto;
	private int productoCantidad;
	private double transaccionTotal;
	public int getTransaccionId() {
		return transaccionId;
	}
	public void setTransaccionId(int transaccionId) {
		this.transaccionId = transaccionId;
	}
	public Producto getProducto() {
		return producto;
	}
	public void setProducto(Producto producto) {
		this.producto = producto;
	}
	public int getProductoCantidad() {
		return productoCantidad;
	}
	public void setProductoCantidad(int productoCantidad) {
		this.productoCantidad = productoCantidad;
	}
	public double getTransaccionTotal() {
		return transaccionTotal;
	}
	public void setTransaccionTotal(double transaccionTotal) {
		this.transaccionTotal = transaccionTotal;
	}
	@Override
	public String toString() {
		return "Transaccion [transaccionId=" + transaccionId + ", producto=" + producto + ", productoCantidad="
				+ productoCantidad + ", transaccionTotal=" + transaccionTotal + "]";
	}
	
	
}
