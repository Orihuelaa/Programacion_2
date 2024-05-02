package EjerciciosClase04_04.Ejercicio1.Clases;

import EjerciciosClase04_04.Ejercicio1.Interfaces.Dibujable;
import EjerciciosClase04_04.Ejercicio1.Interfaces.Figura;
import EjerciciosClase04_04.Ejercicio1.Interfaces.Rotable;

public class Cuadrado implements Figura, Rotable, Dibujable {
    private int lados;
    //Constructor
    public Cuadrado(int lados) {
        this.lados = lados;
    }
    //Getter y Setter
    public int getLados() {
        return lados;
    }

    public void setLados(int lados) {
        this.lados = lados;
    }
    //Metodos
    @Override
    public float area() {
        return lados*lados;
    }

    @Override
    public void dibujar() {
        System.out.println("Se ha dibujado el Cuadrado");
    }

    @Override
    public void rotar() {
        System.out.println("La figura ha rotado 90º");
    }

}
