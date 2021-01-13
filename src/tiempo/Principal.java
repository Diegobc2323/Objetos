package tiempo;

import java.util.Scanner;

import agenda.Contacto;

public class Principal {
	
	public static void main(String[] args) {
		
		Tiempo_objeto vTiempo[] = new Tiempo_objeto[10];
		
		for (int i = 0; i < vTiempo.length; i++) {
			vTiempo[i]= new Tiempo_objeto();
		}
		
		Scanner leer = new Scanner(System.in);
		String intro="";
		
		
		for (int i = 0; i < vTiempo.length; i++) {
			
			
			intro = leer.nextLine();
			vTiempo[i].setHora(Integer.valueOf(intro.substring(0,2)));
			vTiempo[i].setMin(Integer.valueOf(intro.substring(3,5)));
		
			if (vTiempo[i].getHora()==0 && vTiempo[i].getMin()==0) {
				break;
			}
			
		}
		
		for (int i = 0; i < vTiempo.length; i++) {
			if (vTiempo[i]!=null && (vTiempo[i].getHora()!=0 || vTiempo[i].getMin()!=0) && (vTiempo[i].getHora()!=-99 || vTiempo[i].getMin()!=-99)) {
			
				System.out.println(vTiempo[i].toString());
				
			}
		}
		
	}
}
