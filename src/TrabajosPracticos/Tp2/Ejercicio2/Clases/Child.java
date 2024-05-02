package TrabajosPracticos.Tp2.Ejercicio2.Clases;

public class Child extends Book {
    private int ageRecommended;

    public Child(String title, String author, int publicationYear, int ageRecommended) {
        super(title, author, publicationYear);
        this.ageRecommended = ageRecommended;
    }

    public int getAgeRecommended() {
        return ageRecommended;
    }

    public void setAgeRecommended(int ageRecommended) {
        this.ageRecommended = ageRecommended;
    }


}

