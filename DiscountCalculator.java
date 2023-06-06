import java.util.Scanner;

public class DiscountCalculator {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.print("Ingrese el precio original del producto: ");

        double originalPrice =  keyboard.nextDouble();

        System.out.print("Ingrese el porcentaje de descuento: ");

        double discountRate =  keyboard.nextDouble();

        double finalPrice = originalPrice - (originalPrice * discountRate / 100);


        System.out.println("El precio final del producto es: " + finalPrice);

    }
}
