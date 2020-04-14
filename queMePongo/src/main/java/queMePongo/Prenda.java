package queMePongo;

enum Color {
	AZUL,
	ROJO,
	AMARILLO,
	NEGRO,
	BLANCO,
	VERDE,
	NINGUNO; 
}

enum Material {
	CUERO,
	TELA,
	NINGUNO;
}

enum Categoria{
	PARTE_SUPERIOR,
	PARTE_INFERIOR,
	ACCESORIO,
	CALZADO,
	NINGUNO;
}
enum Tipo{//no puede existir un tipo de prenda sin su correcta categoria
	PANTALON(Categoria.PARTE_INFERIOR),
	REMERA(Categoria.PARTE_SUPERIOR),
	CAMISA(Categoria.PARTE_SUPERIOR),
	ANTEOJOS(Categoria.ACCESORIO),
	PANUELO(Categoria.ACCESORIO),
	NINGUNO(Categoria.NINGUNO);
	
	Tipo(Categoria categoria) {
		this.categoria = categoria;
	}
	
	private Categoria categoria;

	public Categoria categoria() {
		return this.categoria;
	}
}

//new Prenda zapatillasNike = Prenda(ZAPATILLA, CUERO, NEGRO, BLANCO)

public class Prenda {
	Tipo tipoPrenda;
	Material materialPrenda;
	Color colorPrincipal;
	
	public Prenda(Tipo tipoPrenda, Material materialPrenda, Color colorPrincipal){
		this.tipoPrenda = tipoPrenda;			
		this.materialPrenda = materialPrenda;
		this.colorPrincipal = colorPrincipal;
	}
	
	Categoria categoria() {
		return this.tipoPrenda.categoria();
	}
}
