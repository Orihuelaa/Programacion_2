package Diagnostico.Ejercicio4;
import java.util.Scanner;
/*
Pide un número por teclado e indica si es un número primo o no.
*/
public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);

        // Solicitar al usuario que ingrese un número
        System.out.println("Ingrese un número:");
        int num = lector.nextInt();

        // Verificar si el número es primo
        boolean esPrimo = esNumeroPrimo(num);

        // Mostrar el resultado
        if (esPrimo) {
            System.out.println(num + " es un número primo.");
        } else {
            System.out.println(num + " no es un número primo.");
        }

    }
    // Método para verificar si un número es primo
    public static boolean esNumeroPrimo(int num) {
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
