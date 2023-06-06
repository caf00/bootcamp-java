import java.util.Scanner;

public class DistanceConverter {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.print("Ingrese una distancia en millas: ");

        double distanceInMiles =  keyboard.nextDouble();

        double distanceInKilometer = distanceInMiles * 1.60934;

        System.out.println("La distancia ingresada en kilometros es: "+ distanceInKilometer);

    }
}
