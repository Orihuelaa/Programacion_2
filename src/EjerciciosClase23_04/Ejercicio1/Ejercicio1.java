package EjerciciosClase23_04.Ejercicio1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        try {
            System.out.println("Ingrese el primer número:");
            double num1 = lector.nextDouble();

            System.out.println("Ingrese el segundo número:");
            double num2 = lector.nextDouble();

            System.out.println("Elija la operación a realizar (1: suma, 2: resta, 3: multiplicación, 4: división):");
            int option = lector.nextInt();

            double result = 0;

            switch (option) {
                case 1:
                    result = num1 + num2;
                    break;
                case 2:
                    result = num1 - num2;
                    break;
                case 3:
                    result = num1 * num2;
                    break;
                case 4:
                    if (num2 == 0) {
                        throw new ArithmeticException("No se puede dividir por cero.");
                    }
                    result = num1 / num2;
                    break;
                default:
                    System.out.println("Opción no válida");
                    return;
            }

            System.out.println("El resultado es: " + result);

        } catch (InputMismatchException e) {
            System.out.println("Error: Ingrese un número válido.");
        } catch (ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
