package agenda;

public class Contacto {

	private String nombre = "cambiame";
	private int numero = -99;
	
	
	
	public Contacto() {
		this.nombre = nombre;
		this.numero = numero;
	}
	
	public Contacto(String nombre, int numero) {
		this.nombre = nombre;
		this.numero = numero;
	}
	
	
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}

	
	

	
	
	
	
}