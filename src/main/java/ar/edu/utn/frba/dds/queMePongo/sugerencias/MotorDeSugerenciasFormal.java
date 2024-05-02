package ar.edu.utn.frba.dds.queMePongo.sugerencias;

import ar.edu.utn.frba.dds.queMePongo.prenda.Formalidad;
import ar.edu.utn.frba.dds.queMePongo.prenda.Prenda;
import ar.edu.utn.frba.dds.queMePongo.Usuario;
import java.util.ArrayList;
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

  public List<Sugerencia> generarCombinacionesDePrendas(List<Prenda> superiores, List<Prenda> inferiores, List<Prenda> calzados) {
    List<Sugerencia> sugerencias = new ArrayList<>();
    Prenda superior;
    Prenda inferior;
    Prenda calzado;
    for (int i = 0; i < superiores.toArray().length; i++) {
      superior = superiores.get(i);
      for (int j = 0; j < inferiores.toArray().length; j++) {
        inferior = inferiores.get(j);
        for (int k = 0; k < calzados.toArray().length; k++) {
          calzado = calzados.get(k);
          sugerencias.add(new Sugerencia(superior, inferior, calzado));
        }
      }
    }
    return sugerencias;
  }
}
