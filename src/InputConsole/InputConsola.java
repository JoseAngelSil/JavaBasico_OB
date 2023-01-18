package InputConsole;

import java.util.Scanner;

public class InputConsola {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.print("Ingrese su nombre: ");
        String strNombre = console.nextLine();
        System.out.print("Ingrese su edad: ");
        byte byEdad = console.nextByte();
        System.out.println();
        System.out.printf("Buenas noches %s, veo que tienes %d años de edad.\n",strNombre, byEdad);
    }
}
