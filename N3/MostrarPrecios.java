package N3;
import java.util.HashMap;
import java.util.Map;

public class MostrarPrecios {
	private ConvertidorMoneda convertidorMoneda;
	private Map<String, Double> precios;

	public MostrarPrecios(ConvertidorMoneda convertidorMoneda) {
		this.convertidorMoneda = convertidorMoneda;
		precios = new HashMap<>();

		precios.put("a1", 10.0);
		precios.put("a2", 25.0);
		precios.put("a3", 100.0);
	}		
	
	public void mostrarPreciosEnMonedas(String monedaDestino) {
		System.out.println("Precios en " + monedaDestino + ":");
		
		for (Map.Entry<String, Double> entry : precios.entrySet()) {
			String articulo = entry.getKey();
			double precio = entry.getValue();
			double precioConvertido = convertidorMoneda.convertir(precio, monedaDestino);
			System.out.println(articulo + ": " + precioConvertido + " " + monedaDestino);
		}
	}
}
