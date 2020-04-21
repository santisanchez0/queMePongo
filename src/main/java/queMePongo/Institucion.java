package queMePongo;

import java.util.ArrayList;

public class Institucion {
	String nombre;
	Uniforme uniforme;
	ArrayList<Uniforme> sugerencias = new ArrayList<Uniforme>();
	
	void sugerencia(Uniforme unUniforme) {
		if(unUniforme.esUniformeValido()) {
			sugerencias.add(unUniforme);
		}
	}
}
