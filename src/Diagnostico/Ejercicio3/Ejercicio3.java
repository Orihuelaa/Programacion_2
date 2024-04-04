package Diagnostico.Ejercicio3;
import java.util.Scanner;
/*
Pide por teclado dos números y genera 10 números aleatorios entre esos números.
Usa el método Math.random para generar un número entero aleatorio.
*/
public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el primer número:");
        int num1 = scanner.nextInt();

        System.out.println("Ingrese el segundo número:");
        int num2 = scanner.nextInt();

        System.out.println("Generando 10 números aleatorios entre " + num1 + " y " + num2 + ":");

        for (int i = 0; i < 10; i++) {
            int numeroAleatorio = generarNumeroAleatorio(num1, num2);
            System.out.println(numeroAleatorio);
        }

    }
    // Método para generar un número aleatorio entre dos números dados
    public static int generarNumeroAleatorio(int min, int max) {
        // Calculamos el rango multiplicando el número aleatorio por la diferencia entre max y min
        // Luego, sumamos min para desplazar el rango
        int numAleatorio = (int) (Math.random() * (max - min + 1)) + min;

        // Devolvemos el número aleatorio generado
        return numAleatorio;
    }
}
