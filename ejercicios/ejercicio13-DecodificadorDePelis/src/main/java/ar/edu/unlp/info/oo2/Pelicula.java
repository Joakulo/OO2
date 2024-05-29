package ar.edu.unlp.info.oo2;

import java.util.ArrayList;
import java.util.List;

public class Pelicula {

	private String titulo;
	private int añoEstreno;
	private double puntaje;
	private List<Pelicula> similares;
	
	public Pelicula(String titulo, double puntaje, int estreno) {
		this.titulo = titulo;
		this.añoEstreno = estreno;
		this.similares = new ArrayList<>();
		this.puntaje = puntaje;
	}
	
	public Pelicula(String titulo, int estreno, List<Pelicula> similares, double puntaje) {
		this.titulo = titulo;
		this.añoEstreno = estreno;
		this.similares = similares;
		this.puntaje = puntaje;
	}

	public int getAñoEstreno() {
		return añoEstreno;
	}

	public List<Pelicula> getSimilares() {
		return similares;
	}

	public double getPuntaje() {
		return puntaje;
	}
	
	public String getTitulo() {
		return this.titulo;
	}
	
	public void agregarSimilar(Pelicula pelicula) {
		if (!this.similares.contains(pelicula)) {
			this.similares.add(pelicula);
			pelicula.agregarSimilar(this);
		}
	}
	
	@Override
	public String toString() {
		return this.titulo;
	}

}
