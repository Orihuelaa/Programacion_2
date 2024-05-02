package TrabajosPracticos.Tp1.Ejercicio8.Clases;

import java.util.Random;

public class Worker extends Employee {
    private int workarea;
    Random random = new Random();

    public Worker(String name, int age, double salary, boolean workingCapacity, int workarea) {
        super(name, age, salary, workingCapacity);
        this.workarea = random.nextInt(10) + 1;
    }

    public void produceInArea() {
        System.out.println("El trabajador: " + super.getName() + " está produciendo en el área: " + this.workarea);
    }
}
