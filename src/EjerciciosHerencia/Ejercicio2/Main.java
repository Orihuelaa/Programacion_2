package EjerciciosHerencia.Ejercicio2;
/*
1-Crea una clase base llamada "Animal" con los siguientes atributos y métodos:
a. Atributos: nombre, edad, género.
b. Un constructor (__init__) para inicializar los atributos.
c. Métodos:
d. hacer_sonido(): Este método imprimirá "El animal hace un sonido genérico."

2-Crea al menos tres clases derivadas que representen diferentes tipos de animales (por
ejemplo, "Perro", "Gato" y "Pájaro"). Cada una de estas clases debe heredar de la clase
"Animal" y tener atributos y métodos específicos para ese tipo de animal:
a. Agrega atributos adicionales que sean específicos para cada tipo de animal,
como "raza" para el perro o "especie" para el pájaro.
b. Define el método hacer_sonido() para cada clase derivada de manera que
imprima un sonido característico del animal (por ejemplo, "El perro ladra" para
la clase "Perro").
c. Crea un método adicional llamado informacion() que imprimirá la información
sobre el animal, incluyendo los atributos específicos del tipo de animal.

3-Crea instancias de las clases derivadas, configura sus atributos y llama a los métodos
hacer_sonido() e informacion() para comprobar el funcionamiento de la herencia y los
métodos específicos de cada tipo de animal.
 */
public class Main {
    public static void main(String[] args) {
        // Crear instancias de cada tipo de animal
        Perro perro = new Perro("Morita", 5, "Hembra","Salchicha");
        Gato gato = new Gato("Tom", 3, "Macho","Siamés");
        Pajaro pajaro = new Pajaro("Tweetie", 2, "Hembra","Canario de las Indias");

        // Llamar a los métodos hacer_sonido() e informacion() de cada animal
        perro.hacerSonido();
        System.out.println(perro.Informacion());
        System.out.println();

        gato.hacerSonido();
        System.out.println(gato.Informacion());
        System.out.println();

        pajaro.hacerSonido();
        System.out.println(pajaro.Informacion());
    }
}
