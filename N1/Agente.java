package N1;

import java.util.ArrayList;

public class Agente implements Observable {

	 private ArrayList<Observer> observers = new ArrayList<>();
	    private boolean sube;

	    @Override
	    public void registrarAgencia(Observer observer) {
	        observers.add(observer);
	    }

	    @Override
	    public void eliminarAgencia(Observer observer) {
	        observers.remove(observer);
	    }

	    @Override
	    public void notificarAgencia(boolean sube) {
	        this.sube = sube;
	        for (Observer observer : observers) {
	            observer.actualizar(sube);
	        }
	    }

	    public void actualizar(boolean puja) {
	        notificarAgencia(puja);
	    }
	}
