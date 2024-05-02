package TrabajosPracticos.Tp1.Ejercicio10.Clases;

public class Novel extends Book {

    private Type type;

    public Novel(String title, String author, double price, Type type) {
        super(title, author, price);
        this.type = type;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    @Override
    public void Information() {
        super.Information();
        System.out.println("Type of novel: " + this.getType());
    }
}