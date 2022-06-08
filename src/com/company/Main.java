package com.company;

import com.company.entity.PartidoEntity;
import com.company.repository.PartidoRepoImpl;
import com.company.service.PartidoService;
import com.company.service.PartidoServiceImpl;

public class Main {

    public static void main(String[] args) {
	// write your code here

        PartidoService partidoService =  new PartidoServiceImpl(new PartidoRepoImpl());

        System.out.println("ingrese: 1. guardar" +
                "2. editar." +
                "3. ");

        int respuestaCliente = 1;

        switch (respuestaCliente) {
            case 1:
                partidoService.crearPartido(new PartidoEntity());
            case 2:
                partidoService.editarPartido();
            case 3:
                partidoService.verPartido();
            case 4:



        }

    }
}
