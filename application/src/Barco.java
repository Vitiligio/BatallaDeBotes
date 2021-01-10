package src;

public class Barco {

	protected int vida;
	
	public Barco() {
		this.vida = 1;
	}
	
	public void recibirDisparo(Proyectil proyectil) {
		proyectil.daniar(this);
	}
	
	public void daniar(ProyectilConvencional proyectil) {
		this.vida -= 1;
	}
	
	public void daniar(Misil proyectil) {
		this.vida -= 1;
	}
	
	public int getVida() {
		return this.vida;
	}
	
	public boolean estaHundido() {
		return (this.vida <= 0);
	}
}
