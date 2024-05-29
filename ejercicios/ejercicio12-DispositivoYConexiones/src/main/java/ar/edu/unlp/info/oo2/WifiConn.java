package ar.edu.unlp.info.oo2.biblioteca;

public class WifiConn implements Connection {

	private String pict;
	
	public WifiConn() {
		this.pict = "WiFi";
	}
	@Override
	public String sendData(String data, long crc) {
		return "Si";
	}

	@Override
	public String pict() {
		return this.pict;
	}

}
