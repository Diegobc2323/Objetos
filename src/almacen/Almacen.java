package almacen;

import java.util.Arrays;

public class Almacen {

	Bebida mEstanteria[][];
	
	public Almacen() {
		super();
		this.mEstanteria = new Bebida[10][10];
	}
	public void introValores() {
		mEstanteria[0][0] = new Azucarada("123", 12, 28, "cola loca", 80, true);
		mEstanteria[0][1] = new Azucarada("234", 11, 40, "fanta", 60, true);
		mEstanteria[0][2] = new Azucarada("345", 22, 28, "red bull", 20, true);
		mEstanteria[1][1] = new Agua("456", 5, 20, "Font bella", "Españita");
		mEstanteria[1][8] = new Agua("567", 50, 12, "eau de yo que se", "francia");
	}

	
	public Bebida[][] getmEstanteria() {
		return mEstanteria;
	}
	public void setmEstanteria(Bebida[][] mEstanteria) {
		this.mEstanteria = mEstanteria;
	}


	public double calcularBebidas() {
		double precioTotal=0;
		
		for (int i = 0; i < mEstanteria.length; i++) {
			for (int j = 0; j < mEstanteria.length; j++) {
				if (mEstanteria[i][j]!=null) {
					precioTotal += mEstanteria[i][j].getPrecio();
				}
			}
		}
		
		
		
		return precioTotal;
	}
	
	public double calcularMarca() {
		double precioTotal=0;
		
		for (int i = 0; i < mEstanteria.length; i++) {
			for (int j = 0; j < mEstanteria.length; j++) {
				if (mEstanteria[i][j]!=null && mEstanteria[i][j].getMarca().equalsIgnoreCase("cola loca")) {
					precioTotal += mEstanteria[i][j].getPrecio();
				}
			}
		}
		
		
		
		return precioTotal;
	}

	public double calcularEstanteria() {
		double precioTotal=0;
		
		for (int i = 0; i < mEstanteria.length; i++) {
			for (int j = 0; j < mEstanteria.length; j++) {
				if (mEstanteria[i][j]!=null && i==1) {
					precioTotal += mEstanteria[i][j].getPrecio();
				}
			}
		}
		
		
		
		return precioTotal;
	}

	public void addProducto() {
		
		Azucarada a = new Azucarada("951", 9, 9, "cola loca", 9, false);
		String cod=a.getId();
		boolean esta = false, para=false;
		
		
		for (int i = 0; i < mEstanteria.length; i++) {
			for (int j = 0; j < mEstanteria.length; j++) {
				if (mEstanteria[i][j]!=null && mEstanteria[i][j].getId().equalsIgnoreCase(cod)) {
					esta=true;
					System.out.println("Tu producto ya esta en stock");
					break;
				}
			}
		}
		
		if (esta==false) {
			for (int i = 0; i < mEstanteria.length; i++) {
				for (int j = 0; j < mEstanteria.length; j++) {
					if (mEstanteria[i][j]==null) {
						mEstanteria[i][j]=a;
						System.out.println("Producto añadido");
						para=true;
						break;
					}
				}
				if (para==true) {
					break;
				}
			}
		}
		
	}
	
	
	@Override
	public String toString() {
		
		String info= "";
		
		for (int i = 0; i < mEstanteria.length; i++) {
			for (int j = 0; j < mEstanteria.length; j++) {
				if (mEstanteria[i][j]!=null) {
					info += mEstanteria[i][j].toString();
				}
			}
		}
		
		return "Esto es lo que hay en el almacen \n"+info+"\n";
		
	}
}
