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
		for (int i = 0; i < vModulos.length; i++) {
			
			String nombre="", codigo="";
			int numHoras=-99;
			Scanner leerTxt = new Scanner(System.in);
			Scanner leerNum = new Scanner(System.in);
			
			if (vModulos[i]==null) {
				System.out.println("Dime el nombre del nuevo modulo");
				nombre = leerTxt.nextLine();
				System.out.println("Dime el codigo del nuevo modulo");
				codigo = leerTxt.nextLine();
				System.out.println("Dime las horas que durara el nuevo modulo");
				do {
					try {
						numHoras = leerNum.nextInt();
					} catch (Exception e) {
						numHoras=-99;
						leerNum = new Scanner(System.in);
						System.out.println("Introduzca un valor numerico por favor (y que sea mayor que 0)");
					}
					if (numHoras<=0) {
						System.out.println("Introduzca un numero de horas valido por favor (minimo debe ser mayor que 0)");
					}
				} while (numHoras<=0);
				
				vModulos[i]= new Modulo(nombre, codigo, numHoras);
				System.out.println("modulo añadido correctamente");
				break;
			}
		}
		
	}
	
	public int horasYear() {
		
		int horasTotales=0;
		
		for (Modulo m : vModulos) {
			if (m!=null) {
				
				horasTotales+=m.getNumHoras();
			}
			
			
		}
		
		return horasTotales;
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
		
		return  nombre + "\n" + tutor + "\n numero modulos\n-------\n" + datos;
	}
}
