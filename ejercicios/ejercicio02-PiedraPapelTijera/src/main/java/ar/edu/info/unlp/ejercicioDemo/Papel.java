package ar.edu.info.unlp.ejercicioDemo;

public class Papel implements Elemento {
	
	@Override
	public String didIWin1(Elemento e) {
		return e.didIWin(this);
	}
	
	public String didIWin(Piedra piedra) {
		return "Gane";
	}
	
	public String didIWin(Papel papel) {
		return "Empate";
	}
	
	public String didIWin(Tijera tijera) {
		return "Perdi";
	}
	
	public String didIWin(Spock spock) {
		return "Gane";
	}
	
	public String didIWin(Lagarto lagarto) {
		return "Perdi";
	}

}
