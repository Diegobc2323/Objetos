package almacen;

public final class Azucarada extends Bebida{

	private double azucar;
	private boolean promocion;
	private final double desc = 0.90;
	
	
	public Azucarada(String string, double litros, double precio, String marca, double azucar, boolean promocion) {
		super(string, litros, precio, marca);
		this.azucar = azucar;
		this.promocion = promocion;
	}


	
	public double getAzucar() {
		return azucar;
	}


	public void setAzucar(double azucar) {
		this.azucar = azucar;
	}


	public boolean isPromocion() {
		return promocion;
	}


	public void setPromocion(boolean promocion) {
		this.promocion = promocion;
	}



	
	
	
	@Override
	public String toString() {
		
		String promo = "";
		if (promocion==true) {
			promo = "esta en promocion";
		}else {
			promo = "no esta en promocion";
		}
		
		return super.toString()+ "\n	-esta es una bebida azucarada con " + azucar + " de azucar y "+ promo+"\n";
	}
}
