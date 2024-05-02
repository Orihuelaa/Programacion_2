package TrabajosPracticos.Tp1.Ejercicio10;

import TrabajosPracticos.Tp1.Ejercicio10.Clases.*;

/*
Definir una clase Libro para manejar la información asociada a un libro. La información de interés para un libro es: el título,
el autor y el precio. Los métodos de interés son:
Un constructor para crear un objeto libro, con título y autor como parámetros.
Imprimir en pantalla el título, los autores y el precio del libro.
Métodos get y set para cada atributo de un libro.

Se debe extender la clase Libro definiendo las siguientes clases:
Libros de texto con un nuevo atributo que especifica el curso al cual está asociado el libro.
Libros de texto de la Universidad Nacional de Colombia: subclase de la clase anterior. Esta subclase tiene un atributo
que especifica cuál facultad lo publicó.
Novelas: pueden ser de diferente tipo, histórica, romántica, policíaca, realista, ciencia ficción o aventuras.
Para cada una de las clases anteriores se debe definir su constructor y redefinir adecuadamente el método para visualizar del objeto.
*/
public class Main {
    public static void main(String[] args) {
        // Crear instancias de Libro
        Book book1 = new Book("El principito", "Antoine de Saint-Exupéry", 10.99);
        Book book2 = new Book("Harry Potter y la piedra filosofal", "J.K. Rowling", 15.50);

        // Imprimir información de los libros
        System.out.println("Libros:");
        book1.Information();
        System.out.println();
        book2.Information();
        System.out.println();

        // Crear instancias de LibroTexto
        Textbook textbook1 = new Textbook("Matemáticas 1", "Juan Pérez", 25.99, "Primer semestre");
        Textbook textbook2 = new Textbook("Historia Universal", "María Gómez", 30.50, "Segundo semestre");

        // Imprimir información de los libros de texto
        System.out.println("Libros de texto:");
        textbook1.Information();
        System.out.println();
        textbook2.Information();
        System.out.println();

        // Crear instancias de LibroTextoUNAL
        TextbookUNAL textbookUNAL1 = new TextbookUNAL("Física 2", "Carlos Ramírez", 35.75, "Tercer semestre", "Ingeniería");
        TextbookUNAL textbookUNAL2 = new TextbookUNAL("Química Orgánica", "Ana López", 40.20, "Cuarto semestre", "Ciencias Naturales");

        // Imprimir información de los libros de texto de la UNAL
        System.out.println("Libros de texto de la UNAL:");
        textbookUNAL1.Information();
        System.out.println();
        textbookUNAL2.Information();
        System.out.println();

        // Crear instancias de Novela
        Novel novel1 = new Novel("Cien años de soledad", "Gabriel García Márquez", 15.99, Type.Realista);
        Novel novel2 = new Novel("El código Da Vinci", "Dan Brown", 20.50, Type.Policiaca);

        // Imprimir información de las novelas
        System.out.println("Novelas:");
        novel1.Information();
        System.out.println();
        novel2.Information();
    }
}
