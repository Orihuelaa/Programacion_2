package Diagnostico.Ejercicio1;
import java.util.Scanner;
/*
Crea una calculadora simple en Java que pueda realizar operaciones básicas como suma, resta, multiplicación y división.
El programa debe solicitar al usuario que ingrese dos números y luego le permitirle elegir la operación que desea realizar.
Una vez completada la operación, debe mostrar el resultado al usuario.
Cada operación debe implementarse en un método diferente.
El programa principal debe llamar a estos métodos según la operación seleccionada por el usuario.
*/
public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        System.out.println("Ingrese un número: ");
        double n1 = lector.nextDouble();
        System.out.println("Ingrese otro número: ");
        double n2 = lector.nextDouble();

        System.out.println("Elija una operación a realizar:");
        System.out.println("1.Suma");
        System.out.println("2.Resta");
        System.out.println("3.Multiplicación");
        System.out.println("4.División");

        System.out.println("Opción: ");

        int option = lector.nextInt();

        switch(option){
            case 1:
                System.out.println("El resultado de la suma es: " + sum(n1, n2));
                break;
            case 2:
                System.out.println("El resultado de la resta es: " + rest(n1, n2));
                break;
            case 3:
                System.out.println("El resultado de la multiplicación es: " + mult(n1, n2));
                break;
            case 4:
                if (n2 != 0) {
                    System.out.println("El resultado de la división es: " + div(n1, n2));
                } else {
                    System.out.println("Error: No se puede dividir por cero.");
                }
                break;
            default:
                System.out.println("Opción no válida");
        }

    }
    public static double sum(double n1, double n2) {
        return n1 + n2;
    }

    public static double rest(double n1, double n2) {
        return n1 - n2;
    }

    public static double mult(double n1, double n2) {
        return n1 * n2;
    }

    public static double div(double n1, double n2) {
        return n1 / n2;
    }
}
