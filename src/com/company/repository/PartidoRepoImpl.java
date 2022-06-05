package com.company.repository;

import com.company.entity.PartidoEntity;
import com.company.repository.entity.PartidoRepo;

import java.util.HashMap;

public class PartidoRepoImpl implements PartidoRepo {
    private final HashMap<Integer, PartidoEntity> mapa =  new HashMap<>();

    @Override
    public PartidoEntity crearPartido(PartidoEntity partido) {
        int tamanno = mapa.entrySet().size();
        int nuevoId = tamanno + 1;
        //partido.setId(nuevoId);
        mapa.put(nuevoId, partido);
        return null;
    }
}
