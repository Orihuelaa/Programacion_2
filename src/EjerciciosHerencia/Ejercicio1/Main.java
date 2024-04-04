package EjerciciosHerencia.Ejercicio1;

import java.util.ArrayList;
/*
Crea al menos un objeto de cada subclase y añádelos a una lista llamada vehiculos.
Realiza una función llamada catalogar() que reciba la lista de vehiculos y los
recorra mostrando el nombre de su clase y sus atributos.
Modifica la función catalogar() para que reciba un argumento optativo ruedas,
haciendo que muestre únicamente los que su número de ruedas concuerde con el
valor del argumento. También debe mostrar un mensaje "Se han encontrado {}
vehículos con {} ruedas:" únicamente si se envía el argumento ruedas. Ponla a
prueba con 0, 2 y 4 ruedas como valor.
*/

public class Main {
    public static void main(String[] args) {


        // Creaion de instancias
        Coche coche1 = new Coche("Verde", 4, 200, 1200);
        Bicicleta bici1 = new Bicicleta("Azul", 2, "Urbana");
        Camioneta camioneta1 = new Camioneta("Rojo",4,180, 1800, 1500);
        Motocicleta moto1 = new Motocicleta("Negro", 2, "Urbana", 150, 1500);

        // Lista con los Vehiculos
        ArrayList<Vehiculo> listaVehiculos = new ArrayList<>();

        // Añadiendo los objetos a la lista
        listaVehiculos.add(coche1);
        listaVehiculos.add(bici1);
        listaVehiculos.add(camioneta1);
        listaVehiculos.add(moto1);

        Catalogar(listaVehiculos);

        // Probando la función Catalogar con diferentes valores de ruedas
        Catalogar(listaVehiculos, 0);
        Catalogar(listaVehiculos, 2);
        Catalogar(listaVehiculos, 4);
    }

    static void Catalogar(ArrayList<Vehiculo> vehiculos) {
        System.out.println("Vehiculos: \n");
        for (Vehiculo v : vehiculos) {
            System.out.println("Clase: " + v.getClass().getSimpleName());
            System.out.println("Atributos: \n" + v.ObtenerAtributos());
            System.out.println(); // Salto de línea
        }
    }

    static void Catalogar(ArrayList<Vehiculo> vehiculos, int ruedas) {
        // Filtrar los vehículos por el número de ruedas especificado
        ArrayList<Vehiculo> vehiculosFiltrados = new ArrayList<>();
        for (Vehiculo v : vehiculos) {
            if (v.getRuedas() == ruedas) {
                vehiculosFiltrados.add(v);
            }
        }

        // Mostrar un mensaje solo si se proporciona el argumento ruedas
        if (ruedas > 0) {
            System.out.println("Se han encontrado " + vehiculosFiltrados.size() + " vehículos con " + ruedas + " ruedas:");
        }

        // Mostrar los vehículos filtrados
        for (Vehiculo v : vehiculosFiltrados) {
            System.out.println("Clase: " + v.getClass().getSimpleName());
            System.out.println("Atributos: \n" + v.ObtenerAtributos());
            System.out.println(); // Salto de línea
        }
    }
}

