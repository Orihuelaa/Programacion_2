package EjerciciosClase21_03.Ejercicio1;

public class Main {
    public static void main(String[] args) {
        FullTimeEmployee e1 = new FullTimeEmployee(1, "Cinthia", 1500, 700);
        System.out.println("El salario del trabajador "+e1.getName()+" es de: $"+e1.calculateSalary());

        PartTimeEmployee e2 = new PartTimeEmployee(2, "Juan", 2000, 26, 570);
        System.out.println("El salario del trabajador "+e2.getName()+" es de: $"+e2.calculateSalary());
    }
}
