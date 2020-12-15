package Juego;

import java.util.Scanner;

public class Principal {

	public static int pintaMenu(Juego vJuegos[]) {
		Scanner leer = new Scanner(System.in);
		int opcion=-1;
		
		do{
			System.out.println("Pulsa 1 para a�adir un juego");
			System.out.println("Pulsa 2 para a�adir puntuacion a un juego");
			System.out.println("Pulsa 3 para a�adir ver todos tus juegos y sus records");
			System.out.println("Pulsa 0 para salir");
			
			
			try {
				opcion=leer.nextInt();
			} catch (Exception e) {
				System.out.println("Error al leer el dato, dame un numero entre 0 y 3 por favor");
				leer = new Scanner(System.in);
			}
			
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
			
			
			System.out.println("\n\n");
			
		}while(opcion!=0);	
			
			
		return 0;
	}
		
	
	public static void addJuego(Juego vJuegos[]) {
		//añadir puntuacion y multijugador
		
		String nombre="";
		int pos=0;
		String confirm="";
		boolean multi=false;
		Scanner leer = new Scanner(System.in);
		
		
		for (int i = 0; i < vJuegos.length; i++) {
			if(vJuegos[i]==null) {
				pos=i;
				break;
			}
			
		}
		
		System.out.println("Dime el nombre del juego nuevo");
		nombre=leer.nextLine();
		
		
		
		do {
			System.out.println("Tu juego es multijugador?, escribe 's' si lo es o 'n' en el caso de que no lo sea");
			confirm=leer.next();
			
			if (confirm.equalsIgnoreCase("s")) {
				multi=true;
			}
		
		} while (!confirm.equalsIgnoreCase("s") && !confirm.equalsIgnoreCase("n"));
		
		vJuegos[pos]= new Juego(nombre, multi);
		
	}
	
	
	public static void addPuntuacion(Juego vJuegos[]) {
			//pedir nombre y puntuacion
			Scanner leer = new Scanner(System.in);
			Scanner leerpunt = new Scanner(System.in);
			String nombre;
			boolean bandera = false;
			int puntuacion = -999999;
			int pos=-99;
			
			
			
			System.out.println("Dime el nombre del juego al que quieres a�adir la puntuacion");
			nombre=leer.nextLine();
			
			for (int i = 0; i < vJuegos.length; i++) {
				if (vJuegos[i]!=null && vJuegos[i].getNombre().equalsIgnoreCase(nombre)) {
					bandera =true;
					pos=i;
					break;
				}
			}
			
			if (bandera==true) {
				
				do {
					try {
						System.out.println("Dime cual es la puntuacion que quieres a�adir");
						puntuacion=leerpunt.nextInt();
					} catch (Exception e) {
						System.out.println("Ha habido un error al introducir la puntuacion, por favor vuelve a introducir un numero posible");
						leerpunt=new Scanner(System.in);
					}
					}while(puntuacion==-999999);
					
					vJuegos[pos].ponerRecord(puntuacion);	
				
			}else {
				System.out.println("No se ha encontrado el juego al que le querias añadir la puntuacion");
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
		
		vJuegos[0]= new Juego("Tetris",false);
		vJuegos[1]= new Juego("Pacman",false);
		vJuegos[2]= new Juego("LOL",true);
		
		pintaMenu(vJuegos);
			
		}
		
	}


