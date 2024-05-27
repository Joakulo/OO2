package ar.edu.info.unlp.ejercicioDemo;

public class Spock implements Elemento {
	
	@Override
	public String didIWin1(Elemento e) {
		return e.didIWin(this);
	}

	public String didIWin(Piedra piedra) {
		return "Gane";
	}
	
	public String didIWin(Papel papel) {
		return "Perdi";
	}
	
	public String didIWin(Tijera tijera) {
		return "Gane";
	}
	
	public String didIWin(Lagarto lagarto) {
		return "Perdi";
	}
	
	public String didIWin(Spock spock) {
		return "Empate";
	}
}
