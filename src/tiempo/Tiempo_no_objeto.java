package tiempo;

import java.util.Scanner;

public class Tiempo_no_objeto {

	public static void main(String[] args) {
		
		Scanner leer = new Scanner(System.in);
		String vTiempo[] = new String[10];
		String intro ="", pasar="";
		int hora=0, min=0, tiempotot=0, dia=1440;
		int cont=0;
		
		do {
			
			intro = leer.nextLine();
			vTiempo[cont]=intro;
			
			cont++;
		} while (!intro.equals("00:00") && cont<10);
		
		for (int i = 0; i < vTiempo.length; i++) {
			if (vTiempo[i] != null) {
				pasar= vTiempo[i].substring(0,2);
				hora = Integer.valueOf(pasar);
				
				pasar= vTiempo[i].substring(3,5);
				min = Integer.valueOf(pasar);
			}
			
			tiempotot= hora*60 + min;
			
			if (vTiempo[i] != null && (hora!=0 || min!=0)) {
				
				System.out.println(dia-tiempotot);
				
			}
			
		}

	}

}
