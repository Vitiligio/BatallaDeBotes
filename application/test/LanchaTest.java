package test;

import static org.junit.Assert.*;

import org.junit.Test;

import src.Lancha;
import src.Misil;
import src.ProyectilConvencional;

public class LanchaTest {

	@Test
	public void test_crear_lancha() {
		Lancha lancha = new Lancha();
		assertNotEquals(null, lancha);
	}
	
	@Test
	public void test_lancha_se_crea_con_dos_de_vida() {
		Lancha lancha = new Lancha();
		assertEquals(2, lancha.getVida());
	}
	
	@Test
	public void test_disparar_lancha_proyectil_convencional_no_lo_unde() {
		Lancha lancha = new Lancha();
		ProyectilConvencional proyectil = new ProyectilConvencional();
		lancha.recibirDisparo(proyectil);
		assertEquals(1, lancha.getVida());
	}
	
	@Test
	public void test_disparar_lancha_proyectil_convencional_dos_veces_unde() {
		Lancha lancha = new Lancha();
		ProyectilConvencional proyectil = new ProyectilConvencional();
		lancha.recibirDisparo(proyectil);
		lancha.recibirDisparo(proyectil);
		assertEquals(0, lancha.getVida());
	}

	@Test
	public void test_disparar_lancha_proyectil_misil_unde() {
		Lancha lancha = new Lancha();
		Misil proyectil = new Misil();
		lancha.recibirDisparo(proyectil);
		assertEquals(0, lancha.getVida());
	}
}
