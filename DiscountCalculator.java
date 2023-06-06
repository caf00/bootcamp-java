import java.util.Scanner;

public class DiscountCalculator {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.println("#############################################################################");
        System.out.println("###                                                                       ###");
        System.out.println("###             Ejercicio 3: Calculadora de descuento                     ###");
        System.out.println("###                                                                       ###");
        System.out.println("#############################################################################\n");

        System.out.print("Ingresá el precio original del producto: ");

        double originalPrice =  keyboard.nextDouble();

        System.out.print("Ingresá el porcentaje de descuento: ");

        double discountRate =  keyboard.nextDouble();

        double finalPrice = originalPrice - (originalPrice * discountRate / 100);


        System.out.println("El precio final del producto es: " + finalPrice);

    }
}
