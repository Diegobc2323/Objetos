package password;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leer = new Scanner(System.in);
		
		int tam = -99;
		int longitud=99;
		
		System.out.println("Dime cuantas contraseņas quieres guardar");
		tam=leer.nextInt();
		System.out.println("Dime la longitud de tus contraseņas");
		longitud=leer.nextInt();
		
		System.out.println();
		
		Password vPassword[]= new Password[tam];
		
		for (int i = 0; i < vPassword.length; i++) {
			
			vPassword[i] = new Password(longitud);
			
			String contrasena=vPassword[i].getContrasena();
			
			System.out.println("Contraseņa "+(i+1)+" "+contrasena+"---------"+vPassword[i].esFuerte(contrasena)+"\n");
			
		}
			
	}

}
