package ar.edu.unlp.info.oo2.biblioteca;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class DispositivoTest {
	private Dispositivo dispositivo;

	@BeforeEach
	public void setUp() throws Exception {
		this.dispositivo = new Dispositivo();
		
	}

	@Test
	public void testSend() {
		assertEquals("Si",this.dispositivo.send("Datos"));
	}
	
	@Test
	public void testConectarCon() {
		assertEquals("Connection changed", this.dispositivo.changeConnection(new WifiConn()));
		assertEquals("Connection changed", this.dispositivo.changeConnection(new Adapter4G()));
		
	}
	
	@Test
	public void testConfigurarCRC() {
		assertTrue(this.dispositivo.changeCalculator(new CRC32_Calculator()));
		assertTrue(this.dispositivo.changeCalculator(new CRC16_Calculator()));
	}

}