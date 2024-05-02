package TrabajosPracticos.Tp2.Ejercicio1.Clases;

public class Cat extends Animal {
    private String race;
    private boolean sterilized;

    public Cat(String name, int age, String animalType, double price, String race, boolean sterilized) {
        super(name, age, animalType, price);
        this.race = race;
        this.sterilized = sterilized;
    }

    @Override
    public String toString(){
        return super.toString() + ", Raza: " + race + ", Esterilizado: " + sterilized;
    }
}

