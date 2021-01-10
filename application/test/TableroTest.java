package test;

import static org.junit.Assert.*;

import org.junit.Test;

import src.Barco;
import src.Tablero;

public class TableroTest {
	
	@Test
	public void test_crear_un_tablero() {
		
		Tablero tablero = new Tablero(8);
		assertNotEquals(null, tablero);
	}
	
	@Test
	public void test_crear_un_tablero_con_columnas_pedidas() {
		
		Tablero tablero = new Tablero(8);
		assertEquals(8, tablero.length());
	}
	
	@Test 
	public void test_ocupar_el_primer_casillero() {
		Tablero tablero = new Tablero(8);
		Barco barco = new Barco();
		tablero.ocupar('A', 1, barco);
		assertEquals(true, tablero.estaOcupado('A', 1));
	}
	
	@Test 
	public void test_ocupar_el_ultimo_casillero() {
		Tablero tablero = new Tablero(8);
		Barco barco = new Barco();
		tablero.ocupar('H', 8, barco);
		assertEquals(true, tablero.estaOcupado('H', 8));
	}
	
	@Test 
	public void test_vaciar_el_primer_casillero() {
		Tablero tablero = new Tablero(8);
		Barco barco = new Barco();
		tablero.ocupar('A', 1, barco);
		tablero.vaciar('A', 1);
		assertEquals(false, tablero.estaOcupado('A', 1));
	}
	
	@Test 
	public void test_vaciar_el_ultimo_casillero() {
		Tablero tablero = new Tablero(8);
		Barco barco = new Barco();
		tablero.ocupar('H', 8, barco);
		tablero.vaciar('H', 8);
		assertEquals(false, tablero.estaOcupado('H', 8));
	}
	
	@Test
	public void test_ocupar_un_casillero_al_azar() {
		Tablero tablero = new Tablero(8);
		Barco barco = new Barco();
		tablero.ocuparRandom(1, barco);
		assertEquals(1, tablero.cantidadDeBotes());
	}
	
	@Test
	public void test_ocupar_ocho_casilleros_al_azar() {
		Tablero tablero = new Tablero(8);
		Barco barco = new Barco();
		tablero.ocuparRandom(8, barco);
		assertEquals(8, tablero.cantidadDeBotes());
	}
	
	@Test
	public void test_vaciar_tablero_con_ocho_botes() {
		Tablero tablero = new Tablero(8);
		Barco barco = new Barco();
		tablero.ocuparRandom(8, barco);
		tablero.vaciarTablero();
		assertEquals(0, tablero.cantidadDeBotes());
	}
}
