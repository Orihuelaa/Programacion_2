package EjercicioClase09_04.AsociacionUnidireccional.Clases;

public class Estudiante {

    private String nombre;
    private Universidad universidad;

    public Estudiante(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Universidad getUniversidad() {
        return universidad;
    }

    public void setUniversidad(Universidad universidad) {
        this.universidad = universidad;
    }

    public void mostrarInformacion() {
        System.out.println("Nombre del estudiante: " + nombre);
        if (universidad != null) {
            System.out.println("Universidad: " + universidad.getNombre());
        } else {
            System.out.println("El estudiante no está asociado a ninguna universidad.");
        }
    }
    public Estudiante cambiarUniversidad(Universidad nuevaUniversidad) {
        System.out.println("La universidad de " + nombre + " ha sido cambiada a: " + nuevaUniversidad.getNombre());
        this.universidad = nuevaUniversidad;
        return this;
    }
}
