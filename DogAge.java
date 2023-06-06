import java.util.Scanner;

public class DogAge {

    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);

        System.out.print("Ingrese la edad del perro: ");

        int dogAge = keyboard.nextInt();

        int dogAgeInHuman = dogAge * 7;

        System.out.println("La edad del perro en años humanos es: " + dogAgeInHuman);

    }
}
