package tiempo;

public class Tiempo_objeto {

	private int hora;
	private int min;
	private final int dia=1440;
	
	
	public Tiempo_objeto() {
		this.hora = -99;
		this.min = -99;
	}


	public int getHora() {
		return hora;
	}


	public void setHora(int hora) {
		this.hora = hora;
	}


	public int getMin() {
		return min;
	}


	public void setMin(int min) {
		this.min = min;
	}


	@Override
	public String toString() {
		return ""+(dia-(hora*60+min))+"";
	}
	
	
	
}
