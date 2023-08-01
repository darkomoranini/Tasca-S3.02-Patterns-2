package N1;

public class App {

	public static void main(String[] args) {
		Agente agente = new Agente();
		
		Agencia agencia1 = new Agencia("ABANTE ASESORES DISTRIBUCION");
		Agencia agencia2 = new Agencia("ACAPITAL BB");
		
		agente.registrarAgencia(agencia1);
		agente.registrarAgencia(agencia2);
		
		agente.actualizar(true);
		agente.actualizar(false);
		
		agente.eliminarAgencia(agencia2);
		agente.actualizar(true);
		
	}

}
