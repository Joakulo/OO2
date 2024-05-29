package ar.edu.unlp.info.oo2;

import java.util.ArrayList;
import java.util.List;

public class Decodificador {

	private List<Pelicula> grilla;
	private List<Pelicula> reproducidas;
	private Sugerencia metodo;
	
	public Decodificador() {
		this.grilla = new ArrayList<>();
		this.reproducidas = new ArrayList<>();
		this.metodo = new SugerenciaNovedad();
	}
	
	public Decodificador(Sugerencia metodo) {
		this.grilla = new ArrayList<>();
		this.reproducidas = new ArrayList<>();
		this.metodo = metodo;
	}
	
	
	
	public List<Pelicula> getGrilla() {
		return grilla;
	}

	public List<Pelicula> getReproducidas() {
		return reproducidas;
	}

	public void cambiarMetodoSugerencia(Sugerencia nuevoMetodo) {
		this.metodo = nuevoMetodo;
	}
	
	public void agregarPelicula(Pelicula pelicula) {
		this.grilla.add(pelicula);
	}
	
	public void registrarPeliculaReproducida(Pelicula pelicula) {
		this.reproducidas.add(pelicula);
	}
	
	public List<Pelicula> recomendarPeliculas(){
		return metodo.recomendarPeliculas(this);
	}
}
