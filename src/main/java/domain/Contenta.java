package domain;

public class Contenta extends Estado{
	private int cantidadDeJugadas;
	
	public Contenta() {
		super();
		this.cantidadDeJugadas = 0;
	}

	public void come(Mascota unaMascota){
		unaMascota.incrementarFelicidadEn(1);
	}
	
	@Override
	public void juga(Mascota unaMascota){
		unaMascota.incrementarFelicidadEn(2);
		incrementarCantidadDeJugadasEn(1);
		cambiarDeEstadoSiEsNecesarioA(unaMascota);
	}
	
	private void cambiarDeEstadoSiEsNecesarioA(Mascota unaMascota) {
		if(jugasteMasDe(5)) {
			unaMascota.cambiarEstado(new Hambrienta());
		}
	}
	
	private boolean jugasteMasDe(int veces) {
		return (this.cantidadDeJugadas>veces);
	}
	
	private void incrementarCantidadDeJugadasEn(int unidades) {
		this.cantidadDeJugadas += unidades;
	}
}
