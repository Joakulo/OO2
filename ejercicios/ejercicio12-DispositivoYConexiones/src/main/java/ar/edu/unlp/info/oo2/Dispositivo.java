package ar.edu.unlp.info.oo2.biblioteca;

public class Dispositivo {

	private Display display;
	private Ringer ringer;
	private CRC_Calculator crcCalculator;
	private Connection connection;
	
	public Dispositivo() {
		this.connection = new Adapter4G();
		this.crcCalculator = new CRC16_Calculator();
		this.display = new Display();
		this.ringer = new Ringer();
	}
	
	public String send(String data) {
		return this.connection.sendData(data, this.crcCalculator.crcFor(data));
	}
	
	public boolean changeCalculator(CRC_Calculator crcCalculator) {
		this.crcCalculator = crcCalculator;
		return true;
	}
	
	public String changeConnection(Connection connection) {
		this.connection = connection;
		this.display.showBanner(this.connection.pict());
		this.ringer.ring();
		return "Connection changed";
	}
}
