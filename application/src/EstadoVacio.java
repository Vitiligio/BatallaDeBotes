package src;

import excepciones.YaEstaOcupadoExcepcion;
import excepciones.YaEstaVacioExcepcion;

public class EstadoVacio extends EstadoCasillero {

	public boolean estaOcupado() {
		return false;
	}
	
	public EstadoCasillero ocupar(Barco barco) {
		EstadoOcupado estado = new EstadoOcupado(barco);
		return estado;
	}
	
	public EstadoCasillero vaciar() throws YaEstaVacioExcepcion{
		throw new YaEstaVacioExcepcion();
	}
	
	public void atacarBarco(Proyectil proyectil) {
		
	}
	
	public boolean barcoHundido() {
		return false;
	}
}
