package ar.edu.utn.frba.dds.queMePongo;

public class UniformeInstitutoSanJuan implements UniformeFactory {
  public Prenda fabricarParteSuperior() {
    Borrador borrador = new Borrador(TipoPrenda.CHOMBA);
    borrador.especificarColorPrimario(new Color(0, 255, 0));
    borrador.especificarMaterial(Material.PIQUE);
    borrador.especificarTrama(Trama.LISA);
    return borrador.crearPrenda();
  }

  public Prenda fabricarParteInferior() {
    Borrador borrador = new Borrador(TipoPrenda.PANTALON);
    borrador.especificarColorPrimario(new Color(100, 255, 100));
    borrador.especificarMaterial(Material.ACECATO);
    borrador.especificarTrama(Trama.LISA);
    return borrador.crearPrenda();
  }

  public Prenda fabricarCalzado() {
    Borrador borrador = new Borrador(TipoPrenda.ZAPATILLAS);
    borrador.especificarColorPrimario(new Color(255, 255, 255));
    borrador.especificarMaterial(Material.TELA);
    borrador.especificarTrama(Trama.LISA);
    return borrador.crearPrenda();
  }
}
