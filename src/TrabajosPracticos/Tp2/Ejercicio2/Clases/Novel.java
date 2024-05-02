package TrabajosPracticos.Tp2.Ejercicio2.Clases;

public class Novel extends Book {
    private String genre;

    public Novel(String title, String author, int publicationYear, String genre) {
        super(title, author, publicationYear);
        this.genre = genre;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

}
