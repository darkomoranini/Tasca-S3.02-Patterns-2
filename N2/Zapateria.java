package N2;

public class Zapateria {

	 public void realizarPago(PagoCallback pagoCallback, double importeTotal) {
	        System.out.println("Total a pagar:" + importeTotal);      
	        pagoCallback.procesarPago(importeTotal);
	        System.out.println("¡Gracias por su compra!");
	    }
}
