package Clase_7;

import java.util.Arrays;
import java.util.Scanner;

public class ArraysApp {
    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);
        int[] numbers = new int[5];
        String optionExternalWhile = "S";

        System.out.println("#############################################################################");
        System.out.println("###                                                                       ###");
        System.out.println("###                  Ejercicios Clase 7: Arreglos                         ###");
        System.out.println("###                                                                       ###");
        System.out.println("#############################################################################");

        while (optionExternalWhile.equals("S") || optionExternalWhile.equals("s")) {
            System.out.println("\nDebe ingresar cinco números para jugar con los arreglos:");
            for (int i = 0; i < 5; i++) {
                System.out.print("[" + (i+1) + "] Ingrese un número: ");
                numbers[i] = keyboard.nextInt();
            }

            int optionInternalWhile = 0;
            while (optionInternalWhile != 4) {
                System.out.println("\nQué desea hacer con el arreglo?");
                System.out.println("\t1 - Mostrar el arreglo.");
                System.out.println("\t2 - Mostrar el mayor y el menor.");
                System.out.println("\t3 - Mostrar el promedio.");
                System.out.println("\t4 - salir.");
                System.out.print("Ingrese una opción: ");
                optionInternalWhile = keyboard.nextInt();

                if(optionInternalWhile == 1) {
                    System.out.println("El contenido del arreglo es: ");
                    for (int i = 0; i < numbers.length; i++) {
                        System.out.println("\t" + (i+1) + ": " + numbers[i]);
                    }
                }

                if(optionInternalWhile == 2) {
                    int smallest = numbers[0];
                    int largest = numbers[0];
                    for (int i = 1; i < numbers.length; i++) {
                        if (numbers[i] < smallest) {
                            smallest = numbers[i];
                        }
                        if (numbers[i] > largest) {
                            largest = numbers[i];
                        }
                    }
                    System.out.println("\tEl menor es: " + smallest);
                    System.out.println("\tEl mayor es: " + largest);
                }

                if(optionInternalWhile == 3) {
                    double average = (double) Arrays.stream(numbers).sum()/5;
                    System.out.println("\tEl promedio de los valores del arreglo es: " + average);
                }

            }

            System.out.print("\nContinuar? s - n: ");
            optionExternalWhile = keyboard.next();

        }
    }
}
