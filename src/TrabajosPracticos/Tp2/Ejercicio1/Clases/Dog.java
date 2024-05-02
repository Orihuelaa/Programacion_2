package TrabajosPracticos.Tp2.Ejercicio1.Clases;

public class Dog extends Animal {
    private String race;
    private boolean vaccinated;

    public Dog(String name, int age, String animalType, double price, String race, boolean vaccinated) {
        super(name, age, animalType, price);
        this.race = race;
        this.vaccinated = vaccinated;
    }
    @Override
    public String toString(){
        return super.toString() + ", Raza: "+ race + ", Vacunado: "+ vaccinated;
    }
}
