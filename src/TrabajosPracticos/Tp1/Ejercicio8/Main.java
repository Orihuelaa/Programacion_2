package TrabajosPracticos.Tp1.Ejercicio8;

import TrabajosPracticos.Tp1.Ejercicio8.Clases.Activities;
import TrabajosPracticos.Tp1.Ejercicio8.Clases.Manager;
import TrabajosPracticos.Tp1.Ejercicio8.Clases.Worker;

/*
8-Se desea desarrollar un sistema de gestión de empleados para una empresa. El sistema debe
permitir registrar empleados de dos tipos diferentes: gerentes y trabajadores. Cada empleado debe
tener un nombre, una edad y un salario.
Los gerentes tienen la capacidad de organizar actividades dentro de un departamento específico,
mientras que los trabajadores están encargados de producir en un área determinada.
Implementa un sistema que modele esta situación utilizando herencia en Java. Define una clase
base llamada Empleado que contenga los atributos y métodos comunes para todos los empleados,
como el nombre, la edad, el salario y la capacidad de trabajar.
Luego, crea dos subclases: Gerente y Trabajador, que hereden de Empleado. Los gerentes deben
tener un atributo adicional para almacenar el departamento en el que trabajan, así como un
método para organizar actividades dentro de ese departamento.
Por otro lado, los trabajadores deben tener un atributo para indicar el área en la que trabajan y un
método para producir en esa área.
Finalmente, en el programa principal, crea instancias de ambas subclases y muestra cómo se utilizan
los métodos específicos de cada tipo de empleado, así como sus atributos.
 */
public class Main {
    public static void main(String[] args) {
        Manager manager1 = new Manager("Juan", 35, 5000, true, Activities.OrganizarInventario);
        Manager manager2 = new Manager("Pedro", 40, 6000, false, Activities.InspeccionGeneral);


        manager1.showInformation();
        manager2.showInformation();

        manager1.organizeActivities();
        manager2.organizeActivities();

        Worker worker1 = new Worker("Jose", 25, 3000, true, 10);
        Worker worker2 = new Worker("Joaquin", 30, 3500, false, 8);

        worker1.showInformation();
        worker2.showInformation();

        worker1.produceInArea();
        worker2.produceInArea();
    }
}
