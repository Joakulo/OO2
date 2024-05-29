package ar.edu.unlp.info.oo2;

import java.time.LocalDate;

public class File implements FileOO2{

	private String nombre;
	private String extension;
	private String tamaño;
	private LocalDate fechaCreacion;
	private LocalDate fechaModificacion;
	private String permisos;
	
	
	
	public File(String nombre, String extension, String tamaño, LocalDate fechaCreacion, LocalDate fechaModificacion, String permisos) {
		this.nombre = nombre;
		this.extension = extension;
		this.tamaño = tamaño;
		this.fechaCreacion = fechaCreacion;
		this.fechaModificacion = fechaModificacion;
		this.permisos = permisos;
	}

	@Override
	public String getNombre() {
		return this.nombre;
	}

	@Override
	public String getExtension() {
		return this.extension;
	}

	@Override
	public String getTamaño() {
		return this.tamaño;
	}

	@Override
	public LocalDate getFechaCreacion() {
		return this.fechaCreacion;
	}

	@Override
	public LocalDate getFechaModificacion() {
		return this.fechaModificacion;
	}

	@Override
	public String getPermisos() {
		return this.permisos;
	}

	@Override
	public String prettyPrint() {
		return "";
	}
	
}
