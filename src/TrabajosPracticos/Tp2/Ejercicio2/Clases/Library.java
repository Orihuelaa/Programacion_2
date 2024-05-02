package TrabajosPracticos.Tp2.Ejercicio2.Clases;

import java.util.ArrayList;
import java.util.List;

public class Library {
    private List<Book> books;

    public Library(){
        this.books = new ArrayList<>();
    }
    // Método para agregar un libro a la biblioteca
    public void addBook(Book book) {
        books.add(book);
        System.out.println("El libro '" + book.getTitle() + "' ha sido agregado a la biblioteca.");
    }

    // Método para listar los libros disponibles
    public void listAvailableBooks() {
        System.out.println("Libros disponibles en la biblioteca:");
        for (Book book : books) {
            if (!book.isLended()) {
                System.out.println("Título: " + book.getTitle());
                System.out.println("Autor: " + book.getAuthor());
                System.out.println("Año de publicación: " + book.getPublicationYear());
            }
            if (book instanceof Novel) {
                Novel novel = (Novel) book;
                System.out.println("Género: " + novel.getGenre());
            } else if (book instanceof University) {
                University university = (University) book;
                System.out.println("Campo de estudio: " + university.getFieldOfStudy());
            } else if (book instanceof Child) {
                Child child = (Child) book;
                System.out.println("Edad recomendada: " + child.getAgeRecommended() + " años");
            }
        }
    }

    // Método para prestar un libro
    public void lendBook(String title) {
        for (Book book : books) {
            if (book.getTitle().equals(title)) {
                if (!book.isLended()) {
                    book.toLend();
                    return;
                } else {
                    System.out.println("El libro '" + title + "' ya está prestado.");
                    return;
                }
            }
        }
        System.out.println("El libro '" + title + "' no está disponible en la biblioteca.");
    }

    // Método para devolver un libro
    public void returnBook(String title) {
        for (Book book : books) {
            if (book.getTitle().equals(title)) {
                if (book.isLended()) {
                    book.toReturn();
                    return;
                } else {
                    System.out.println("El libro '" + title + "' no estaba prestado.");
                    return;
                }
            }
        }
        System.out.println("El libro '" + title + "' no pertenece a la biblioteca.");
    }


}
