package N2;

public class PagoPaypal implements PagoCallback {
	@Override
    public void procesarPago(double importeTotal) {
        System.out.println("Procesando pago con Paypal...");
        System.out.println("Importe:" + importeTotal);
        
    }

}
