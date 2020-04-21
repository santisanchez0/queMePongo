package queMePongo;

public class Uniforme extends RuntimeException{
	Prenda parteSuperior;
	Prenda parteInferior;
	Prenda calzado;
	
	Uniforme(Prenda parteSuperior, Prenda parteInferior, Prenda calzado){
		if(parteSuperior.categoria() != Categoria.PARTE_SUPERIOR ){
			throw new RuntimeException("Parte superior invalida");
		}
		if(parteInferior.categoria() != Categoria.PARTE_INFERIOR ){
			throw new RuntimeException("Parte inferior invalida");
		}
		if(calzado.categoria() != Categoria.PARTE_SUPERIOR ){
			throw new RuntimeException("Calzado invalido");
		}
		
		this.parteSuperior = parteSuperior;
		this.parteInferior = parteInferior;
		this.parteSuperior = calzado;
	}

	boolean esUniformeValido() { //este metodo se usa cuando recibimos sugerencias en la clase Institucion
		return (this.parteSuperior.categoria() == Categoria.PARTE_SUPERIOR 
				&& this.parteInferior.categoria() == Categoria.PARTE_INFERIOR 
				&& this.calzado.categoria() == Categoria.CALZADO);
	}
}
