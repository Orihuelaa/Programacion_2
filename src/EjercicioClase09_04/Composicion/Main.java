package EjercicioClase09_04.Composicion;
import EjercicioClase09_04.Composicion.Clases.Casa;
/*
Composición
Se requiere diseñar un sistema para modelar casas y sus puertas. Cada casa está compuesta por varias puertas.
Implementa un programa en Java que modele esta relación utilizando clases. Cada puerta tiene un material
específico, y una casa puede tener múltiples puertas, que son creadas automáticamente al momento de construir la
casa. El programa debe permitir crear una casa y mostrar en pantalla los materiales de las puertas que la componen.
Utiliza la relación de composición entre clases para modelar esta estructura.
*/
public class Main {
    public static void main(String[] args) {
        // Crear una instancia de Casa
        Casa casa1 = new Casa();

        // Agregar puertas a la casa
        casa1.agregarPuerta("Madera");
        casa1.agregarPuerta("Metal");
        casa1.agregarPuerta("Vidrio");

        // Mostrar los materiales de las puertas en la casa
        casa1.mostrarMaterialesPuertas();
    }
}
