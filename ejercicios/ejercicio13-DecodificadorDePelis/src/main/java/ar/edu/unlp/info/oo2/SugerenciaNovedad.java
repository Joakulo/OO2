package ar.edu.unlp.info.oo2;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class SugerenciaNovedad implements Sugerencia {

	@Override
	public List<Pelicula> recomendarPeliculas(Decodificador decodificador) {
		//Me quedo con las que no fueron reproducidas todavia
        List<Pelicula> pendientes = new ArrayList<>(decodificador.getGrilla());
        pendientes.removeAll(decodificador.getReproducidas());
        
		return pendientes.stream()
				.sorted((p1, p2) -> 
					Integer.compare(p2.getAñoEstreno(), p1.getAñoEstreno()))
				.limit(3)
				.collect(Collectors.toList());
	}

}
