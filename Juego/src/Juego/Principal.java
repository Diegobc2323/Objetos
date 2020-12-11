package Juego;

import java.util.Scanner;

public class Principal {

	public static int pintaMenu() {
		
		//Guardar un nuevo juego
		//Poner puntuacion a un juego
		//ver todos los juegos (ya esta hecho)
		//devolver 0,1 o 2 (en el if es num>=0 && num<=2)
		return 0;
	}
	
	public static void verJuegos(Juego vJuegos[]){
		for (int i = 0; i < vJuegos.length; i++) {
			if (vJuegos[i]!=null && vJuegos[i].isMultijugador()==true) {
				System.out.println(vJuegos[i]);
			}
	}
	}
	
	public static void addJuego(Juego vJuegos[]) {
		
		
	}
	
	public static void addPuntuacion(Juego vJuegos[]) {
		//pedir nombre y puntuacion
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
		
		verJuegos();
			
			
		}
		
	}

}
