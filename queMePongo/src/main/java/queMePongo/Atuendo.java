package queMePongo;

public class Atuendo {
	Prenda parteSuperior;
	Prenda parteInferior;
	Prenda accesorio;
	Prenda calzado;
	
	void setParteSuperior(Prenda prenda){
		if(prenda.categoria() == Categoria.PARTE_SUPERIOR ){
			parteSuperior = prenda;
		}
	}
	void setParteInferior(Prenda prenda) {
		if(prenda.categoria() == Categoria.PARTE_INFERIOR ){
			parteInferior = prenda;
		}
	}
	
	void setAccesorio(Prenda prenda) {
		if(prenda.categoria() == Categoria.ACCESORIO){
			accesorio = prenda;
		}
	}
	
	void setCalzado(Prenda prenda) {
		if(prenda.categoria() == Categoria.CALZADO) {
			calzado = prenda;
		}
	}
}
