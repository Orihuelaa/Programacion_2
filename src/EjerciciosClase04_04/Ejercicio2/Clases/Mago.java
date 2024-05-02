package EjerciciosClase04_04.Ejercicio2.Clases;

import java.util.Random;

public class Mago extends PersonajeBase {
    // Probabilidad de activación de la defensa especial
    private static final double PROBABILIDAD_DEFENSA_ESPECIAL = 0.5;
    //Esta constante se declara como private para restringir su acceso solo a la clase en la que se declara.
    //Se declara como static para que pertenezca a la clase en lugar de a una instancia específica de la clase.
    //Y se declara como final para indicar que su valor no puede cambiar una vez que se ha asignado.

    public Mago(String nombre, int puntosVida, int nivel) {
        super(nombre, puntosVida, nivel);
    }

    // Implementación del método atacar para el Mago
    public int atacar() {
        // Aquí puedes definir la lógica de ataque del mago
        return 8 * getNivel(); // Definimos que el mago inflige 8 puntos de daño por nivel
    }
    @Override
    // Implementación del método calcularDanioReal para el Mago
    protected int calcularDanioReal(int danio) {
        Random random = new Random();
        // El mago puede tener una defensa mágica que reduce el daño recibido
        if (random.nextDouble() < PROBABILIDAD_DEFENSA_ESPECIAL){
            // Defensa especial activada
            System.out.println("¡Defensa especial del Mago activada!");
            return (danio / 2); // Definimos que el mago reduce el daño a la mitad
        } else {
            // Recibe daño normal
            return (danio);
        }
    }
}
