package queMePongo;

enum Material {
	CUERO,
	TELA,
	NINGUNO,
	BORRADOR;
}

enum Categoria{
	PARTE_SUPERIOR,
	PARTE_INFERIOR,
	ACCESORIO,
	CALZADO,
	NINGUNO,
	BORRADOR;
}
enum Tipo{//no puede existir un tipo de prenda sin su correcta categoria
	PANTALON(Categoria.PARTE_INFERIOR),
	REMERA(Categoria.PARTE_SUPERIOR),
	CAMISA(Categoria.PARTE_SUPERIOR),
	ANTEOJOS(Categoria.ACCESORIO),
	PANUELO(Categoria.ACCESORIO),
	NINGUNO(Categoria.NINGUNO),
	BORRADOR(Categoria.BORRADOR);
	
	Tipo(Categoria categoria) {
		this.categoria = categoria;
	}
	
	private Categoria categoria;

	public Categoria categoria() {
		return this.categoria;
	}
}


enum Trama{
	LISA, RAYADA, LUNARES, A_CUADROS,ESTAMPADO, NINGUNO,BORRADOR;
}


public class Prenda extends RuntimeException { //tira warning al agregar la clase RuntimeException
	Tipo tipoPrenda;
	Material materialPrenda;
	Trama trama;
	String colorPrincipal;
	String colorSecundario;
	
	public Prenda(Tipo tipoPrenda, Material materialPrenda, String colorPrincipal, String colorSecundario, Trama trama){
		if(tipoPrenda == Tipo.NINGUNO) {
			throw new RuntimeException("Debe indicar tipo de prenda");
		}
		if(materialPrenda == Material.NINGUNO) {
			throw new RuntimeException("Debe indicar el material de la prenda");
		}
		if(colorPrincipal == null) {
			throw new RuntimeException("Debe indicar el color de la prenda");
		}

		if(materialPrenda == Material.TELA) {
			asignarTrama(materialPrenda, trama);
		}
		
		this.tipoPrenda = tipoPrenda;			
		this.materialPrenda = materialPrenda;
		this.colorPrincipal = colorPrincipal;
		this.colorSecundario = colorSecundario;
	}
	
	private void asignarTrama(Material material, Trama trama) {
		if(trama == Trama.NINGUNO) {
			this.trama = Trama.LISA;
		}else {
			this.trama = trama;
		}
	}
	
	public Categoria categoria() {
		return this.tipoPrenda.categoria();
	}

	public boolean esValida(Prenda unaPrenda) {
		return (unaPrenda.tipoPrenda != Tipo.NINGUNO
				||unaPrenda.materialPrenda != Material.NINGUNO
				||unaPrenda.colorPrincipal != null);
	}
}
