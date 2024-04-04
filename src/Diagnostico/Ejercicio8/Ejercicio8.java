package Diagnostico.Ejercicio8;
import java.util.Scanner;
/*
Pedir números al usuario y cuando el usuario meta un -1 se terminará el programa.
Al terminar, mostrará lo siguiente:
mayor numero introducido
menor numero introducido
suma de todos los numeros
suma de los numeros positivos
suma de los numeros negativos
media de la suma (la primera que pido)
El número -1 no contara como número.
*/
public class Ejercicio8 {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);

        int num;
        int mayor = Integer.MIN_VALUE;
        int menor = Integer.MAX_VALUE;
        int sumaTotal = 0;
        int sumaPositivos = 0;
        int sumaNegativos = 0;
        int cantNums = 0;

        // Solicitar números al usuario hasta que se ingrese -1
        System.out.println("Ingrese números (ingrese -1 para terminar):");

        while (true) {
            num = lector.nextInt();

            // Verificar si se ingresó -1 para terminar el programa
            if (num == -1) {
                break;
            }

            // Actualizar el mayor y el menor número ingresado
            mayor = Math.max(mayor, num);
            menor = Math.min(menor, num);

            // Sumar al total y contabilizar la cantidad de números ingresados
            sumaTotal += num;
            cantNums++;

            // Sumar a la suma de positivos o negativos según el signo del número
            if (num > 0) {
                sumaPositivos += num;
            } else if (num < 0) {
                sumaNegativos += num;
            }
        }

        // Calcular la media
        double media = (double) sumaTotal / cantNums;

        // Mostrar los resultados
        System.out.println("a. Mayor número introducido: " + (mayor == Integer.MIN_VALUE ? "No se ingresaron números" : mayor));
        System.out.println("b. Menor número introducido: " + (menor == Integer.MAX_VALUE ? "No se ingresaron números" : menor));
        System.out.println("c. Suma de todos los números: " + sumaTotal);
        System.out.println("d. Suma de los números positivos: " + sumaPositivos);
        System.out.println("e. Suma de los números negativos: " + sumaNegativos);
        System.out.println("f. Media de la suma: " + (cantNums == 0 ? "No se ingresaron números" : media));
    }
}
