package com.conceptos.SentenciasIf;

public class SentenciasCon {
    public static void main(String[] args) {
        boolean isActiveCheck = 5 < 10;
        int a = 84, b =65;
        if (isActiveCheck && (a < b)){
            System.out.println("Es verdadero");
        }else if(isActiveCheck || (a<b)){
            System.out.println("else if");
        }else
            System.out.println("falso");
    }
}
