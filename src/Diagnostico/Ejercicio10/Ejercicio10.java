package Diagnostico.Ejercicio10;
import java.util.Scanner;
/*
Crea un programa en Java que solicite al usuario ingresar las notas de un conjunto de estudiantes
y luego calcule el promedio de esas notas. El programa debe preguntar al usuario cuántas notas desea ingresar,
luego leer las notas y finalmente calcular y mostrar el promedio.
*/
public class Ejercicio10 {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);

        // Solicitar al usuario la cantidad de notas a ingresar
        System.out.println("Ingrese la cantidad de notas a ingresar:");
        double cantNotas = lector.nextDouble();

        // Verificar si la cantidad de notas es válida
        if (cantNotas <= 0) {
            System.out.println("Error: La cantidad de notas debe ser mayor que cero.");
            return;
        }

        // Solicitar al usuario ingresar las notas
        System.out.println("Ingrese las notas:");

        double sumaNotas = 0;

        // Leer las notas ingresadas por el usuario y sumarlas
        for (int i = 0; i < cantNotas; i++) {
            double nota;
            boolean notaValida = false;

            // Solicitar la nota al usuario hasta que sea válida
            while (!notaValida) {
                System.out.print("Nota " + (i + 1) + ": ");
                nota = lector.nextDouble();

                // Verificar si la nota ingresada es válida (entre 1 y 10)
                if (nota >= 1 && nota <= 10) {
                    notaValida = true;
                    sumaNotas += nota;
                } else {
                    System.out.println("Error: La nota debe estar entre 1 y 10.");
                }
            }
        }

        // Calcular el promedio de las notas
        double promedio = sumaNotas / cantNotas;

        // Mostrar el promedio de las notas
        System.out.println("El promedio de las notas es: " + promedio);
    }
}
