package ar.edu.unlp.info.oo2.biblioteca;

public class Connection4G {

	private String symb;
	
	public Connection4G() {
		this.symb = "4G";
	}
	
	public String transmit(String data, long crc) {
		return "Si";
	}
	
	public String symb() {
		return this.symb;
	}

}
