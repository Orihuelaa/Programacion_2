package TrabajosPracticos.Tp2.Ejercicio1;

import TrabajosPracticos.Tp2.Ejercicio1.Clases.*;

/*Desarrollar un sistema para gestionar una tienda de mascotas que vende diferentes tipos de
animales: perros, gatos, aves.
     a. Clases:
        i. Animal: nombre (String), edad (int), tipoAnimal (String), precio (double). Método
            Alimentar(String nombre). Sobreescribir el método toString() para que devuelva una
             pequeña presentación del animal.
        ii. Perro: raza (String), vacunado (boolean). Hereda de Animal.
        iii. Gato: raza (String), esterilizado (boolean). Hereda de Animal.
        iv. Ave: especie (String), habla(boolean). Hereda de Animal.
        v. Crear también una clase Pez con los atributos que creas necesarios. Hereda de Animal.
Desarrollá las clases especificadas anteriormente y crea una nueva clase TiendaMascotas para
gestionar todas las demás. Esta debe tener los métodos:
o addAnimal(Animal animal): Agrega un animal a la tienda.
o venderAnimal(String nombre): Vende un animal por nombre.
o alimentarAnimal(String nombre): Alimenta a un animal por nombre.
o listarAnimales(): Lista todos los animales de la tienda.
En el main crea una tienda, un animal de cada clase y utilizá todos los métodos definidos.
*/
public class Main {
    public static void main(String[] args) {
        PetShop petShop = new PetShop();

        Dog dog1 = new Dog("Morita", 1, "Perro", 20000, "Salchicha", true);
        Cat cat1 = new Cat("Manchita",3,"Gato", 15000,"Siamés",false);
        Bird bird1 = new Bird("Tweety",2,"Ave",10000, "Canario",true);
        Fish fish1 = new Fish("Nemo",1, "Pez",5000,"Agua Salada", "Ovíparo",2);

        // Agregar animales a la tienda
        petShop.addAnimal(dog1);
        petShop.addAnimal(cat1);
        petShop.addAnimal(bird1);
        petShop.addAnimal(fish1);

        // Listar animales
        petShop.listAnimals();

        // Vender un animal
        petShop.sellAnimal("Morita");

        // Alimentar un animal
        petShop.feedAnimal("Manchita");

        // Listar animales después de vender
        petShop.listAnimals();

    }
}
