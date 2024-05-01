package ar.edu.utn.frba.dds.queMePongo;

public class UniformeInstitutoJhonson implements UniformeFactory {
  public Prenda fabricarParteSuperior() {
    Borrador borrador = new Borrador(TipoPrenda.CAMISA);
    borrador.especificarColorPrimario(new Color(255, 255, 255));
    borrador.especificarMaterial(Material.TELA);
    borrador.especificarTrama(Trama.LISA);
    return borrador.crearPrenda();
  }

  public Prenda fabricarParteInferior() {
    Borrador borrador = new Borrador(TipoPrenda.PANTALON_DE_VESTIR);
    borrador.especificarColorPrimario(new Color(0, 0, 0));
    borrador.especificarMaterial(Material.TELA);
    borrador.especificarTrama(Trama.LISA);
    return borrador.crearPrenda();
  }

  public Prenda fabricarCalzado() {
    Borrador borrador = new Borrador(TipoPrenda.ZAPATOS);
    borrador.especificarColorPrimario(new Color(0, 0, 0));
    borrador.especificarMaterial(Material.CUERO);
    borrador.especificarTrama(Trama.LISA);
    return borrador.crearPrenda();
  }
}
