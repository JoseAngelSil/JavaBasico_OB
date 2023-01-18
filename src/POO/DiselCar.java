package POO;

public class DiselCar extends Coche{
    short cantDisel = 0;
    public DiselCar(){ //Constructor de ElectricCar
    }

    /**
     *
     * @param motorElect    Nombre de tipo de motor del coche elecrtrico
     */
    public DiselCar(short cantDisel){ //Constructor de ElectricCar con el motor
        this.cantDisel = cantDisel;
    }
    public DiselCar(String color, String fabricante, String modelo, Double peso,short cantDisel){
        super(color, fabricante, modelo, peso);
        this.cantDisel = cantDisel;
    }

    @Override
    public void acelerar(Integer cantidad) {
        int totalAcelerar = cantidad/2;
        super.acelerar(totalAcelerar);
    }

    @Override
    public String toString() {
        return "DiselCar{" +
                "cantDisel=" + cantDisel +
                ", color='" + color + '\'' +
                ", fabricante='" + fabricante + '\'' +
                ", modelo='" + modelo + '\'' +
                ", peso=" + peso +
                ", velocity=" + velocity +
                '}';
    }
}
