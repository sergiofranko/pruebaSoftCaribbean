package EvaluacionAgrupacion;

import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;


public class Agrupacion {
	
	private static final String CIUDAD = "ciudad";
	private static final String ALMACEN = "almacen";
	private static final String MES = "mes";
	private static final String VENTA = "venta";

	@SuppressWarnings("unchecked")
	public void leerArchivo() {
		
		System.out.println("\nTeniendo un arreglo en una estructura Json, según muestra la figura."
				+ "\nCalcule y muestre el total por ciudad para cada mes.\n");
		
		JSONParser jsonParser = new JSONParser();
		
		try {
			JSONArray listVentas = (JSONArray) jsonParser.parse(new FileReader("archivos/venta-ciudad-mes.json"));
			List<Ventas> ventas = new  ArrayList<Ventas>();
			listVentas.forEach(vent -> {
				Ventas venta = new Ventas((String) ((JSONObject) vent).get(CIUDAD),
						(String) ((JSONObject) vent).get(ALMACEN),
						(String) ((JSONObject) vent).get(MES),
						(Long) ((JSONObject) vent).get(VENTA));
				ventas.add(venta);
			});
			Function<Ventas, List<Object>> llaveCompuesta = ventastotal ->
		    Arrays.<Object>asList(ventastotal.getCiudad(), ventastotal.getMes());
		    
			ventas.stream()
			.collect(Collectors.groupingBy(llaveCompuesta, Collectors.summingLong(Ventas::getVenta)))
			.forEach((llave, valor) -> System.out.println(String.format("%s : %s", llave, valor)));
			
		} catch (IOException e) {
			System.err.println("Error al leer el archivo");
		} catch (ParseException e) {
			System.err.println("Error al leer el archivo");
		}
	}
}
