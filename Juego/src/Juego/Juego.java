package Juego;

public class Juego {

	private String nombre;
	private int record;
	private boolean multijugador;
	
	
	public Juego(String nombre, boolean multi) {
		this.nombre = nombre;
		this.record = 0;
		this.multijugador= multi;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public int getRecord() {
		return record;
	}


	public void setRecord(int record) {
		this.record = record;
	}


	public boolean isMultijugador() {
		return multijugador;
	}


	public void setMultijugador(boolean multijugador) {
		this.multijugador = multijugador;
	}
	
	
	public void ponerRecord(int puntuacion) {
		this.record = puntuacion;
	}


	@Override
	public String toString() {
		String multi ="";
		if(this.multijugador==true) {
			multi = " que es multijugador,";
		}else {
			multi = " que es de un solo jugador,";
		}
		
		return "En el juego "+nombre+multi+" tu record es de "+record+" puntos";
	}
	
	
	
	
}
