package com.company.entity;

import java.util.List;

public class PartidoEntity {

    private List<EquipoEntity> equipo;
    private double puntuacion;

    public List <EquipoEntity> getEquipo() {
        return equipo;
    }

    public void setEquipo(List <EquipoEntity> equipo) {
        this.equipo = equipo;
    }

    public double getPuntuacion() {
        return puntuacion;
    }

    public void setPuntuacion(double puntuacion) {
        this.puntuacion = puntuacion;
    }


}
