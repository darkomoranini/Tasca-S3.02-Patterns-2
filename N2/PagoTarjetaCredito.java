package N2;

public class PagoTarjetaCredito implements PagoCallback {
	@Override
    public void procesarPago(double importeTotal) {
        System.out.println("Procesando pago con tarjeta de crédito...");
        System.out.println("Importe: " + importeTotal);
        
    }

}
