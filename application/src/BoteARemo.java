package src;

public class BoteARemo extends Barco {

	public BoteARemo() {
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
}
