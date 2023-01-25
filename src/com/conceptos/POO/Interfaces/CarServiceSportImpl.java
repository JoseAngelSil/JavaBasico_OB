package com.conceptos.POO.Interfaces;

import com.conceptos.POO.Coche;
import com.conceptos.POO.ElectricCar;

public class CarServiceSportImpl implements CocheService {
    @Override
    public Coche crearCoche() {
        System.out.println("Creando un coche Sport");
        return new ElectricCar();
    }
}
