package com.company.entity;

import java.util.List;

public class EquipoEntity {

    private List<JugadorEntity> jugadores;
    private CategoriaEnum categoria;
    private NumeroDeJugadoresEnum numeroJugadores;

    public List<JugadorEntity> getJugadores() {
        return jugadores;
    }

    public void setJugadores(List<JugadorEntity> jugadores) {
        this.jugadores = jugadores;
    }

    public CategoriaEnum getCategoria() {
        return categoria;
    }

    public void setCategoria(CategoriaEnum categoria) {
        this.categoria = categoria;
    }

    public NumeroDeJugadoresEnum getNumeroJugadores() {
        return numeroJugadores;
    }

    public void setNumeroJugadores(NumeroDeJugadoresEnum numeroJugadores) {
        this.numeroJugadores = numeroJugadores;
    }

    public enum CategoriaEnum {
        FEMEMINO("Femenino"),

        MASCULINO("Masculino"),

        MIXTO("Mixto");

        public String getValue() {
            return value;
        }

        public void setValue(String value) {
            this.value = value;
        }

        private String value;

        CategoriaEnum(String value) {
            this.value = value;
        }

        }

        public enum NumeroDeJugadoresEnum{
            INDIVIDUAL(1),
            DUOS(2),
            CUARTETOS(4);

            public Integer getValue() {
                return value;
            }

            public void setValue(Integer value) {
                this.value = value;
            }

            private Integer value;
            NumeroDeJugadoresEnum(Integer value) {
                this.value = value;
            }
        }

    }

