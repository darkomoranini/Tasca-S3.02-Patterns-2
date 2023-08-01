package N2;

public class PagoDebito implements PagoCallback {
	@Override
    public void procesarPago(double importeTotal) {
        System.out.println("Procesando pago debito...");
        System.out.println("Importe: " + importeTotal);
        
    }

}
