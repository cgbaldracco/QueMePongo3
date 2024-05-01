package ar.edu.utn.frba.dds.queMePongo;

public class TipoPrenda {
  private Categoria categoria;

  public TipoPrenda(Categoria categoria) {
    this.categoria = categoria;
  }

  static TipoPrenda REMERA = new TipoPrenda(Categoria.PARTE_SUPERIOR);
  static TipoPrenda PANTALON = new TipoPrenda(Categoria.PARTE_INFERIOR);
  static TipoPrenda BUZO = new TipoPrenda(Categoria.PARTE_SUPERIOR);
  static TipoPrenda CAMPERA = new TipoPrenda(Categoria.ABRIGO);
  static TipoPrenda ZAPATOS = new TipoPrenda(Categoria.CALZADO);
  static TipoPrenda ZAPATILLAS = new TipoPrenda(Categoria.CALZADO);
  static TipoPrenda BLUSA = new TipoPrenda(Categoria.PARTE_SUPERIOR);
  static TipoPrenda SHORT = new TipoPrenda(Categoria.PARTE_INFERIOR);
  static TipoPrenda MALLA = new TipoPrenda(Categoria.PARTE_INFERIOR);
  static TipoPrenda SANDALIAS = new TipoPrenda(Categoria.CALZADO);
  static TipoPrenda AROS = new TipoPrenda(Categoria.ACCESORIO);
  static TipoPrenda CHOMBA = new TipoPrenda(Categoria.PARTE_SUPERIOR);
  static TipoPrenda CAMISA = new TipoPrenda(Categoria.PARTE_SUPERIOR);
  static TipoPrenda PANTALON_DE_VESTIR = new TipoPrenda(Categoria.CALZADO);

  public Categoria obtenerCategoria() {
    return this.categoria;
  }

}