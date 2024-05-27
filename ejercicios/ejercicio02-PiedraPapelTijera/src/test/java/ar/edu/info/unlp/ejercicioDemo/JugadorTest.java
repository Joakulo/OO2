package ar.edu.info.unlp.ejercicioDemo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class JugadorTest {

	Jugador piedra, papel;
	
	@BeforeEach
	void setUp() {
		piedra = new Jugador(new Piedra());
		papel = new Jugador(new Papel());
	}
	
	@Test
	public void testJugarContra() {
		assertEquals("Perdi", piedra.jugarContra(papel));
		assertEquals("Gane", piedra.didIWin(new Papel()));
	}
		

	
}
