package POO;

public class CocheMain {
    public static void main(String[] args) {
        // Create a new object
        // Coche coche = new Coche("Negro", "KIA", null, 1700.562); // creacion de objeto
        // Coche VW = new Coche("Azul", "VW", null, 1700.562); // creacion de objeto
        // coche.acelerar(10);

        // Call the factory method
        // System.out.println(coche.toString());
        // System.out.println(VW.toString());

        //Call class ElectricCar
        ElectricCar carElectric = new ElectricCar("Negro", "KIA", null, 1700.562,"Litio");
        ElectricCar carElectrico = new ElectricCar("Negro", "Tesla", "LAS", 1000.562,"Litio FXV");
        System.out.println(carElectric.toString());
        System.out.println(carElectrico.toString());
        carElectrico.acelerar(20);
        System.out.println(carElectrico.toString());
    }
}
