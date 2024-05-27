package ar.edu.unlp.info.oo2.biblioteca;

import java.time.LocalDate;
import java.util.List;

public abstract class File {
	
	protected String nombre;
	protected LocalDate creacion;
	
	public abstract int tamanoTotalOcupado();
	public abstract Archivo archivoMasGrande();
	public abstract Archivo archivoMasNuevo();
	public abstract File buscar(String nombre);
	public abstract List<File> buscarTodos(String nombre);
	public abstract String listadoDeContenido();
	public abstract String listadoDeContenido2(String pathPadre);
}
