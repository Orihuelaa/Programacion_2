package TrabajosPracticos.Tp2.Ejercicio2;

import TrabajosPracticos.Tp2.Ejercicio2.Clases.Child;
import TrabajosPracticos.Tp2.Ejercicio2.Clases.Library;
import TrabajosPracticos.Tp2.Ejercicio2.Clases.Novel;
import TrabajosPracticos.Tp2.Ejercicio2.Clases.University;
/*
Desarrollar un sistema de gestión para una biblioteca.
    a-Definir una clase Libro con los atributos título (String), autor (String), añoDePublicacion (int),
     prestado (boolean). Podés crear más atributos si lo considerás necesario.
    b-Crea una interfaz llamada Prestable con los métodos prestar() y devolver().
    c-Libro debe implementar esta interfaz y se deben definir los métodos para cambiar el estado del libro.
    d-Crear las clases Novela, Universitario, Infantil que hereden de Libro. Agregá a cada clase un atributo
     propio (o más, si te parece necesario).
    e-Definir la clase Biblioteca, que contenga una lista de libros y métodos para agregar un libro, listar los
     libros disponibles, prestar un libro, devolver un libro.
En el main crea una biblioteca, un libro de cada clase y utilizá todos los métodos definidos.
*/
public class Main {
    public static void main(String[] args) {
        // Crear biblioteca
        Library library = new Library();

        // Crear libros de cada clase
        Novel novel = new Novel("Cien años de soledad", "Gabriel García Márquez", 1967, "Realismo mágico");
        University university = new University("Introducción a la inteligencia artificial", "Stuart Russell, Peter Norvig", 1995, "Inteligencia Artificial");
        Child child = new Child("Harry Potter y la piedra filosofal", "J.K. Rowling", 1997, 10);

        // Agregar libros a la biblioteca
        library.addBook(novel);
        library.addBook(university);
        library.addBook(child);

        // Listar libros disponibles
        library.listAvailableBooks();

        // Prestar un libro
        library.lendBook("Cien años de soledad");
        library.lendBook("Cien años de soledad");

        // Devolver un libro
        library.returnBook("Cien años de soledad");
    }
}
