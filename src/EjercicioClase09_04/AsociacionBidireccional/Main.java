package EjercicioClase09_04.AsociacionBidireccional;
import EjercicioClase09_04.AsociacionBidireccional.Clases.Libro;
import EjercicioClase09_04.AsociacionBidireccional.Clases.Persona;

/*
Asociación bidireccional
Se necesita desarrollar un sistema para gestionar la relación entre personas y libros. Cada persona puede tener
varios libros, y un libro puede ser poseído por varias personas. Implementa un programa en Java que modele esta
relación utilizando clases. Cada persona tiene un nombre y una lista de libros que posee, y cada libro tiene
un título y una lista de personas que lo poseen. El programa debe permitir crear personas y
libros, agregar libros a una persona específica y mostrar en pantalla la lista de libros
de cada persona y la lista de personas que poseen un libro en particular.
Utiliza una relación de asociación bidireccional entre clases para modelar esta estructura.
*/
public class Main {
    public static void main(String[] args) {
        // Crear libros
        Libro libro1 = new Libro("Código Limpio");
        Libro libro2 = new Libro("Java Programming");

        // Crear personas
        Persona persona1 = new Persona("Valen");
        Persona persona2 = new Persona("Maxi");
        Persona persona3 = new Persona("Jose");

        // Asignar libros a personas
        persona1.agregarLibro(libro1);
        persona2.agregarLibro(libro1);
        persona2.agregarLibro(libro2);
        persona3.agregarLibro(libro2);

        // Mostrar lista de libros de cada persona
        persona1.mostrarListaLibros();
        persona2.mostrarListaLibros();
        persona3.mostrarListaLibros();

        //Mostrar lista de personas de cada libro
        libro1.mostrarListaPersonas();
        libro2.mostrarListaPersonas();
    }
}

