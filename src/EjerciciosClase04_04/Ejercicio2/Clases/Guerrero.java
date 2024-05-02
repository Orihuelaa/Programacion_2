package EjerciciosClase04_04.Ejercicio2.Clases;

public class Guerrero extends PersonajeBase {

    public Guerrero(String nombre, int puntosVida, int nivel) {
        super(nombre, puntosVida, nivel);
    }
    // Implementación del método atacar para el Guerrero
    public int atacar() {
        // Definimos la lógica de ataque del guerrero
        return 10 * getNivel(); // Definimos que el guerrero inflige 10 puntos de daño por nivel
    }
    @Override
    // Implementación del método calcularDanioReal para el Guerrero
    protected int calcularDanioReal(int danio) {
        // El guerrero no tiene una defensa especial, simplemente reduce los puntos de vida
        return(danio);
    }
}
