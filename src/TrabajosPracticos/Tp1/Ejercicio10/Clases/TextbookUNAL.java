package TrabajosPracticos.Tp1.Ejercicio10.Clases;

// UNAL (Universidad Nacional de Colombia)
public class TextbookUNAL extends Textbook {

    private String faculty;

    public TextbookUNAL(String title, String author, double price, String course, String faculty) {
        super(title, author, price, course);
        this.faculty = faculty;
    }
    public String getFaculty() {
        return faculty;
    }
    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    @Override
    public void Information() {
        super.Information();
        System.out.println("Faculty: " + this.getFaculty());
    }
}
