package ejercicioModulos;

public class Curso {

	
	private String nombre;
	private String tutor;
	private Modulo vModulos[];
	
	public Curso(String nombre, String tutor) {
		this.nombre = nombre;
		this.tutor = tutor;
		this.vModulos = new Modulo[10];
		//Borrame luego, es solo para pruebas
		vModulos[0] = new Modulo("Programacion", "PRG", 50);
		vModulos[3] = new Modulo("Entornos", "ED", 50);
		vModulos[8] = new Modulo("Lenguajes", "LG", 100);
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getTutor() {
		return tutor;
	}

	public void setTutor(String tutor) {
		this.tutor = tutor;
	}

	public Modulo[] getvModulos() {
		return vModulos;
	}

	public void setvModulos(Modulo[] vModulos) {
		this.vModulos = vModulos;
	}

	@Override
	public String toString() {
		String datos="";
		
		for (Modulo modulo : vModulos) {
			if (modulo != null) {
				datos += modulo.toString() + "\n";
			}
		}
		
		return  nombre + "\n" + tutor + "\nMódulos\n-------\n" + datos;
	}
}
