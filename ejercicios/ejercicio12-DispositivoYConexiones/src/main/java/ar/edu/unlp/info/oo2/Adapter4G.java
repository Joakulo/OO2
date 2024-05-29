package ar.edu.unlp.info.oo2.biblioteca;

public class Adapter4G implements Connection {

	private Connection4G adaptee;
	
	public Adapter4G() {
		this.adaptee = new Connection4G();
	}
	
	@Override
	public String sendData(String data, long crc) {
		return this.adaptee.transmit(data, crc);
	}

	@Override
	public String pict() {
		return this.adaptee.symb();
	}

}
