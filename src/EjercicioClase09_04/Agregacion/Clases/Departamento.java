package EjercicioClase09_04.Agregacion.Clases;

import java.util.ArrayList;
import java.util.List;

public class Departamento {

    //Atributos
    private List<Empleado> empleados  ;
    private String nombre;

    //Constructor
    public Departamento(String nombre) {
        this.empleados = new ArrayList<>();
        this.nombre = nombre;
    }

    //Getter y Setter
    public List<Empleado> getEmpleados() {
        return empleados;
    }

    public void setEmpleados(List<Empleado> empleados) {
        this.empleados = empleados;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


    public void agregarEmpleado(Empleado empleado){
        this.empleados.add(empleado);
    }

    public void mostrarEmpleados() {
        System.out.println("Empleados del departamento " + nombre + ":");
        for (Empleado empleado : empleados) {
            System.out.println("- Nombre: " + empleado.getNombre() + ", Cargo: " + empleado.getCargo());
        }
    }

}
