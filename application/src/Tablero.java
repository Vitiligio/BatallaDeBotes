package src;

import java.util.Random;

import excepciones.LetraNoValidaExcepcion;

public class Tablero {
	
	private Casillero[][] tablero;
	
	public Tablero(int fila) {
		this.tablero = new Casillero[fila][fila];
		this.inicializarTablero();
	}
	
	private void inicializarTablero() {
		for(int i = 0; i < this.tablero.length; i++) {
			for(int j = 0; j < this.tablero.length; j++) {
				this.tablero[i][j] = new Casillero();
			}
		}
	}
	
	public void ocupar(char letra, int numero, Barco barco) {
		int letraTraducida = this.traducirLetra(letra);
		numero = this.traducirNumero(numero);
		this.ocupar(letraTraducida, numero, barco);
	}
	public void vaciar(char letra, int numero) {
		int letraTraducida = this.traducirLetra(letra);
		numero = this.traducirNumero(numero);
		this.vaciar(letraTraducida, numero);
	}
	
	public void ocupar(int letra, int numero, Barco barco) {
		this.tablero[letra][numero].ocupar(barco);
	}
	public void vaciar(int letra, int numero) {
		this.tablero[letra][numero].vaciar();
	}
	
	public boolean estaOcupado(char letra, int numero) {
		int letraTraducida = this.traducirLetra(letra);
		numero = this.traducirNumero(numero);
		return this.tablero[letraTraducida][numero].estaOcupado();
	}
	
	private int traducirLetra(char letra) throws LetraNoValidaExcepcion {
		switch(letra) {
			case 'A':
				return 0;
			case 'B':
				return 1;
			case 'C':
				return 2;
			case 'D':
				return 3;
			case 'E':
				return 4;
			case 'F':
				return 5;
			case 'G':
				return 6;
			case 'H':
				return 7;
			default:
				throw new LetraNoValidaExcepcion();
		}
	}
	private int traducirNumero(int numero) {
		return (numero - 1);
	}
	
	public void ocuparRandom(int repeticiones, Barco barco) {
		while(this.cantidadDeBotes() < repeticiones) {
			int letra = this.generarNumeroRandom();
			int numero = this.generarNumeroRandom();
			this.ocupar(letra, numero, barco);
				
		}
	}
	public int generarNumeroRandom() {
		Random random = new Random();
		return random.nextInt(8);
	}
	
	public int cantidadDeBotes() {
		int contador = 0;
		for(int i = 0; i < this.tablero.length; i++) {
			for(int j = 0; j < this.tablero.length; j++) {
				if(this.tablero[i][j].estaOcupado()) {
					contador++;
				}
			}
		}
		return contador;
	}
	
	public int length() {
		return this.tablero.length;
	}
	
	public void vaciarTablero() {
		for(int i = 0; i < this.tablero.length; i++) {
			for(int j = 0; j < this.tablero.length; j++) {
				this.vaciar(i, j);
			}
		}
	}
	
	public void atacarBarco(char letra, int numero, Proyectil proyectil) {
		int letraTraducida = this.traducirLetra(letra);
		numero = this.traducirNumero(numero);
		this.tablero[letraTraducida][numero].atacarBarco(proyectil);
	}
}
