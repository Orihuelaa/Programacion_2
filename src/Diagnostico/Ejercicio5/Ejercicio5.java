package Diagnostico.Ejercicio5;
import java.util.Scanner;
/*
Crea un programa que pida al usuario un número mínimo y un máximo y muestre por pantalla todos los números primos
incluidos en ese rango. Validar que mínimo sea menor que máximo.
*/
public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);

        // Solicitar al usuario el número mínimo
        System.out.println("Ingrese el número mínimo:");
        int min = lector.nextInt();

        // Solicitar al usuario el número máximo
        System.out.println("Ingrese el número máximo:");
        int max = lector.nextInt();

        // Validar que el número mínimo sea menor que el número máximo
        if (min >= max) {
            System.out.println("Error: El número mínimo debe ser menor que el número máximo.");
            return; // Salir del programa si la validación falla
        }

        // Mostrar los números primos en el rango dado
        System.out.println("Números primos entre " + min + " y " + max + ":");
        for (int i = min; i <= max; i++) {
            if (esPrimo(i)) {
                System.out.print(i + " ");
            }
        }

    }
    // Método para verificar si un número es primo
    public static boolean esPrimo(int num) {
        if (num <= 1) {
            return false; // Si el número es menor o igual a 1, no es primo
        }

        // Verificar si el número es divisible solo por 1 y por sí mismo
        for (int i = 2; i <= num; i++) {
            if (num % i == 0 && i != num) {
                return false; // El número no es primo
            }
        }
        return true; // Si no se encontró ningún divisor, el número es primo
    }
}
