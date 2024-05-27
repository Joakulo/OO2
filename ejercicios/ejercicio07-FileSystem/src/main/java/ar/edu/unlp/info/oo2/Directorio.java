package ar.edu.unlp.info.oo2.biblioteca;

import java.util.List;
import java.util.stream.Collectors;

public class Directorio extends File {

	private List<File> files;
	
	@Override
	public int tamanoTotalOcupado() {
		return 32 + files.stream().mapToInt(f -> f.tamanoTotalOcupado()).sum();
	}

	@Override
	public Archivo archivoMasGrande() {
		return files.stream().map(f -> f.archivoMasGrande()).max((a1, a2) -> Integer.compare(a1.tamanoTotalOcupado(), a2.tamanoTotalOcupado())).orElse(null);
	}

	@Override
	public Archivo archivoMasNuevo() {
		return files.stream().map(f -> f.archivoMasNuevo()).max((a1, a2) -> a1.getFechaDeCreacion().compareTo(a2.getFechaDeCreacion())).orElse(null);
	}

	@Override
	public File buscar(String nombre) {
		return files.stream()
						.map(f -> f.buscar(nombre))
						.filter(f -> f != null)
						.findFirst()
						.orElse(null);
	}

	@Override
	public List<File> buscarTodos(String nombre) {
		return files.stream()
				.flatMap(f -> f.buscarTodos(nombre).stream())
				.collect(Collectors.toList());
	}

	@Override
	public String listadoDeContenido() {
		return listadoDeContenido2("");
	}
	
	public String listadoDeContenido2(String pathPadre) {
		String pathActual = pathPadre + "/" + this.nombre;
		String contenido = files.stream()
									.map(f -> f.listadoDeContenido2(pathActual))
									.collect(Collectors.joining("\n"));
		return pathActual + "\n" + contenido;
	}

}
