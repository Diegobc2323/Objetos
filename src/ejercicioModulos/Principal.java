package ejercicioModulos;

import java.util.Scanner;

public class Principal {
	
	public static int pintaMenu() {
		Scanner leer = new Scanner(System.in);
		int opc = 0;

		do {
			System.out.println("Menu Gestion Curso");
			System.out.println("1- Anadir un nuevo modulo");
			System.out.println("2- Ver todos los modulos");
			System.out.println("3- Ver horas del curso");
			System.out.println("4- Eliminar un modulo");
			System.out.println("5- Salir");
			try {
				opc = leer.nextInt();
			}catch (Exception e) {
				opc = 0;
				leer = new Scanner(System.in);
				System.out.println("No puedese escribir ese dato");
			}
			
		} while (opc < 1 || opc > 5);
		
		return opc;
	}

	
	
	public static void main(String[] args) {

		int opc = 0;
		
		Curso c = new Curso("1º DAW", "Jose Micolau");
		

		
		do {
			opc = pintaMenu();
			
			switch (opc) {
			case 1:
				c.addModulo();
				break;
			case 2:
				System.out.println(c.toString());
				break;
			case 3:
				System.out.println("El total de horas lectivas del curso es de "+c.horasYear()+" horas");
				break;
			case 4:
				c.eliminarModulo();
				break;
			case 5:
				System.out.println("Bye");
				System.exit(0);
				break;
			}
		} while (opc!=5);
	}
}


