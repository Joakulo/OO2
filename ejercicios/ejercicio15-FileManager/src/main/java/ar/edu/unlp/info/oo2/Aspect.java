package ar.edu.unlp.info.oo2;

import java.time.LocalDate;

public abstract class Aspect implements FileOO2{

	private FileOO2 componente;
	
	@Override
	public String getNombre() {
		return this.componente.getNombre();
	}

	@Override
	public String getExtension() {
		return this.componente.getExtension();
	}

	@Override
	public String getTamaño() {
		return this.componente.getTamaño();
	}

	@Override
	public LocalDate getFechaCreacion() {
		return this.componente.getFechaCreacion();
	}

	@Override
	public LocalDate getFechaModificacion() {
		return this.componente.getFechaModificacion();
	}

	@Override
	public String getPermisos() {
		return this.componente.getPermisos();
	}
	
	@Override
	public String prettyPrint() {
		return this.componente.prettyPrint() + " ";
	}

}
