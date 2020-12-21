package agenda;

import java.util.Scanner;

public class Principal {

	
	public static int pintaMenu(int opc){
		
		Scanner leer = new Scanner(System.in);
		
	
		do {
			
			System.out.println("Pulsa 1 para añadir un contacto");
			System.out.println("Pulsa 2 para buscar un contacto");
			System.out.println("Pulsa 3 para eliminar un contacto");
			System.out.println("Pulsa 4 para editar un contacto");
			System.out.println("Pulsa 5 para ver todos tus contacto");
			System.out.println("Pulsa 6 para salir un contacto");
			try {
				opc = leer.nextInt();
			} catch (Exception e) {
				System.out.println("Ha habido un error al introducir tu opcion, por favor vuelve a introducir el numero");
				leer=new Scanner(System.in);
			}
			
			if (opc<0 || opc>6) {
				System.out.println("\n\nEscoje una opcion de estas:");
			}
			
		} while (opc<0 || opc>6);
		
		return opc;
	}

	public static int buscarPoscicion(Contacto[] vContacto) {
		
		int pos=-99;
		String nombre= "";
		
		for (int i = 0; i < vContacto.length; i++) {
			nombre = vContacto[i].getNombre();
			
			if (nombre.equals("cambiame")) {
				pos=i;
				break;
			}
		}
		
		return pos;
	}
	
	public static void addContacto(Contacto[] vContacto, int pos) {
		Scanner leer = new Scanner(System.in);
		Scanner leernum = new Scanner(System.in);
		int num=-99;
		
		System.out.println("Dime el nombre de tu nuevo contacto");
		vContacto[pos].setNombre(leer.nextLine());
		
		System.out.println("Dime el numero de tu nuevo contacto");
		
		do {
			try {
				num=leernum.nextInt();
			} catch (Exception e) {
				System.out.println("Ha habido un error al introducir el numero, por favor vuelve a introducirlo");
				leernum=new Scanner(System.in);
			}
		} while (num==-99);

		vContacto[pos].setNumero(num);	
	}
	
	public static void buscarContacto(Contacto[] vContacto, String bus) {
		
		String nombre="", numTrans="";
		int num=-99;
		boolean bandera=false;
		
		for (int i = 0; i < vContacto.length; i++) {
			nombre=vContacto[i].getNombre();
			num = vContacto[i].getNumero();
			numTrans= String.valueOf(num);
			
			if (!nombre.equals("cambiame")) {
				for (int j = 0; j < nombre.length(); j++) {
					//Estoy aqui
				}
				
				for (int j = 0; j < numTrans.length(); j++) {
					//Estoy aqui
				}
			}
			
		}
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int opc=-99;
		int pos=-99;
		String bus = "";
		
		Scanner leer = new Scanner(System.in);
		
		
		Contacto vContacto[] = new Contacto[10];
		
		for (int i = 0; i < vContacto.length; i++) {
			vContacto[i]= new Contacto();
		}
		
		opc = pintaMenu(opc);
		
		switch (opc) {
		case 1:
			pos = buscarPoscicion(vContacto);
			
			addContacto(vContacto, pos);
			
			break;
			
		case 2:
			bus=leer.nextLine();
			buscarContacto(vContacto, bus);
			break;
			
		case 3:
			//deleteContacto(vContacto);
			break;
			
		case 4:
			//editarContacto(vContacto);
			break;
			
		case 5:
			//verContacto(vContacto);
			break;
	
		case 6:
			System.out.println("Good bye");
			System.exit(0);
			break;

		default:
			
			break;
		}		
	}



}
