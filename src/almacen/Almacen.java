package almacen;

import java.util.Arrays;

public class Almacen {

	Bebida mEstanteria[][];
	
	public void introValores() {
		mEstanteria[0][0] = new Azucarada("123", 12, 28, "cola loca", 80, true);
		mEstanteria[0][1] = new Azucarada("234", 11, 40, "fanta", 60, true);
		mEstanteria[0][2] = new Azucarada("345", 22, 28, "red bull", 20, true);
		mEstanteria[1][1] = new Agua("456", 5, 20, "Font bella", "Españita");
		mEstanteria[1][8] = new Agua("567", 50, 12, "eau de yo que se", "francia");
	}

	
	public Almacen() {
		super();
		this.mEstanteria = new Bebida[10][10];
	}
	

	public Bebida[][] getmEstanteria() {
		return mEstanteria;
	}
	public void setmEstanteria(Bebida[][] mEstanteria) {
		this.mEstanteria = mEstanteria;
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
