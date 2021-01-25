package almacen;

public final class Agua extends Bebida{

	private String origen;

	public Agua(String id, double litros, double precio, String marca, String origen) {
		super(id, litros, precio, marca);
		this.origen = origen;
	}

	public String getOrigen() {
		return origen;
	}
	public void setOrigen(String origen) {
		this.origen = origen;
	}

	
	
	@Override
	public String toString() {
		return super.toString() + "\n	-este agua proviene de " + origen+"\n";
	}
}
