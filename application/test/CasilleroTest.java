package test;

import static org.junit.Assert.*;

import org.junit.Test;

import excepciones.YaEstaVacioExcepcion;
import src.Barco;
import src.BoteARemo;
import src.Casillero;
import src.Lancha;
import src.Misil;
import src.ProyectilConvencional;
import src.Yate;

public class CasilleroTest {

	@Test
	public void test_crear_un_casillero() {
		Casillero casillero = new Casillero();
		assertNotEquals(null, casillero);
	}
	
	@Test 
	public void test_crear_un_casillero_inicializado_vacio() {
		Casillero casillero = new Casillero();
		assertEquals(false, casillero.estaOcupado());
	}
	
	@Test
	public void test_ocupar_un_casillero_vacio() {
		Casillero casillero = new Casillero();
		Barco barco = new Barco();
		casillero.ocupar(barco);
		assertEquals(true, casillero.estaOcupado());
	}
	
	@Test
	public void test_vaciar_un_casillero_ocupado() {
		Casillero casillero = new Casillero();
		Barco barco = new Barco();
		casillero.ocupar(barco);
		casillero.vaciar();
		assertEquals(false, casillero.estaOcupado());
	}
	
	@Test
	public void test_vaciar_un_casillero_despues_de_hundir_barco() {
		Casillero casillero = new Casillero();
		Barco barco = new Barco();
		casillero.ocupar(barco);
		
		ProyectilConvencional proyectil = new ProyectilConvencional();
		casillero.atacarBarco(proyectil);
		
		assertEquals(false, casillero.estaOcupado());
	}
	
	@Test
	public void test_vaciar_un_casillero_despues_de_hundir_barco_con_misil() {
		Casillero casillero = new Casillero();
		Barco barco = new Barco();
		casillero.ocupar(barco);
		
		Misil proyectil = new Misil();
		casillero.atacarBarco(proyectil);
		
		assertEquals(false, casillero.estaOcupado());
	}
	
	@Test
	public void test_ocupar_casillero_con_yate() {
		Casillero casillero = new Casillero();
		Yate barco = new Yate();
		casillero.ocupar(barco);
				
		assertEquals(true, casillero.estaOcupado());
	}
	
	@Test
	public void test_ocupar_casillero_con_bote_a_remo() {
		Casillero casillero = new Casillero();
		BoteARemo barco = new BoteARemo();
		casillero.ocupar(barco);
				
		assertEquals(true, casillero.estaOcupado());
	}
	
	@Test
	public void test_ocupar_casillero_con_lancha() {
		Casillero casillero = new Casillero();
		Lancha barco = new Lancha();
		casillero.ocupar(barco);
				
		assertEquals(true, casillero.estaOcupado());
	}

	@Test
	public void test_vaciar_un_casillero_despues_de_hundir_yate_con_misil() {
		Casillero casillero = new Casillero();
		Yate barco = new Yate();
		casillero.ocupar(barco);
		
		Misil proyectil = new Misil();
		casillero.atacarBarco(proyectil);
		
		assertEquals(false, casillero.estaOcupado());
	}
	
	@Test
	public void test_vaciar_un_casillero_despues_de_hundir_bote_a_remo_con_misil() {
		Casillero casillero = new Casillero();
		BoteARemo barco = new BoteARemo();
		casillero.ocupar(barco);
		
		Misil proyectil = new Misil();
		casillero.atacarBarco(proyectil);
		
		assertEquals(false, casillero.estaOcupado());
	}
	
	@Test
	public void test_vaciar_un_casillero_despues_de_hundir_lancha_con_misil() {
		Casillero casillero = new Casillero();
		Lancha barco = new Lancha();
		casillero.ocupar(barco);
		
		Misil proyectil = new Misil();
		casillero.atacarBarco(proyectil);
		
		assertEquals(false, casillero.estaOcupado());
	}
}
