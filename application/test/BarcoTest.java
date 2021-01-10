package test;

import static org.junit.Assert.*;

import org.junit.Test;

import src.Barco;
import src.Misil;
import src.ProyectilConvencional;

public class BarcoTest {

	@Test
	public void test_crear_barco() {
		Barco barco = new Barco();
		assertNotEquals(null, barco);
	}
	
	@Test
	public void test_barco_se_crea_con_uno_de_vida() {
		Barco barco = new Barco();
		assertEquals(1, barco.getVida());
	}
	
	@Test 
	public void test_disparar_barco_proyectil_convencional() {
		Barco barco = new Barco();
		ProyectilConvencional proyectil = new ProyectilConvencional();
		barco.recibirDisparo(proyectil);
		assertEquals(0, barco.getVida());
	}
	
	@Test 
	public void test_disparar_barco_proyectil_misil() {
		Barco barco = new Barco();
		Misil proyectil = new Misil();
		barco.recibirDisparo(proyectil);
		assertEquals(0, barco.getVida());
	}

}
