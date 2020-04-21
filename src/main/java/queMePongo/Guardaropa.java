package queMePongo;

import java.util.ArrayList;

public class Guardaropa {
	ArrayList<Prenda> ropa = new ArrayList<Prenda>();
	Prenda ultimaCargada;
	void cargarPrenda(Prenda nuevaPrenda) {	
		if(nuevaPrenda.esValida(nuevaPrenda)) {
			ropa.add(nuevaPrenda);
		}
	}
	
	void guardarBorrador(Prenda ultimaPrenda) {
		this.ultimaCargada = ultimaPrenda; 
	}
}
