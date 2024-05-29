package ar.edu.unlp.info.oo2;

import static org.junit.Assert.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class DecodificadorTest {
	private Decodificador decodificador;
	private Pelicula thor;
	private Pelicula capitanAmerica;
	private Pelicula ironMan;
	private Pelicula dunkirk;
	private Pelicula rocky;
	private Pelicula rambo;
	

	@BeforeEach
	void setUp() throws Exception {
		this.thor = new Pelicula("Thor", 7.9, 2007);
		this.capitanAmerica = new Pelicula("Capitan America", 7.8, 2016);
		this.ironMan = new Pelicula("Iron man", 7.9, 2010);
		this.dunkirk = new Pelicula("Dunkirk", 7.9, 2017);
		this.rocky = new Pelicula("Rocky", 8.1, 1976);
		this.rambo = new Pelicula("Rambo", 7.8, 1979);
		
		this.thor.agregarSimilar(capitanAmerica);
		this.thor.agregarSimilar(ironMan);
		this.capitanAmerica.agregarSimilar(ironMan);
		this.rocky.agregarSimilar(rambo);
		
		this.decodificador = new Decodificador();
		
		this.decodificador.agregarPelicula(thor);
		this.decodificador.agregarPelicula(capitanAmerica);
		this.decodificador.agregarPelicula(ironMan);
		this.decodificador.agregarPelicula(dunkirk);
		this.decodificador.agregarPelicula(rocky);
		this.decodificador.agregarPelicula(rambo);
		this.decodificador.registrarPeliculaReproducida(thor);
		this.decodificador.registrarPeliculaReproducida(rocky);
	}

	@Test
	void testObtenerSugerencias() {
		assertTrue(this.decodificador.recomendarPeliculas().contains(dunkirk));
		assertTrue(this.decodificador.recomendarPeliculas().contains(capitanAmerica));
		assertTrue(this.decodificador.recomendarPeliculas().contains(ironMan));
		this.decodificador.cambiarMetodoSugerencia(new SugerenciaSimilaridad());
		assertTrue(this.decodificador.recomendarPeliculas().contains(capitanAmerica));
		assertTrue(this.decodificador.recomendarPeliculas().contains(ironMan));
		assertTrue(this.decodificador.recomendarPeliculas().contains(rambo));
		this.decodificador.cambiarMetodoSugerencia(new SugerenciaPuntaje());
		assertTrue(this.decodificador.recomendarPeliculas().contains(capitanAmerica));
		assertTrue(this.decodificador.recomendarPeliculas().contains(ironMan));
		assertTrue(this.decodificador.recomendarPeliculas().contains(dunkirk));
	}

}
