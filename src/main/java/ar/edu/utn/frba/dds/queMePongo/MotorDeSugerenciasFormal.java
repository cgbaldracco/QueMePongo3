package ar.edu.utn.frba.dds.queMePongo;

import java.util.List;

public class MotorDeSugerenciasFormal implements MotorDeSugerencias {
  public List<Sugerencia> generarSugerencias(Usuario usuario) {
    List<Prenda> prendasSuperiores = usuario.obtenerPrendasSuperiores();
    List<Prenda> prendasInferiores = usuario.obtenerPrendasInferiores();
    List<Prenda> prendasCalzado = usuario.obtenerPrendasCalzado();

    prendasSuperiores = obtenerPrendasValidas(usuario.obtenerEdad(), prendasSuperiores);
    prendasInferiores = obtenerPrendasValidas(usuario.obtenerEdad(), prendasInferiores);
    prendasCalzado = obtenerPrendasValidas(usuario.obtenerEdad(), prendasCalzado);

    List<Sugerencia> sugerencias = generarCombinacionesDePrendas(prendasSuperiores, prendasInferiores, prendasCalzado);
    return sugerencias;
  }

  List<Prenda> obtenerPrendasValidas(Integer edad, List<Prenda> prendas){
    return edad > 55 ? prendas.stream().filter(prenda ->
        !(prenda.obtenerFormalidad() == Formalidad.INFORMAL)).toList() : prendas;
  }

  public List<Sugerencia> generarCombinacionesDePrendas(List<Prenda> superiores, List<Prenda> inferiores, List<Prenda> calzado) {
    //??
  }
}
