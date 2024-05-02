package EjercicioClase09_04.Agregacion.Clases;

public class Empleado {

    // Atributos
    private String cargo;
    private String nombre;

    // Constructor
    public Empleado(String cargo, String nombre) {
        this.cargo = cargo;
        this.nombre = nombre;
    }

    // Getter y Setter para cargo y nombre
    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}