package EjerciciosClase04_04.Ejercicio2.Clases;

import EjerciciosClase04_04.Ejercicio2.Interfaces.Personaje;

public abstract class PersonajeBase implements Personaje {
    private String nombre;
    private int nivel;
    private int puntosVida;

    public PersonajeBase(String nombre, int puntosVida, int nivel) {
        this.nombre = nombre;
        this.puntosVida = puntosVida;
        this.nivel = nivel;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public int getPuntosVida() {
        return puntosVida;
    }

    public void setPuntosVida(int puntosVida) {
        this.puntosVida = puntosVida;
    }

    // Método para reducir los puntos de vida del personaje después de recibir daño
    @Override
    public void defender(int danio) {
        // Calcula el daño real después de la defensa
        int danioReal = calcularDanioReal(danio);
        // Reduce los puntos de vida del personaje
        puntosVida -= danioReal;
        // Asegura que los puntos de vida no sean negativos
        if (puntosVida < 0) {
            puntosVida = 0;
        }
    }
    // Método para calcular el daño real después de la defensa
    protected int calcularDanioReal(int danio){
        return 0;
    }
}
