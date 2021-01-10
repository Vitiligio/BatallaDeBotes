package src;

import excepciones.YaEstaOcupadoExcepcion;
import excepciones.YaEstaVacioExcepcion;

public abstract class EstadoCasillero {

	public abstract boolean estaOcupado();
	public abstract EstadoCasillero ocupar(Barco barco) throws YaEstaOcupadoExcepcion;
	public abstract EstadoCasillero vaciar() throws YaEstaVacioExcepcion;
	public abstract void atacarBarco(Proyectil proyectil);
	public abstract boolean barcoHundido();
	
}
