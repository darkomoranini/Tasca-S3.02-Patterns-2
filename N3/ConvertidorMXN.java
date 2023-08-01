package N3;

public class ConvertidorMXN implements ConvertidorMoneda{
	@Override
	public double convertir(double cantidad, String monedaDestino) {

		double factorConversion = 5.44;
		return cantidad * factorConversion;
	}
}
	