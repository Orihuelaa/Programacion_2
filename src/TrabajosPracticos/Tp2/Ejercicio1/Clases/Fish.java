package TrabajosPracticos.Tp2.Ejercicio1.Clases;

public class Fish extends Animal {
    private String waterType;
    private String reproduction;
    private int numberOfFlippers;

    public Fish(String name, int age, String animalType, double price, String waterType,String reproduction, int numberOfFlippers) {
        super(name, age, animalType, price);
        this.waterType = waterType;
        this.reproduction = reproduction;
        this.numberOfFlippers = numberOfFlippers;
    }

    @Override
    public String toString() {
        return super.toString() + ", Tipo de Agua: " + waterType + ", Reproducción: " + reproduction + ", Número de Aletas: "+ numberOfFlippers;

    }
}
