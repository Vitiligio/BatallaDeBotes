package src;

public class Lancha extends Barco{
	
	public Lancha() {
		this.vida = 2;
	}
	
	public void recibirDisparo(Proyectil proyectil) {
		proyectil.daniar(this);
	}
	
	public void daniar(ProyectilConvencional proyectil) {
		this.vida -= 1;
	}
	
	public void daniar(Misil proyectil) {
		this.vida = 0;
	}
}
