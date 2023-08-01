package N3;

public class ConvertidorUSD implements ConvertidorMoneda{
	@Override
    public double convertir(double cantidad, String monedaDestino) {
       
        double factorConversion = 1.18;
        return cantidad * factorConversion;
	}
}
