package ejercicioModulos;

public class Modulo {

	private String nombre;
	private String codigo;
	private int numHoras;
	
	public Modulo(String nombre, String codigo, int numHoras) {
		this.nombre = nombre;
		this.codigo = codigo;
		this.numHoras = numHoras;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public int getNumHoras() {
		return numHoras;
	}

	public void setNumHoras(int numHoras) {
		this.numHoras = numHoras;
	}

	@Override
	public String toString() {
		return  nombre + " - " + codigo + " - Horas -> " + numHoras;
	}
	
}
