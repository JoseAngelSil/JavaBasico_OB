package com.conceptos.POO;

public class ElectricCar extends Coche{ // forma de integrar la herencia de una clase
    String motorElect;

    public ElectricCar(){ //Constructor de ElectricCar
    }

    /**
     *
     * @param motorElect    Nombre de tipo de motor del coche elecrtrico
     */
    public ElectricCar(String motorElect){ //Constructor de ElectricCar con el motor
        this.motorElect = motorElect;
    }
    public ElectricCar(String color, String fabricante, String modelo, Double peso,String motorElect){
        super(color, fabricante, modelo, peso);
        this.motorElect = motorElect;
    }

    /**
     *
     * @param cantidad  Cantidad de acelerar y este duplica la caja de acelerador
     */
    @Override
    public void acelerar(Integer cantidad) { //Sobreescritura de funciones
        int acelerarAjustada =  cantidad * 2;
        super.acelerar(acelerarAjustada); //llamada de la funcion principal de super
    }

    @Override
    public String toString() {
        return "ElectricCar{" +
                ", color='" + color + '\'' +
                ", fabricante='" + fabricante + '\'' +
                ", modelo='" + modelo + '\'' +
                ", peso=" + peso +
                ", velocity=" + velocity + '\'' +
                ", motorElect='" + motorElect + '\'' +
                '}';
    }
}
