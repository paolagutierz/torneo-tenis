package com.company.entity;

import java.util.List;

public class EquipoEntity {

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

