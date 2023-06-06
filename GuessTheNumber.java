import java.util.Random;
import java.util.Scanner;

public class GuessTheNumber {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        Random random = new Random();
        int randomNumber = random.nextInt(100) + 1;

        System.out.println("#############################################################################");
        System.out.println("###                                                                       ###");
        System.out.println("###            Ejercicio 5: Juego de adivinar el número                   ###");
        System.out.println("###                                                                       ###");
        System.out.println("#############################################################################\n");

        System.out.println("Acabo de elegir un número, adivinalo! pista, está entre 1 y 100");
        System.out.print("Ingresá el número por favor: ");
        int number = keyboard.nextInt();

        while (randomNumber != number) {

            if(number > randomNumber) {
                System.out.println("Intentá con un número menor a " + number);
            }
            if(number < randomNumber) {
                System.out.println("Intentá con un número mayor a " + number);
            }

            System.out.print("Ingresá un nuevo número: ");
            number = keyboard.nextInt();

        }
        System.out.println("\nAdivinaste!! el numero es: " + randomNumber);
    }
}
