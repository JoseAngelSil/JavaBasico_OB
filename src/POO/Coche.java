package POO;

/**
 * Clase de Coche para la creacion de objetos de la misma forma
 */
public class Coche {
    // Atributos
    private String color;
    private String fabricante;
    private String modelo;
    private Double peso;

    private Integer velocity = 0;

    //constructores
     // sin constructor, se crea de forma default, es decir, que la clase esta vacia

    /**
     *
     * @param color
     * String de color del coche
     * @param fabricante
     * String de fabricante
     * @param modelo
     * string de modelo
     * @param peso
     * Double de peso del coche
     */
    public Coche (String color, String fabricante, String modelo, Double peso){
        this.color = color;
        this.fabricante = fabricante;
        this.modelo = modelo;
        this.peso = peso;
    }
    public void acelerar(Integer cantidad){
        if (cantidad > 0 && cantidad < 120){
            this.velocity += cantidad;
        }
    }

    @Override
    public String toString() {
        return "Coche{" +
                "color='" + color + '\'' +
                ", fabricante='" + fabricante + '\'' +
                ", modelo='" + modelo + '\'' +
                ", peso=" + peso +
                ", velocity=" + velocity +
                '}';
    }
}
