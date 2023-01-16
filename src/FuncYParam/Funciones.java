package FuncYParam;

/**
 * Clase que compone de como crear funciones y parametros en Java
 */
public class Funciones {
    public static void main(String[] args) {
        holaMundo();
        holaMundo();
        holaMundo("Alan");

        // usar una funcion que retorna un dato
        String dato = devHola();
        System.out.println(dato);
        System.out.println(devHola()); // otra forma de devolver el dato
    }
    //funcion holaMundo()
    private static void holaMundo(){
        System.out.println("Hola mundo desde un metodo");
    }
    // Se llama la misma funcion pero recibe el parametro de nombre por lo que se le conoce como polimorfismo

    /**
     * Funcion que imprime un saludo personalizado
     * @param name
     * parametro name es el dato que ingresa al ser usado
     */
    protected static void holaMundo(String name){
        System.out.printf("Hola %s \n",name);
    }

    // para devolver datos puede ser de esta forma
    private static String devHola(){
        return "Hola";
    }
}
