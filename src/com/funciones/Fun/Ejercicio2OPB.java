package com.funciones.Fun;

public class Ejercicio2OPB {
    private static final float IVA = 0.16f;
    public static void main(String[] args) {
        System.out.println("Ejercicio2_OPB");
        float precio = 16.50f;
        System.out.printf("Precio Total: $%.3f", calculateIva(precio));
    }
    private static float calculateIva(float price){

        return (float) price + price * getIva() ;
    }

    public static float getIva() {
        return IVA;
    }
}
