package ejercicioModulos;

import java.util.Scanner;

public class Curso {

	
	private String nombre;
	private String tutor;
	private Modulo vModulos[];
	
	public Curso(String nombre, String tutor) {
		this.nombre = nombre;
		this.tutor = tutor;
		this.vModulos = new Modulo[10];
	}

	public void addModulo(){
		
		
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
