package ar.edu.utn.frba.dds.queMePongo;

import java.util.ArrayList;
import java.util.List;

public class Usuario {
  private List<Prenda> prendas = new ArrayList<>();
  private Integer edad;
  private MotorDeSugerencias motorDeSugerencias;

  public Usuario(Integer edad, MotorDeSugerencias motorDeSugerencias) {
    this.edad = edad;
    this.motorDeSugerencias = motorDeSugerencias;
  }

  public MotorDeSugerencias obtenerMotor() {
    return motorDeSugerencias;
  }

  public void setMotor(MotorDeSugerencias motor) {
    this.motorDeSugerencias = motor;
  }

  public void agregarPrenda(Prenda prenda) {
    prendas.add(prenda);
  }

  public List<Sugerencia> generarSugerencias() {
    motorDeSugerencias.generarSugerencias(this);
  }

  public List<Prenda> obtenerPrendasSuperiores() {
    return prendas.stream().filter(prenda -> prenda.obtenerCategoria() == Categoria.PARTE_SUPERIOR).toList();
  }

  public List<Prenda> obtenerPrendasInferiores() {
    return prendas.stream().filter(prenda -> prenda.obtenerCategoria() == Categoria.PARTE_INFERIOR).toList();
  }

  public List<Prenda> obtenerPrendasCalzado() {
    return prendas.stream().filter(prenda -> prenda.obtenerCategoria() == Categoria.CALZADO).toList();
  }

  public Integer obtenerEdad() {
    return getEdad();
  }

  private Integer getEdad() {
    return edad;
  }

  public List<Prenda> obtenerPrendas() {
    return prendas;
  }
}

