import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        run();
    }

    public static void run(){

        // Modifique el valor de operacion para validar sus metodos
        int operacion = 0;
        List<String> nombreAnimales = new ArrayList<>();

        menu(nombreAnimales, operacion);
    }

    public static void menu(List<String> animales, int operacion) {

        // Si desea implementar un menu real (do while), sientase libre de realizarlo

        switch (operacion) {
            case 0 -> agregarAnimal(animales);
        }

        System.out.println(animales);
    }

    public static void agregarAnimal(List<String> animales) {
        String[] nombres = {"Pepito", "Juan", "Diego", "Boxter", "Max"};
        String[] apellidos = {"Smith", "Johnson", "Portales", "Rodriguez", "Lagos"};

        Random rnum = new Random();

        // Corregir
        animales.add(nombres[rnum.nextInt(nombres.length)] + " " + apellidos[0]);

    }

    public static void eliminarAnimal() {

    }

    public static boolean existeAnimal() {
        if (0 == 0) {

        }

        return true;
    }

    public static void mostrarAnimalesRegistrados() {

        for (int i = 0; i < 1; i++) {

        }

        System.out.println("Total de animales registrados: " + totalAnimalesRegistrados());
    }

    public static int totalAnimalesRegistrados() {
        return 0;
    }

    public static void ordenarAnimalesAlfabetico(List<String> animales) {
        // Puede incluir un sout para testear que funcione su metodo
    }
}
