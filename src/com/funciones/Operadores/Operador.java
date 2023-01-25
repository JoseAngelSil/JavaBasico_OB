package com.funciones.Operadores;

public class Operador {
    public static void main(String[] args) {
        /*
        OPERADORES EN JAVA
        Operador	Sirve para
            +	    Suma dos operandos
            -	    Resta dos operandos
            *	    Multiplica dos números
            /	    Divide dos números
            %	    Divide dos números, devuelve el residuo
            ++	    Incrementa el valor
            -- 	    Hace que el valor de la variable disminuya
         */
        int a = 5, b = 10;
        var sum = a + b;
        System.out.println("sum = " + sum);
        var resta = a - b;
        System.out.println("resta = " + resta);
        var multiplicar = a * b;
        System.out.println("multiplicar = " + multiplicar);
        var divide = a / b;
        System.out.println("divide = " + divide);
        var mod = a % b;
        System.out.println("mod = " + mod);
         // incremental
        System.out.println(a);
        ++a; // primero incrementa a
        System.out.println("a = " + a);
        a++; // toma el valor de a y despues lo incrementa
        System.out.println("a = " + a);
        // disminuye b
        --b;
        System.out.println("b = " + b);
        b--;
        System.out.println("b = " + b);

        System.out.println("Operadores de comparacion \n");
        /*
        ==  igual que
        !=  distinto que
        <   menor que
        >   mayor que
        <=  menor igual
        >=  mayor igual
         */
        System.out.println(a == b);
        System.out.println(a > b);
        System.out.println(a >= b);
        System.out.println(a < b);
        System.out.println(a <= b);
        System.out.println(a != b);

        /*
        Operadores Logicos
        &&  And
        ||  Or
        !   Not
         */
        int c = 5;
        int d = 45;
        var isTrue =(a > b) && (c < 0);
        System.out.println("isTrue = " + isTrue);
    }
}
