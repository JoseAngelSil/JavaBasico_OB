package POO.Interfaces;

import POO.Coche;
import POO.DiselCar;

public class CarServiceClassicImpl implements CocheService{

    @Override
    public Coche crearCoche() {
        System.out.println("Creando un coche Clasico");
        return new DiselCar();
    }
}
