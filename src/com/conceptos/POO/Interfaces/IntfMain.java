package com.conceptos.POO.Interfaces;

import com.conceptos.POO.Coche;

public class IntfMain {
    public static void main(String[] args) {
        CocheService newCarSport = new CarServiceSportImpl();
        CocheService newCarClassic = new CarServiceClassicImpl();

        //Creando objetos de una clase que implemento una interface
        Coche car1 = newCarSport.crearCoche();
        Coche car2 = newCarClassic.crearCoche();
        System.out.println(car1.toString());
        System.out.println(car2.toString());
    }
}
