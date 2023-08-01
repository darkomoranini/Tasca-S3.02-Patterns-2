package N2;

@FunctionalInterface
interface PagoCallback {
	void procesarPago(double importeTotal);

}
