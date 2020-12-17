package practicaObjetos;

public class Principal {

	public static void main(String[] args) {
		
		String nombre="paco";
		String DNI="73152635p";
		int edad=99;
		char sexo ='M';
		double peso=60;
		double altura=60;
		
		
		
		Persona p = new Persona(nombre, DNI, edad, sexo, peso, altura);
		Persona p2 = new Persona(nombre, edad, sexo);
		Persona p3 = new Persona();
		
	
		
		System.out.println(p);
		System.out.println();
		
		System.out.println(p2);
		System.out.println();
		
		System.out.println(p3);
		
	}

}
