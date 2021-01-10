package src;

import excepciones.YaEstaOcupadoExcepcion;

public class EstadoOcupado extends EstadoCasillero{

	private Barco barco;
	
	public EstadoOcupado(Barco barco) {
		this.barco = barco;
	}
	
	public boolean estaOcupado() {
		return true;
	}
	
	public EstadoCasillero ocupar(Barco barco) throws YaEstaOcupadoExcepcion{
		throw new YaEstaOcupadoExcepcion();
	}
	
	public EstadoCasillero vaciar() {
		EstadoVacio estado = new EstadoVacio();
		return estado;
	}
	
	public void atacarBarco(Proyectil proyectil) {
		this.barco.recibirDisparo(proyectil);
	}
	
	public boolean barcoHundido() {
		return this.barco.estaHundido();
	}
}
