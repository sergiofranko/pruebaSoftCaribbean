package EvaluacionAgrupacion;

public class Ventas {
	
	private String ciudad;
	private String almacen;
	private String mes;
	private Long venta;
	
	public Ventas() {
	}
	
	public Ventas(String ciudad, String almacen, String mes, Long venta) {
		this.ciudad = ciudad;
		this.almacen = almacen;
		this.mes = mes;
		this.venta = venta;
	}

	public String getCiudad() {
		return ciudad;
	}

	public String getAlmacen() {
		return almacen;
	}

	public String getMes() {
		return mes;
	}

	public Long getVenta() {
		return venta;
	}
}
