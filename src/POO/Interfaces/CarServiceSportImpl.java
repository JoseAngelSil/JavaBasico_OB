package POO.Interfaces;

import POO.Coche;
import POO.ElectricCar;

public class CarServiceSportImpl implements CocheService {
    @Override
    public Coche crearCoche() {
        System.out.println("Creando un coche Sport");
        return new ElectricCar();
    }
}
