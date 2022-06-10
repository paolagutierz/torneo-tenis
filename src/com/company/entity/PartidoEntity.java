package com.company.entity;

import java.util.List;

public class PartidoEntity {

    private EquipoEntity equipo1;
    private EquipoEntity equipo2;
    private Integer puntuacionEquipo1;
    private Integer puntuacionEquipo2;

    public EquipoEntity getEquipo1() {
        return equipo1;
    }

    public void setEquipo1(EquipoEntity equipo1) {
        this.equipo1 = equipo1;
    }

    public EquipoEntity getEquipo2() {
        return equipo2;
    }

    public void setEquipo2(EquipoEntity equipo2) {
        this.equipo2 = equipo2;
    }

    public Integer getPuntuacionEquipo1() {
        return puntuacionEquipo1;
    }

    public void setPuntuacionEquipo1(Integer puntuacionEquipo1) {
        this.puntuacionEquipo1 = puntuacionEquipo1;
    }

    public Integer getPuntuacionEquipo2() {
        return puntuacionEquipo2;
    }

    public void setPuntuacionEquipo2(Integer puntuacionEquipo2) {
        this.puntuacionEquipo2 = puntuacionEquipo2;
    }
}


