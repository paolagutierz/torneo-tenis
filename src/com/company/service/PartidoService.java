package com.company.service;

import com.company.entity.PartidoEntity;

import java.util.List;

public interface PartidoService {

    PartidoEntity crearPartido(PartidoEntity partido);
    PartidoEntity editarPartido(int id, PartidoEntity partido);
    PartidoEntity verPartido(int id);
    List<PartidoEntity> verTodosLosPartidos();
    void eliminarPartido(int id);
}
