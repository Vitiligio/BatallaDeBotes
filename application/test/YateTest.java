package test;

import static org.junit.Assert.*;

import java.util.Random;

import org.junit.Test;

import src.Misil;
import src.ProyectilConvencional;
import src.Yate;

public class YateTest {

	@Test
	public void test_crear_yate() {
		Yate barco = new Yate();
		assertNotEquals(null, barco);
	}
	
	@Test
	public void test_crear_yate_inicializado() {
		Yate barco = new Yate();
		assertEquals(1, barco.getVida());
	}
	
	@Test
	public void test_disparar_proyectil_convencional_yate() {
		
		Yate barco = new Yate();
		ProyectilConvencional proyectil = new ProyectilConvencional();
		
		Random random = new Random();
		int x = random.nextInt();
		
		for(int i = 0; i < x; i++) {
			barco.recibirDisparo(proyectil);
		}
		
		assertEquals(1, barco.getVida());
	}

	@Test
	public void test_disparar_misil_yate() {
		
		Yate barco = new Yate();
		Misil proyectil = new Misil();
		barco.recibirDisparo(proyectil);
		assertEquals(0, barco.getVida());
	}

}
