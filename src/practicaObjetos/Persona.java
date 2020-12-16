package practicaObjetos;

import java.util.Random;

public class Persona {

	private String nombre;
	private String dni;
	private int edad;
	private char sexo; //  M Mujer ----- H Hombre
	private double peso;
	private double altura; // Altura en m
	
	private final char HOMBRE = 'H'; // Constante Hombre
	private final char MUJER = 'M';  // Constante Mujer
	private final int SOBREPESO = 1;
	private final int PESOIDONEO = 0;
	private final int BAJOPESO = -1;
	
	

	
	
	
	public Persona() {
		this.nombre = "";
		this.dni = generarDNI();
		this.edad = 0;
		this.sexo = this.HOMBRE;
		this.peso = 0;
		this.altura = 0;
	}

	public Persona(String nombre, int edad, char sexo) {
		this.nombre = nombre;
		this.dni = generarDNI();
		this.edad = edad;
		this.sexo = comprobarSexo(sexo);
		this.peso = 0;
		this.altura = 0;
	}

	public Persona(String nombre, int edad, char sexo, double peso, double altura) {
		this.nombre = nombre;
		this.dni = generarDNI();
		this.edad = edad;
		this.sexo = comprobarSexo(sexo);
		this.peso = peso;
		this.altura = altura;
	}
	
	public Persona(String nombre, String dni, int edad, char sexo, double peso, double altura) {
		this.nombre = nombre;
		this.dni = comprobarDNI(dni);
		this.edad = edad;
		this.sexo = comprobarSexo(sexo);
		this.peso = peso;
		this.altura = altura;
	}


	
	
	public int calcularIMC() {
		
		double peso = (double) (this.peso / Math.pow(altura,2));
		
		if (peso < 18.5) {
			return BAJOPESO;
		} else if (peso < 24.9) {
			return PESOIDONEO;
		}else {
			return SOBREPESO;
		}

	}

	private boolean esMayorDeEdad() {
		
		if (edad>18) {
			return true;
		}
		
		return false;
	}

	private char comprobarSexo(char sexo) {
		
		if (sexo==HOMBRE || sexo==MUJER) {
			return sexo;
		}else {
			return HOMBRE;
		}
		
	}

	private String comprobarDNI(String dni) {
		boolean valido =false;
		
		String numerosDNI= dni.substring(0,dni.length()-1);
		String letraDNI = dni.substring(dni.length()-1,dni.length());
		
		if (generarLetraDNI(numerosDNI).equals(letraDNI)) {
			valido = true;
		}

		
		if (valido==true) {
			return dni;
		}else {
			dni = numerosDNI+generarLetraDNI(numerosDNI);
			return dni;
		}
		
	
	}
	
	private String generarDNI() {
		String dni="";
		String letra = "";
		Random r = new Random();
		
		for (int i = 0; i < 8; i++) {
			
			dni += r.nextInt(10);
			
		}
		dni+="-" + generarLetraDNI(dni);
		return dni;
	}
	
	private String generarLetraDNI(String dni) {
		String letra="";
		int resto =0;
		int dniNum = Integer.valueOf(dni);
		String letras = "TRWAGMYFPDXBNJZSQVHLCKE";
		
		resto = dniNum%23;
		
		letra += letras.substring(resto,resto+1);
		
		return letra;
	}
	
	
	
	
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public char getSexo() {
		return sexo;
	}

	public void setSexo(char sexo) {
		this.sexo = sexo;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	
	
	@Override
	public String toString() {
		
		String mayor="";
		String sobrepeso ="";
		int numSobrepeso = calcularIMC();
		
		if(esMayorDeEdad()==true) {
			mayor = ", es mayor de edad";
		}else {
			mayor = ", es menor";
		}
		
		
		
		if (numSobrepeso==SOBREPESO) {
			sobrepeso = "Tiene sobrepeso";
		} else if (numSobrepeso==PESOIDONEO) {
			sobrepeso = "no tiene problemas de peso";
		}else {
			sobrepeso="esta bajo de peso";
		}
		
		return "Nombre: "+nombre+"\nEdad: "+edad+mayor+"\nSexo: "+sexo+"\nPeso: "+peso+" kg\nAltura: "+altura+" m\n"+sobrepeso;
	}
	
	
	
}
