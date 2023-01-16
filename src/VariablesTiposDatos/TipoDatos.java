package VariablesTiposDatos;

/**
 * Clase TipoDatos
 * Es la clase donde se ve los tipos de datos que contine JAVA ademas de como se usan
 */
public class TipoDatos {
    public static void main(String[] args) {
        /*
        La creacion de datos se crea de la forma de
        typeData nameVariable = [data];

        DataType nameVariable;
        nameVariable = [data];

         */

        // Type data numeric integer
        byte byteNumber = 1;        // Capacidad de almacenamiento de 1 byte
        short shortNumber = 2;      // 2 bytes
        int intNumber = 3;          // 4 bytes
        long longNumber = 4;        // 8 bytes

        // Type data numeric float
        float floatNumber = 4.3f;   // Siempre para indicar el tipo de dato float, finalizar el numero con un 'f'
        double douNumber = 45.2d;   // con el dato double no es necesario ingresar un 'd' ya que lo
                                    // reconoce automaticamente

        // Type Char
        char dataChar = 'a';        // Este dato es lo que se usa de forma de caracter, es decir un caracter de ASCII

        // type Boolean
        boolean isTrue = true;      // Solamente contiene dos datos, true o false, por lo que se le tiene que llamar
        boolean isFalse = false;    // la variable como is-[complement]

        // Type String
        String strNombre = "Jose Angel";    // Esta ya es un tipo de dato no primitivo por lo que es un envoltorio
        /*
        Los tipos primitivos son aquellos que no son considerado como objeto, por lo que no tiene metodos
        Siendo que contiene mecanismos que permiten envolver un dato primitivo y tratarlo como si fuesen como objetos
         */
        // Type Wrapper
            //type integer
        Byte noByte = 4;
        Short noShort = 45;
        Integer noInt = 78;
        Long noLong = (long) 454;

            //type float
        Float noFloat = 45.78f;
        Double noDouble = 7880.2326;
        System.out.println(noDouble.getClass());
    }
}
