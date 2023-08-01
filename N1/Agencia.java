package N1;

public class Agencia implements Observer{
	
	private String nombre;
	
	public Agencia(String nombre) {
		this.nombre = nombre;
	}

	@Override
    public void actualizar(boolean sube) {
        if (sube) {
            System.out.println(nombre + ": ha subido");
        } else {
            System.out.println(nombre + ": ha bajado");
        }
    }
}
