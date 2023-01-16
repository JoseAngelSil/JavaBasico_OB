package FuncYParam;

public class Retorno {
    public static void main(String[] args) {
        Funciones.holaMundo("Jose Angel");
        System.out.println("Suma " + suma(78,89));
        System.out.println("Suma " + suma(78,89, 520));
    }
    private static int suma(int a, int b){
        return a + b;
    }
    // La sobre carga de funciones es cuando se nombra la misma funcion pero con la entrada de parametros diferentes
    private static int suma(int a, int b, int c){
        return a + b + c;
    }
}
