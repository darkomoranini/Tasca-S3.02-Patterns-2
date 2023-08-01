package N2;

public class App {

	public static void main(String[] args) {
		Zapateria zapateria = new Zapateria();
		
		PagoCallback pagoTarjeta = new PagoTarjetaCredito();
		zapateria.realizarPago(pagoTarjeta, 50.00);
		
		PagoCallback pagoPaypal = new PagoPaypal();
		zapateria.realizarPago(pagoPaypal, 150.00);
		
		PagoCallback pagoDebito = new PagoDebito();
		zapateria.realizarPago(pagoDebito, 25.00);
		
		

	}

}
