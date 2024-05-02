package TrabajosPracticos.Tp2.Ejercicio1.Clases;

import java.util.ArrayList;
import java.util.List;

public class PetShop {
    private List<Animal> animals;

    public PetShop() {
        animals = new ArrayList<>();
    }
    public void addAnimal(Animal animal){
        animals.add(animal);
        System.out.println("Se ha agregado un nuevo animal a la tienda: " + animal.getName());
    }
    public void sellAnimal(String nombre){
        for (Animal animal: animals){
            if (animal.getName().equals(nombre)){
                animals.remove(animal);
                System.out.println("Se ha vendido el animal: " + animal.getName());
                return;
            }
        }
        System.out.println("No se encontró ningún animal con el nombre: " + nombre);
    }
    public void feedAnimal(String nombre) {
        for (Animal animal : animals){
            if (animal.getName().equals(nombre)) {
                animal.feed(animal.getName());
                return;
            }
        }
        System.out.println("No se encontró ningún animal con el nombre: " + nombre);
    }
    public void listAnimals() {
        System.out.println("Animales de la Tienda");
        for (Animal animal : animals) {
            System.out.println(animal);
        }
    }

}
