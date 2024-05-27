package ar.edu.info.unlp.ejercicioDemo;

public class Piedra implements Elemento{
	
	@Override
	public String didIWin1(Elemento e) {
		return e.didIWin(this);
	}
	
	public String didIWin(Piedra piedra) {
		return "Empate";
	}
	
	public String didIWin(Papel papel) {
		return "Perdi";
	}
	
	public String didIWin(Tijera tijera) {
		return "Gane";
	}
	
	public String didIWin(Spock spock) {
		return "Perdi";
	}
	
	public String didIWin(Lagarto lagarto) {
		return "Gane";
	}
}
