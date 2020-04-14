package queMePongo;

import java.util.ArrayList;

public class Guardaropa {
	ArrayList<Prenda> ropa = new ArrayList<Prenda>();
	void cargarPrenda(Prenda nuevaPrenda) throws ExceptionFaltaDescripcion{	
		if(nuevaPrenda.colorPrincipal == Color.NINGUNO || nuevaPrenda.tipoPrenda == Tipo.NINGUNO ||nuevaPrenda.materialPrenda == Material.NINGUNO) {
			throw new ExceptionFaltaDescripcion("debe completar los atributos obligatorios");
		} else {
			ropa.add(nuevaPrenda);
		}
	}
	
	ArrayList<Atuendo> generarAtuendos(){
		ArrayList<Atuendo> atuendos = new ArrayList<Atuendo>();
		//no pude hacer la combinatoria hacer combinatoria 
		return atuendos;
	}
}
