package TrabajosPracticos.Tp2.Ejercicio2.Clases;

import TrabajosPracticos.Tp2.Ejercicio2.Interfaces.Loanable;

public class Book implements Loanable {
    private String title;
    private String author;
    private int publicationYear;
    private boolean lended;

    public Book(String title, String author, int publicationYear) {
        this.title = title;
        this.author = author;
        this.publicationYear = publicationYear;
        this.lended = false;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getPublicationYear() {
        return publicationYear;
    }

    public void setPublicationYear(int publicationYear) {
        this.publicationYear = publicationYear;
    }

    public boolean isLended() {
        return lended;
    }

    public void setLended(boolean lended) {
        this.lended = lended;
    }
    @Override
    public void toLend(){
        if (!lended) {
            lended = true;
            System.out.println("El libro '" + title + "' ha sido prestado.");
        } else {
            System.out.println("El libro '" + title + "' ya está prestado.");
        }
    }
    @Override
    public void toReturn(){
        if (lended) {
            lended = false;
            System.out.println("El libro '" + title + "' ha sido devuelto.");
        } else {
            System.out.println("El libro '" + title + "' no estaba prestado.");
        }
    }

}
