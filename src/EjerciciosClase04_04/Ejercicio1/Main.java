package EjerciciosClase04_04.Ejercicio1;

import EjerciciosClase04_04.Ejercicio1.Clases.Circulo;
import EjerciciosClase04_04.Ejercicio1.Clases.Cuadrado;

public class Main {
    public static void main(String[] args) {
        Cuadrado cuadrado1 = new Cuadrado(4);
        Circulo circulo1 = new Circulo(2);

        System.out.println("El area del cuadrado es = "+cuadrado1.area());
        cuadrado1.dibujar();
        cuadrado1.rotar();

        System.out.println("El area del circulo es = "+circulo1.area());
        circulo1.dibujar();
    }
}