package com.conceptos.TryCatchPKC;

public class ClassTry {
    public static void main(String[] args) {
        try {
            int result = 5 / 4;
        } catch (ArithmeticException e) {
            e.printStackTrace();
        }finally { // siempre se ejecutara para cerrar los recursos y limpieza de la memoria
            System.out.println("Cierre de recursos");
        }
        System.out.println("fin program");
    }
}
