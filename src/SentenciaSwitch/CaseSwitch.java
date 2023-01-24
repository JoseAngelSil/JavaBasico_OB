package SentenciaSwitch;

public class CaseSwitch {
    public static void main(String[] args) {
        String estacion = "primavera";
        switch (estacion){
            case "primavera":
                System.out.println("Hace mucho calor");
                break;
            case "verano":
                System.out.println("Hace mucho sol");
                break;
            case "otonio":
                System.out.println("Hace mucho frio");
                break;
            case "invierno":
                System.out.println("Quiero mi sueter");
                break;
            default:
                System.out.println("No entiendo, que planetas vienes?");
        }
    }
}
