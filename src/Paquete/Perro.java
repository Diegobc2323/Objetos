package Paquete;

public class Perro {

	private String nombre;
	private int edad;
	private boolean vacunado;
	
	public Perro(String nombre) {
		// TODO Auto-generated constructor stub
		
		this.nombre = nombre;
		this.edad=0;
		this.vacunado=false;
		
	}
	
	public void cumplaAnos() {
		
		if (this.edad<15) {
			this.edad++;
		}else {
			System.out.println("firulais is no more");
		}
	}
	
	
	public void ponerVacuna() {
		
		if (this.vacunado==true) {
			System.out.println("tu perro ya esta vacunado");
		}else {
			this.vacunado=true;
		}
	}
	
	

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public boolean isVacunado() {
		return vacunado;
	}

	public void setVacunado(boolean vacunado) {
		this.vacunado = vacunado;
	}

	@Override
	public String toString() {
		
		String estaVacunado="";
		
		if(vacunado==true) {
			estaVacunado=" esta vacunado";
		}else {
			estaVacunado=" no esta vacunado";
		}
		
		return "El perro " + nombre + " tiene " + edad + " años y" + estaVacunado;
	}
	
	
	
	
}
