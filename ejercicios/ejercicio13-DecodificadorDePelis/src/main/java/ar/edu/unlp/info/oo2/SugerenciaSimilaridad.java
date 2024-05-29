package ar.edu.unlp.info.oo2;

import java.util.ArrayList;
import java.util.List;

public class SugerenciaSimilaridad implements Sugerencia {

	@Override
	public List<Pelicula> recomendarPeliculas(Decodificador decodificador) {
		//Me quedo con las que no fueron reproducidas todavia
        List<Pelicula> similaresPendientes = new ArrayList<>(decodificador.getReproducidas().stream()
        		.flatMap(p -> p.getSimilares().stream().distinct())
        		.toList());
        similaresPendientes.removeAll(decodificador.getReproducidas());
        
		return similaresPendientes.stream()
				.sorted((p1, p2) -> Integer.compare(p2.getAñoEstreno(), p1.getAñoEstreno()))
				.toList();
	}

}
