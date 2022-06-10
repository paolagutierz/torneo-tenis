package com.company;

import com.company.entity.PartidoEntity;
import com.company.repository.PartidoRepoImpl;
import com.company.service.PartidoService;
import com.company.service.PartidoServiceImpl;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner sc = new Scanner(System.in);

        PartidoService partidoService =  new PartidoServiceImpl(new PartidoRepoImpl());

        System.out.println("ingrese: 1. " +  "2. editar." +  "3. ver ");

        int respuestaCliente = 1;

        switch (respuestaCliente) {
            case 1:partidoService.crearPartido(new PartidoEntity());
            case 2:
                partidoService.editarPartido();
            case 3:
                partidoService.verPartido();
            case 4:




        }

    }
}
