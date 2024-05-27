package ar.edu.info.unlp.ejercicioDemo;

public class Tijera implements Elemento {
	
	@Override
	public String didIWin1(Elemento e) {
		return e.didIWin(this);
	}

	public String didIWin(Piedra piedra) {
		return "Perdi";
	}
	
	public String didIWin(Papel papel) {
		return "Gane";
	}
	
	public String didIWin(Tijera tijera) {
		return "Empate";
	}
	
	public String didIWin(Spock spock) {
		return "Perdi";
	}
	
	public String didIWin(Lagarto lagarto) {
		return "Gane";
	}
}
