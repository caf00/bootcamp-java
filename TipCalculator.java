import java.util.Scanner;

public class TipCalculator {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.print("Ingrese el total de la cuenta a pagar: ");

        double totalToPay =  keyboard.nextDouble();

        System.out.print("Ingrese el porcentaje de propina que desea dejar: ");

        double tipsRate =  keyboard.nextDouble();

        double tipsAmount = totalToPay * (tipsRate / 100);

        System.out.println("El monto de la propina a dejar es: " + tipsAmount);

    }
}
