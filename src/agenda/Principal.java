package agenda;

import java.util.Scanner;

public class Principal {

	/**
	 * @author Diego Berenguer Celma
	 */
	
	/**
	 * 
	 * @param opc, recive la opcion para comprobar si es correcta
	 * @return devuelve la opcion despues de comprobar que sea correcta
	 */
	public static int pintaMenu(int opc){
		
		Scanner leer = new Scanner(System.in);
		
	
		do {
			
			System.out.println("Pulsa 1 para anadir un contacto");
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

	/**
	 * 
	 * @param vContacto, recive el vector
	 * @return devuelve la posicion del vector en la que no hay datos para rellenarla
	 */
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
	
	/**
	 * 
	 * @param vContacto, recive el vector
	 * @param pos, recive la posicion vacia en la que se tiene que añadir el contacto
	 */
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
	
	/**
	 * 
	 * @param vContacto, recive el vector
	 * @param bus, recive el dato que tiene que comparar con los datos del vector
	 */
	public static void buscarContacto(Contacto[] vContacto, String bus) {
		
		String nombre="", numTrans="";
		int num=-99, cont=1;
		boolean bandera=false;
		
		for (int i = 0; i < vContacto.length; i++) {
			nombre=vContacto[i].getNombre();
			num = vContacto[i].getNumero();
			numTrans= String.valueOf(num);
			
			if (vContacto[i]!=null && !nombre.equals("cambiame")) {
				for (int j = 0; j < nombre.length(); j++) {
					
					if (j+bus.length()<=nombre.length() && bus.equals(nombre.substring(j,j+bus.length()))) {
						System.out.println("Busqueda "+cont+" - "+"Nombre: "+nombre+", Numero: "+num);
						cont++;
						bandera=true;
						break;
					}
					
				}
				
				for (int j = 0; j < numTrans.length(); j++) {
					if (j+bus.length()<=numTrans.length() && bus.equals(numTrans.substring(j,j+bus.length()))) {
						System.out.println("Busqueda "+cont+" - "+"Nombre: "+nombre+", Numero: "+num);
						cont++;
						bandera=true;
						break;
					}
				}
				
			}
			
		}
		
		if (bandera==false){
			System.out.println("no hay ningun contacto que coincida con tu busqueda");
		}
		
	}
	
	/**
	 * 
	 * @param vContacto, recive el vector
	 */
	public static void deleteContacto(Contacto[] vContacto) {
		
		Scanner leernum = new Scanner(System.in);
		Scanner leertext = new Scanner(System.in);
		int pos=-99;
		
		System.out.println("Dime que contacto de estos quieres eliminar(la posicion, no su numero telefonico)");
		verContacto(vContacto);		
		pos = leernum.nextInt();
		pos--;
		
		String nombre= vContacto[pos].getNombre(), confirm="";
		int num = vContacto[pos].getNumero();
		
		if (vContacto[pos]!=null && !nombre.equals("cambiame") && num!=-99) {
			System.out.println("ï¿½Estas seguro de querer eliminar el contacto '"+nombre+"' con numero telefonico '"+num+"'?");
			System.out.println("Introduce una 's' si quieres eliminarlo o una 'n' si no quieres hacerlo");
			
			do {
				confirm = leertext.nextLine();
				confirm = confirm.toLowerCase();
				
			} while (!confirm.equals("s") && !confirm.equals("n"));
		}
		
		if (confirm.equals("s")) {
			vContacto[pos].setNombre("cambiame");
			vContacto[pos].setNumero(-99);
			System.out.println("Tu contacto ha sido eliminado");
		}else {
			System.out.println("funcion cancelada");
		}
		
		
	}
	
	/**
	 * 
	 * @param vContacto, recive el vector
	 */
	public static void editarContacto(Contacto[] vContacto) {
		Scanner leernum = new Scanner(System.in);
		Scanner leertext = new Scanner(System.in);
		int pos=-99, eleccion=-99;
		
		
		do {
			
			try {
				System.out.println("Dime que contacto de estos quieres editar(la posicion, no su numero telefonico)");
				verContacto(vContacto);		
				pos = leernum.nextInt();
				pos--;
			} catch (Exception e) {
				// TODO: handle exception
				System.out.println("Ha habido un error al introducir tu opcion, por favor vuelve a introducir el numero");
				leernum = new Scanner(System.in);
			}
			
			
			
		} while (pos<0 || pos>9);
		
		
		
		String nombre= vContacto[pos].getNombre(), confirm="";
		int num = vContacto[pos].getNumero();
		
		if (vContacto[pos]!=null && !nombre.equals("cambiame") && num!=-99) {
			System.out.println("ï¿½Estas seguro de querer editar el contacto '"+nombre+"' con numero telefonico '"+num+"'?");
			System.out.println("Introduce una 's' si es el contacto que quieres editar o una 'n' si no quieres hacerlo");
			
			do {
				confirm = leertext.nextLine();
				confirm = confirm.toLowerCase();
				
			} while (!confirm.equals("s") && !confirm.equals("n"));
		}
		
		
		if (confirm.equals("s")) {
			
			do {
				System.out.println("Si quieres cambiar solo el nombre pulsa 1");
				System.out.println("Si quieres cambiar solo el numero telefonico pulsa 2");
				System.out.println("Si quieres cambiar solo las dos cosas pulsa 3");
				
				try {
					eleccion = leernum.nextInt();
				} catch (Exception e) {
					// TODO: handle exception
					System.out.println("Ha habido un error al introducir tu opcion, por favor vuelve a introducir el numero");
					leernum = new Scanner(System.in);
				}
				
				
			} while (eleccion<1 || eleccion>3);
			
			switch (eleccion) {
			case 1:
				System.out.println("Dime cual va a ser el nuevo nombre de "+nombre);
				nombre= leertext.nextLine();
				vContacto[pos].setNombre(nombre);
				break;

			case 2:
				do {
					try {
						System.out.println("Dime cual va a ser el nuevo numero de "+nombre);
						num = leernum.nextInt();
						vContacto[pos].setNumero(num);
					} catch (Exception e) {
						// TODO: handle exception
						System.out.println("Ha habido un error al introducir tu opcion, por favor vuelve a introducir el numero");
						leernum = new Scanner(System.in);
					}
				} while (num<0);
				break;
				
			case 3:
				System.out.println("Dime cual va a ser el nuevo nombre de "+nombre);
				nombre= leertext.nextLine();
				vContacto[pos].setNombre(nombre);
				
				
				do {
					try {
						System.out.println("Dime cual va a ser el nuevo numero de "+nombre);
						num = leernum.nextInt();
						vContacto[pos].setNumero(num);
					} catch (Exception e) {
						// TODO: handle exception
						System.out.println("Ha habido un error al introducir tu opcion, por favor vuelve a introducir el numero");
						leernum = new Scanner(System.in);
					}
				} while (num<0);
				
				break;
			default:
				break;
			}
			
		}
		
	}
	
	/**
	 * 
	 * @param vContacto, recive el vector
	 */
	public static void verContacto(Contacto[] vContacto) {
		// TODO Auto-generated method stub
		
		String nombre="";
		int num=-99;
		
				
		for (int i = 0; i < vContacto.length; i++) {
			nombre=vContacto[i].getNombre();
			num = vContacto[i].getNumero();
			
			if (vContacto[i]!=null && !nombre.equals("cambiame")) {
				System.out.println("Contacto "+(i+1)+" ------------- Nombre: "+nombre+" - Numero: "+num);
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

		
		do {
			
			opc = pintaMenu(opc);
			
			switch (opc) {
			case 1:
				pos = buscarPoscicion(vContacto);
				
				addContacto(vContacto, pos);
				break;
				
			case 2:
				
				System.out.println("Dime el contacto o numero que quieres buscar");
				bus=leer.nextLine();
				buscarContacto(vContacto, bus);
				break;
				
			case 3:
				deleteContacto(vContacto);
				break;
				
			case 4:
				editarContacto(vContacto);
				break;
				
			case 5:
				verContacto(vContacto);
				break;
		
			case 6:
				System.out.println("Good bye");
				System.exit(0);
				break;

			default:
				
				break;
			}
			
			System.out.println("\n\n\n\n");
			
			
		} while (opc!=6);
		
			
		
		
	}




}
