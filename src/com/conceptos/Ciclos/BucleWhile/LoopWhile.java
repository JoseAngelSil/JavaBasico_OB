package com.conceptos.Ciclos.BucleWhile;

public class LoopWhile {
    public static void main(String[] args) {
        // El coclo de while es otra forma para hacer las actividades
        int a = 1;
        while (a < 10){

            if (a == 6){
                a++; // se incrementa a
                continue; // se salta la condicion a la siguiente bucle
            }
            if (a == (2*4)){
                break; // rompe el bucle
            }
            System.out.println(a);
            a++; // condicion que cambie el interador y que tenga que romper el loop
        } // fin de while
        //System.out.println(a);
    }
}
