package com.conceptos.ListasPck;

import com.conceptos.POO.Coche;
import com.conceptos.POO.DiselCar;
import com.conceptos.POO.ElectricCar;

import java.util.ArrayList;
import java.util.List;

public class ListasClass {
    public static void main(String[] args) {
        List<String> nombres = new ArrayList<>(); // como crear un array list
        nombres.add("A");
        nombres.add("B");
        nombres.add("C");
        nombres.add("D");
        nombres.add("E");
        nombres.add("F");
        nombres.add("G");
        nombres.add("H");

        System.out.println(nombres);
        for (String n : // el foreach se tiene que declarar la tipo de variable que se esta valorando
             nombres) {
            System.out.println(n);
        }

        //array list from class Coche
        List<Coche> coches = new ArrayList<>();
        coches.add(new ElectricCar("Negro", "KIA", null, 1700.562,null));
        coches.add(new DiselCar("Verde","VW", null,15.56, 20.1));
        coches.add(new ElectricCar("gris", "IA", null, 17.562,"Manzana"));
        coches.add(new DiselCar("Verde","VvdeW", null,15.5656, 45.2));
        for (Coche c : coches) { // iteracion de clase coche del array list
            System.out.println(c.toString());
        }
    }
}
