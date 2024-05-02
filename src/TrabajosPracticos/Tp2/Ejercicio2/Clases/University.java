package TrabajosPracticos.Tp2.Ejercicio2.Clases;

public class University extends Book {
    private String fieldOfStudy;


    public University(String title, String author, int publicationYear, String fieldOfStudy) {
        super(title, author, publicationYear);
        this.fieldOfStudy = fieldOfStudy;
    }

    public String getFieldOfStudy() {
        return fieldOfStudy;
    }

    public void setFieldOfStudy(String fieldOfStudy) {
        this.fieldOfStudy = fieldOfStudy;
    }

}

