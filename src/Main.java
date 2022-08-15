import com.sun.source.tree.WhileLoopTree;

public class Main {
    private static int numeroIf = 1;
    private static int numeroWhile = 0;

    public static void main(String[] args) {
    //Control If
        if (numeroIf < 0) {
            System.out.println("numeroIf es negativo");
        } else if (numeroIf > 0) {
            System.out.println("numeroIf es positivo");
        }
        else {
            System.out.println("numeriIf es cero");
        }
    // bucle While
        while(numeroWhile < 3) {
            System.out.println("del bucle while, numeroWhile es " + numeroWhile);
            numeroWhile++;
        }
    // bucle Do-While
        do {
            System.out.println("del bucle do-while, numeroWhile es " + numeroWhile);
            numeroWhile++;
        } while (numeroWhile < 3);
    //bucle For
        int numeroFor;
        for (numeroFor = 0; numeroFor <= 3; numeroFor++) {
            System.out.println("del bucle For, numeroFor es " + numeroFor);
        }
    // control Switch
        String estacion = "OTOÑO";
        switch (estacion){
            case ("VERANO"):
            case ("PRIMAVERA"):
            case ("OTOÑO"):
            case ("INVIERNO"):
                System.out.println("Estamos en la estación " + estacion);
                break;
            default:
                System.out.println("Esa estación no existe");
        }
    }
}