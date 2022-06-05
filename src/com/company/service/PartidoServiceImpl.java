package com.company.service;

import com.company.entity.PartidoEntity;
import com.company.repository.entity.PartidoRepo;

import java.util.List;

public class PartidoServiceImpl implements PartidoService {

    private PartidoRepo repo;

    public PartidoServiceImpl(PartidoRepo repo) {
        this.repo = repo;
    }

    @Override
    public PartidoEntity crearPartido(PartidoEntity partido) {
        repo.crearPartido(partido);
        return partido;
    }

    @Override
    public PartidoEntity editarPartido(int id, PartidoEntity partido) {
        return null;
    }

    @Override
    public PartidoEntity verPartido(int id) {
        return null;
    }

    @Override
    public List<PartidoEntity> verTodosLosPartidos() {
        return null;
    }

    @Override
    public void eliminarPartido(int id) {

    }
}
