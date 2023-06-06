import java.util.Scanner;

public class DistanceConverter {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.println("#############################################################################");
        System.out.println("###                                                                       ###");
        System.out.println("###             Ejercicio 2: Conversor de millas a kilómetros             ###");
        System.out.println("###                                                                       ###");
        System.out.println("#############################################################################\n");

        System.out.print("Ingresá una distancia en millas: ");

        double distanceInMiles =  keyboard.nextDouble();

        double distanceInKilometer = distanceInMiles * 1.60934;

        System.out.println("La distancia ingresada en kilometros es: "+ distanceInKilometer);

    }
}
