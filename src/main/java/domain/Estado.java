package domain;

public abstract class Estado {
	public abstract void come(Mascota unaMascota);
	
	public  void juga(Mascota unaMascota) {}
	
	public  boolean podesJugar(){
		return true;
	}
}
