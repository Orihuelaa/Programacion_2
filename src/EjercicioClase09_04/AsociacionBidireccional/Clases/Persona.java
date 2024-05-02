package EjercicioClase09_04.AsociacionBidireccional.Clases;

import java.util.ArrayList;
import java.util.List;

public class Persona {

    private List<Libro> libros = new ArrayList<>();
    private String nombre;

    public Persona(String nombre) {
        this.nombre = nombre;
    }

    public List<Libro> getLibros() {
        return libros;
    }

    public void setLibros(List<Libro> libros) {
        this.libros = libros;
    }

    public String getNombre() {
        return nombre;
    }

    public void agregarLibro(Libro libro) {
        this.libros.add(libro);
        libro.agregarPersona(this);
    }

    public void mostrarListaLibros() {
        System.out.println("Libros de " + nombre + ":");
        for (Libro libro : libros) {
            System.out.println("- " + libro.getTitulo());
        }
    }
}
