package TrabajosPracticos.Tp1.Ejercicio8.Clases;

import java.util.Random;

public class Manager extends Employee {
    private Activities activities;
    private int departament;
    Random random = new Random();

    public Manager(String name, int age, double salary, boolean workingCapacity, Activities activities) {
        super(name, age, salary, workingCapacity);
        this.activities = activities;
        this.departament = random.nextInt(10) + 1;
    }

    public void organizeActivities() {
        System.out.println("El gerente: " + super.getName() + " realiza la actividad: " + this.activities +
                " en el departamento: " + this.departament);
    }
}
