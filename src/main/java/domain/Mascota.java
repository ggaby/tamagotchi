package domain;

public class Mascota {
	private int nivelContententura;
	private Estado estado;
	
	public int getNivelContententura() {
		return nivelContententura;
	}

	public void setNivelContententura(int nivelContententura) {
		this.nivelContententura = nivelContententura;
	}

	public void come(){
		this.estado.come(this);
	}
	
	public void juga(){
		this.estado.juga(this);
	}
	
	public boolean podesJugar(){
		return this.estado.podesJugar();
	}
	
	public void incrementarFelicidadEn(int unidades){
		this.nivelContententura = this.nivelContententura + unidades ;
	}
	
	public void cambiarEstado(Estado estadoNuevo){
		this.estado = estadoNuevo;
	}
}
