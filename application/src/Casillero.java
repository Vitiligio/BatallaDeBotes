package src;

import excepciones.YaEstaOcupadoExcepcion;
import excepciones.YaEstaVacioExcepcion;

public class Casillero {
	
	private EstadoCasillero estado;
	
	public Casillero() {
		this.estado = new EstadoVacio();
	}
	
	public boolean estaOcupado() {
		return this.estado.estaOcupado();
	}
	
	public void ocupar(Barco barco) {
		try {
			this.estado = this.estado.ocupar(barco);
		} catch(YaEstaOcupadoExcepcion e) {
			
		}
	}
	
	public void vaciar() {
		
		try{
			this.estado = this.estado.vaciar();
		} catch(YaEstaVacioExcepcion e) {
			
		}
	}
	
	public void atacarBarco(Proyectil proyectil) {
		this.estado.atacarBarco(proyectil);
		if(this.estado.barcoHundido()) {
			this.vaciar();
		}
	}
}
