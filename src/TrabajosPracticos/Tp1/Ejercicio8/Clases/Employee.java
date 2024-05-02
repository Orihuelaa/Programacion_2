package TrabajosPracticos.Tp1.Ejercicio8.Clases;

public class Employee {
    private String name;
    private int age;
    private double salary;
    private boolean workingCapacity;

    public Employee(String name, int age, double salary, boolean workingCapacity) {
        this.name = name;
        this.age = age;
        this.salary = salary;
        this.workingCapacity = workingCapacity;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public boolean isWorkingCapacity() {
        return workingCapacity;
    }

    public void setWorkingCapacity(boolean workingCapacity) {
        this.workingCapacity = workingCapacity;
    }

    public void showInformation(){
        System.out.println("Nombre: "+ this.getName());
        System.out.println("Edad "+ this.getAge());
        System.out.println("Salario "+ this.getSalary());
    }

}
