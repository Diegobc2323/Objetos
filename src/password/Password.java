package password;

import java.util.Random;

public class Password {

	private int longitud=8;
	private String contrasena="";
	
	
	
	
	public Password() {
		this.longitud=longitud;
		this.contrasena=contrasena;
	}
	
	public Password(int longitud) {
		this.longitud = longitud;
		this.contrasena = generarPassword(longitud);
	}
	
	public static boolean esFuerte(String contrasena){
		
		String letras="qwertyuiopasdfghjklñzxcvbnm";
		String nums="0123456789";
		int contMinus = 2;
		int contMayus = 3;
		int contNum = 6;
		
		for (int i = 0; i < contrasena.length(); i++) {
			
			for (int j = 0; j < letras.length(); j++) {
				
				if (contrasena.substring(i,i+1).equals(letras.substring(j,j+1))) {
					contMinus--;
				}
				
				if (contrasena.substring(i,i+1).equals(letras.substring(j,j+1).toUpperCase())) {
					contMayus--;
				}
			}
			
			for (int j = 0; j < nums.length(); j++) {
				if (contrasena.substring(i,i+1).equals(nums.substring(j,j+1))) {
					contNum--;
				}
			}
			
		}
		
		if (contMinus<=0 && contMayus<=0 && contNum<=0) {
			return true;
		}
		
		return false;
	}
	
	public static String generarPassword(int longitud) {
		Random r = new Random();
		int opc =-1;
		String contrasena = "";
		
		for (int i = 0; i < longitud; i++) {
			
			opc = r.nextInt(2);
			
			switch (opc) {
			case 0:
				contrasena+=darLetra();
				break;
				
			case 1:
				contrasena+=darNum();
				break;
			default:
				System.out.println("error");
				break;
			}
			
		}
		
		
		return contrasena;
	}

	private static String darLetra() {
		// TODO Auto-generated method stub
		String cadena="qwertyuiopasdfghjklñzxcvbnm";
		int letra=-99;
		Random r = new Random();
		int mayus= r.nextInt(2);
		
		letra= r.nextInt(cadena.length());
		
		
		if (mayus==0) {
			return cadena.substring(letra,letra+1);
		}else {
			return cadena.substring(letra,letra+1).toUpperCase();
		}
		
	}
	
	private static String darNum() {
		// TODO Auto-generated method stub
		String num="0123456789";
		int pos=-99;
		Random r = new Random();
		
		pos= r.nextInt(num.length());
		
		return num.substring(pos,pos+1);
	}

	
	public int getLongitud() {
		return longitud;
	}

	public void setLongitud(int longitud) {
		this.longitud = longitud;
	}

	public String getContrasena() {
		return contrasena;
	}

	
}
