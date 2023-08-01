package N3;

public class ConvertidorINP implements ConvertidorMoneda{
	@Override
    public double convertir(double cantidad, String monedaDestino) {
       
        double factorConversion = 90.62;
        return cantidad * factorConversion;
	}
}
