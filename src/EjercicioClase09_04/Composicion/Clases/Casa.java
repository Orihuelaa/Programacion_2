package EjercicioClase09_04.Composicion.Clases;

import java.util.ArrayList;
import java.util.List;

public class Casa {

    // Atributos
    private List<Puerta> puertas;

    // Constructor
    public Casa() {
        this.puertas = new ArrayList<>();
    }

    // Métodos
    public void agregarPuerta(String material) {
        Puerta puerta = new Puerta(material);
        puertas.add(puerta);
    }

    public void mostrarMaterialesPuertas() {
        System.out.println("Materiales de las puertas en la casa:");
        for (Puerta puerta : puertas) {
            System.out.println("- " + puerta.getMaterial() + ".");
        }
    }
}