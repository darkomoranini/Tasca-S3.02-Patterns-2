package N1;

public interface Observable {
	
	void registrarAgencia(Observer agencia);
    void eliminarAgencia(Observer agencia);
    void notificarAgencia(boolean sube);
}
