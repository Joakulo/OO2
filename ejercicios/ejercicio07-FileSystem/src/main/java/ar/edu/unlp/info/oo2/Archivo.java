package ar.edu.unlp.info.oo2.biblioteca;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Archivo extends File {

	private int tamano;
	
	public LocalDate getFechaDeCreacion() {
		return this.creacion;
	}
	
	@Override
	public int tamanoTotalOcupado() {
		return tamano;
	}

	@Override
	public Archivo archivoMasGrande() {
		return this;
	}

	@Override
	public Archivo archivoMasNuevo() {
		return this;
	}	

	@Override
	public File buscar(String nombre) {
		if (this.nombre.equals(nombre))
			return this;
		return null;
	}
	
	@Override
	public List<File> buscarTodos(String nombre) {
		List<File> result = new ArrayList<>();
		if (this.nombre.equals(nombre))
			result.add(this);
		return result;
	}

	@Override
	public String listadoDeContenido() {
		return this.nombre;
	}

	@Override
	public String listadoDeContenido2(String pathPadre) {
		return this.nombre;
	}
}
