package POO;

import java.sql.SQLOutput;

public class PoliformMain {
    // Coche coche1 = new Coche();
    ElectricCar coche2 = new ElectricCar(); // Creacion de objetos

    // Polomorfismo
    public static void main(String[] args) {
        Coche coche4 = new ElectricCar("Negro", "KIA", null, 1700.562,null);
        System.out.println(coche4.toString());
    }
}
