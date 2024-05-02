package EjercicioClase09_04.AsociacionBidireccional.Clases;

import java.util.ArrayList;
import java.util.List;

public class Libro {

    private List<Persona> propietarios = new ArrayList<>();
    private String titulo;

    public Libro(String titulo) {
        this.titulo = titulo;
    }

    public List<Persona> getPropietarios() {
        return propietarios;
    }

    public void setPropietarios(List<Persona> propietarios) {
        this.propietarios = propietarios;
    }

    public String getTitulo() {
        return titulo;
    }

    public void agregarPersona(Persona persona) {
        propietarios.add(persona);
    }

    public void mostrarListaPersonas() {
        System.out.println("Propietarios del libro '" + titulo + "':");
        for (Persona persona : propietarios) {
            System.out.println("- " + persona.getNombre());
        }
    }
}
