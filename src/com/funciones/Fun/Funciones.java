package com.funciones.Fun;

public class Funciones {
    public static void main(String[] args) {
        showMenu(); // funcion sin retorno ni parametros
        System.out.println(getMenu()); // funcion con retorno pero sin retorno
        saludoBuenosDias("OpenBootcamp y Jose Angel"); // funcion sin retorno pero con param
        // funcion con retorno y con param
        System.out.println(getNameComplete("Jose Angel", "Silva Cruz"));
        int suma = sum(45,59);
        System.out.println(suma);
        System.out.println(sum(45,78,89));
    }

    /**
     * Funcion de impresion de menu con tres opciones de desarrollo
     */
    private static void showMenu(){ // funcion que es privado de la clase y que no retorna nada
        System.out.println("*********************************");
        System.out.println("************Menu*****************");
        System.out.println("*********************************");
        System.out.println("1. Zapatilla");
        System.out.println("2. Tennis");
        System.out.println("3. Salir");
    }
    private static String getMenu(){ // funcion privada que retorna una cadena de la funcion
        return "Menu\n" +
                "1. Zapatilla\n" +
                "2. Tennis \n" +
                "3. Comprar\n" +
                "4. Salir";
    }
    private static void saludoBuenosDias(String mensaje){ // funcion con parametros y retorno vacio
        System.out.println("*********************************");
        System.out.printf("Buenos dias %s\n", mensaje);
    }
    private static String getNameComplete(String name, String lastName){
        return String.format("%s %s", name, lastName);
    }
    private static int sum(int a, int b){
        return a + b;
    }
    // Sobrecarga de funciones se llama como una funcion existente pero cambia los parametros
    private static int sum(int a, int b, int c){
        return a + b + c;
    }
}
