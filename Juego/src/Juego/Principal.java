package Juego;

import java.util.Scanner;

public class Principal {

	public static int pintaMenu(Juego vJuegos[]) {
		Scanner leer = new Scanner(System.in);
		int opcion;
		
		do{
			System.out.println("Pulsa 1 para añadir un juego");
			System.out.println("Pulsa 2 para añadir puntuacion a un juego");
			System.out.println("Pulsa 3 para añadir ver todos tus juegos y sus records");
			System.out.println("Pulsa 0 para salir");
			opcion=leer.nextInt();
			
			switch (opcion) {
			case 1:
				addJuego(vJuegos);
				break;
				
			case 2:
				addPuntuacion(vJuegos);
				break;
				
			case 3:
				verJuegos(vJuegos);
				break;
				
			case 0:
				
				break;
			default:
				System.out.println("dame una opcion de las que te he pedido");
				break;
			}
			
		}while(opcion!=0);	
			
			
		return 0;
	}
		
	
	
	public static void addJuego(Juego vJuegos[]) {
		String nombre;
		int pos=0;
		Scanner leer = new Scanner(System.in);
		
		for (int i = 0; i < vJuegos.length; i++) {
			if(vJuegos[i]==null) {
				pos=i;
				break;
			}
			
		}
		
		System.out.println("Dime el nombre del juego nuevo");
		nombre=leer.nextLine();
		vJuegos[pos]= new Juego(nombre);
		
	}
	
	public static void addPuntuacion(Juego vJuegos[]) {
		//pedir nombre y puntuacion
		Scanner leer = new Scanner(System.in);
		Scanner leerpunt = new Scanner(System.in);
		String nombre;
		int puntuacion;
		
		
		
		System.out.println("Dime el nombre del juego al que quieres añadir la puntuacion");
		nombre=leer.nextLine();
		System.out.println("Dime cual es la puntuacion que quieres añadir");
		puntuacion=leerpunt.nextInt();
		
		for (int i = 0; i < vJuegos.length; i++) {
			if (vJuegos[i]!=null && vJuegos[i].getNombre().equalsIgnoreCase(nombre)) {
				vJuegos[i].ponerRecord(puntuacion);
			}
		}
		
	}
	
	public static void verJuegos(Juego vJuegos[]){
		for (int i = 0; i < vJuegos.length; i++) {
			if (vJuegos[i]!=null) {
				System.out.println(vJuegos[i]);
			}
		}
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int puntuacion=0;
		Scanner leer = new Scanner(System.in);
		Juego vJuegos[] = new Juego[100];
		
		vJuegos[0]= new Juego("Tetris");
		vJuegos[1]= new Juego("Pacman");
		vJuegos[2]= new Juego("LOL");
		vJuegos[2].setMultijugador(true);
		
		pintaMenu(vJuegos);
			
		}
		
	}


