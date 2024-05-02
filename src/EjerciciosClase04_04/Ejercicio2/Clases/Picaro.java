package EjerciciosClase04_04.Ejercicio2.Clases;

import java.util.Random;

public class Picaro extends PersonajeBase {
    // Probabilidad de activación de la defensa especial
    private static final double PROBABILIDAD_DEFENSA_ESPECIAL = 0.3;
    public Picaro(String nombre, int puntosVida, int nivel) {
        super(nombre, puntosVida, nivel);
    }
    // Implementación del método atacar para el Pícaro
    public int atacar() {
        // Aquí puedes definir la lógica de ataque del pícaro
        return 7 * getNivel(); // Supongamos que el pícaro inflige 7 puntos de daño por nivel
    }

    @Override
    // Implementación del método calcularDanioReal para el Pícaro
    protected int calcularDanioReal(int danio) {
        Random random = new Random();
        // El pícaro puede tener una habilidad de esquiva que reduce el daño recibido
        if (random.nextDouble() < PROBABILIDAD_DEFENSA_ESPECIAL){
            // Defensa especial activada
            System.out.println("¡Defensa especial del Pícaro activada!");
            return (danio / 3); // // Definimos que el pícaro reduce el daño en un tercio

        } else {
            // Recibe daño normal
            return (danio);
        }
    }

}

