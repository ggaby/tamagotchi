package domain;
import java.time.*;

public class Aburrida extends Estado{
	private LocalTime horaInicioAburrimiento;
	
	public Aburrida(){
		super();
		this.horaInicioAburrimiento = LocalTime.now();
	}

	public void come(Mascota unaMascota){
		if(haceMuchoEstaAburrida()){
			unaMascota.cambiarEstado(new Contenta());
		}
	}
	
	private boolean haceMuchoEstaAburrida(){
		LocalTime ahora = LocalTime.now();
		long diferencia = Duration.between(horaInicioAburrimiento, ahora).toMinutes();
		return (diferencia>80);
	}
	
	public void juga(Mascota unaMascota){
		unaMascota.cambiarEstado(new Contenta());
	}
}
