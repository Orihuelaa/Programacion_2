package Diagnostico.Ejercicio9;
import java.util.Scanner;
/*
Crea un programa en Java que permita al usuario sumar dos matrices de tamaño NxM.
El programa debe solicitar al usuario que ingrese las dimensiones de las matrices y luego ingresar los
elementos de cada matriz. Después de eso, debe calcular la suma de las dos matrices
(resultando una tercera matriz con la suma de los elementos de igual posición de las matrices operandos) e
imprimir el resultado.
*/
public class Ejercicio9 {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);

        // Solicitar al usuario las dimensiones de las matrices
        System.out.println("Ingrese las dimensiones de las matrices (NxM):");
        System.out.print("Número de filas (N): ");
        int filas = lector.nextInt();
        System.out.print("Número de columnas (M): ");
        int columnas = lector.nextInt();

        // Declarar las matrices
        int[][] matriz1 = new int[filas][columnas];
        int[][] matriz2 = new int[filas][columnas];
        int[][] sumaMatrices = new int[filas][columnas];

        // Solicitar al usuario que ingrese los elementos de la primera matriz
        System.out.println("Ingrese los elementos de la primera matriz:");
        ingresarElementosMatriz(lector, matriz1);

        // Solicitar al usuario que ingrese los elementos de la segunda matriz
        System.out.println("Ingrese los elementos de la segunda matriz:");
        ingresarElementosMatriz(lector, matriz2);

        // Sumar las dos matrices
        sumarMatrices(matriz1, matriz2, sumaMatrices);

        // Mostrar la suma de las matrices
        System.out.println("La suma de las matrices es:");
        imprimirMatriz(sumaMatrices);
    }

    // Método para ingresar los elementos de una matriz desde el teclado
    public static void ingresarElementosMatriz(Scanner lector, int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.print("Ingrese el elemento en la posición [" + i + "][" + j + "]: ");
                matriz[i][j] = lector.nextInt();
            }
        }
    }

    // Método para sumar dos matrices
    public static void sumarMatrices(int[][] matriz1, int[][] matriz2, int[][] resultado) {
        for (int i = 0; i < matriz1.length; i++) {
            for (int j = 0; j < matriz1[0].length; j++) {
                resultado[i][j] = matriz1[i][j] + matriz2[i][j];
            }
        }
    }

    // Método para imprimir una matriz
    public static void imprimirMatriz(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }
}
