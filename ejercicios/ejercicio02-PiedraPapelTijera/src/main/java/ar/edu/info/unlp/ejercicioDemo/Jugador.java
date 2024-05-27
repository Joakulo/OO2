package ar.edu.info.unlp.ejercicioDemo;

public class Jugador {

	private Elemento elemento;
	
	public Jugador(Elemento elem) {
		this.elemento = elem;
	}
	
	public void cambiarOpcion(Elemento elem) {
		this.elemento = elem;
	}
	
	public String jugarContra(Jugador p2) {
		return p2.didIWin(elemento);
	}
	
	public String didIWin(Elemento elem) {
		return this.elemento.didIWin1(elem);
	}
}