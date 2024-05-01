package ar.edu.utn.frba.dds.queMePongo;

import java.util.List;

public class MotorDeSugerenciasBasico implements MotorDeSugerencias {
  public List<Sugerencia> generarSugerencias(Usuario usuario) {
    List<Prenda> prendasSuperiores = usuario.obtenerPrendasSuperiores();
    List<Prenda> prendasInferiores = usuario.obtenerPrendasInferiores();
    List<Prenda> prendasCalzado = usuario.obtenerPrendasCalzado();

    List<Sugerencia> sugerencias = generarCombinacionesDePrendas(prendasSuperiores, prendasInferiores, prendasCalzado);
    return sugerencias;
  }

  public List<Sugerencia> generarCombinacionesDePrendas(List<Prenda> superiores, List<Prenda> inferiores, List<Prenda> calzado) {
    //??
  }
}
