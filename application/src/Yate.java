package src;

public class Yate extends Barco{

	public Yate() {
		this.vida = 1;
	}
	
	public void recibirDisparo(Proyectil proyectil) {
		proyectil.daniar(this);
	}
	
	public void daniar(ProyectilConvencional proyectil) {
		
	}
	
	public void daniar(Misil proyectil) {
		this.vida -= 1;
	}
}
