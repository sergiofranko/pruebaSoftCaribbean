package EstructurasDeDatos;

public class Producto {
	private int productoCodigo;
	private String productoNombre;
	private String productoDescripcion;
	private double productoValor;
	
	@Override
	public String toString() {
		return "Producto [productoCodigo=" + productoCodigo + ", productoNombre=" + productoNombre
				+ ", productoDescripcion=" + productoDescripcion + ", productoValor=" + productoValor + "]";
	}
	public int getProductoCodigo() {
		return productoCodigo;
	}
	public void setProductoCodigo(int productoCodigo) {
		this.productoCodigo = productoCodigo;
	}
	public String getProductoNombre() {
		return productoNombre;
	}
	public void setProductoNombre(String productoNombre) {
		this.productoNombre = productoNombre;
	}
	public String getProductoDescripcion() {
		return productoDescripcion;
	}
	public void setProductoDescripcion(String productoDescripcion) {
		this.productoDescripcion = productoDescripcion;
	}
	public double getProductoValor() {
		return productoValor;
	}
	public void setProductoValor(double productoValor) {
		this.productoValor = productoValor;
	}
	
	
}
