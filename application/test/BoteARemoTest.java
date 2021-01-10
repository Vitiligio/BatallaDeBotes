package test;

import static org.junit.Assert.*;

import org.junit.Test;

import src.BoteARemo;
import src.Misil;
import src.ProyectilConvencional;

public class BoteARemoTest {

	@Test
	public void test_crear_bote_a_remo() {
		BoteARemo bote = new BoteARemo();
		assertNotEquals(null, bote);
	}
	
	@Test
	public void test_crear_bote_a_remo_inicializado() {
		BoteARemo bote = new BoteARemo();
		assertEquals(1, bote.getVida());
	}

	@Test
	public void test_disparar_convencionalmente_bote_a_remo() {
		BoteARemo bote = new BoteARemo();
		ProyectilConvencional proyectil = new ProyectilConvencional();
		bote.recibirDisparo(proyectil);
		assertEquals(0, bote.getVida());
	}
	
	@Test
	public void test_disparar_misil_bote_a_remo() {
		BoteARemo bote = new BoteARemo();
		Misil proyectil = new Misil();
		bote.recibirDisparo(proyectil);
		assertEquals(0, bote.getVida());
	}

}
