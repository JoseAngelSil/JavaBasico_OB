package com.conceptos.POO.Interfaces;

import com.conceptos.POO.Coche;
import com.conceptos.POO.DiselCar;

public class CarServiceClassicImpl implements CocheService{

    @Override
    public Coche crearCoche() {
        System.out.println("Creando un coche Clasico");
        return new DiselCar();
    }
}
