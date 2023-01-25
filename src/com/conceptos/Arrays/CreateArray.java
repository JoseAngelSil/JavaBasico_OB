package com.conceptos.Arrays;

public class CreateArray {
    public static void main(String[] args) {
        // int array
        int[] notas = new int[10]; // array de notas de 10 posisiones
        int[] notas2 = {1,2,5,3,48,10,15,45,481,48}; // array asignados
        notas[0] = 8;
        notas[1] = 7;
        notas[2] = 6;
        //notas2.binarySearch(notas2,10);
        //notas2.sort(notas2);
        //System.out.println(notas[0]);
        /*
        for (int i = 0; i < notas2.length; i++){
            System.out.println(notas2[i]);
        }
        */
        for (int i:
             notas2) {
            System.out.println(i);
        }
    }
}
