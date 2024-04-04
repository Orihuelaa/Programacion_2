package Diagnostico.Ejercicio2;
import java.util.Scanner;
/*
Crea un programa en Java que convierta la temperatura de grados Celsius a Fahrenheit y viceversa.
El programa debe permitir al usuario elegir la dirección de la conversión y luego ingresar la temperatura a convertir.
*/
public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        double temp;
        System.out.println("Seleccione la dirección de conversión:");
        System.out.println("1. Celsius a Fahrenheit");
        System.out.println("2. Fahrenheit a Celsius");

        System.out.println("Opción: ");

        int option = lector.nextInt();

        if (option == 1) {
            System.out.println("Ingrese la temperatura en grados Celsius:");
            temp = lector.nextDouble();
            double fahrenheit = celsiusAFahrenheit(temp);
            System.out.println("La temperatura en Fahrenheit es: " + fahrenheit);
        } else if (option == 2) {
            System.out.println("Ingrese la temperatura en grados Fahrenheit:");
            temp = lector.nextDouble();
            double celsius = fahrenheitACelsius(temp);
            System.out.println("La temperatura en Celsius es: " + celsius);
        } else {
            System.out.println("Opción no válida");
        }
    }
    public static double celsiusAFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }
    public static double fahrenheitACelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }
}
