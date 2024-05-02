package TrabajosPracticos.Tp1.Ejercicio10.Clases;

public class Textbook extends Book {
    private String course;

    public Textbook(String title, String author, double price, String course) {
        super(title, author, price);
        this.course = course;
    }

    public String getCourse() {
        return course;
    }
    public void setCourse(String course) {
        this.course = course;
    }

    @Override
    public void Information() {
        super.Information();
        System.out.println("Course: " + this.getCourse());
    }
}
