package N3;

public class App {
	
	public static void main(String[] args) {
		ConvertidorMXN convertidorMxn= new ConvertidorMXN();
        MostrarPrecios mostrarPreciosMxn = new MostrarPrecios(convertidorMxn);
        
        ConvertidorUSD convertidorUsd= new ConvertidorUSD();
        MostrarPrecios mostrarPreciosUsd = new MostrarPrecios(convertidorUsd);
        
        ConvertidorINP convertidorInp= new ConvertidorINP();
        MostrarPrecios mostrarPreciosInp = new MostrarPrecios(convertidorInp);
        
        mostrarPreciosMxn.mostrarPreciosEnMonedas("Pesos(MXN)");
        mostrarPreciosUsd.mostrarPreciosEnMonedas("Dolares(USD)");
        mostrarPreciosInp.mostrarPreciosEnMonedas("Rupias(INR)");
        
	 
		 
	 }
}
