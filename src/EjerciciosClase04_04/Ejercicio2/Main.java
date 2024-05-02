package EjerciciosClase04_04.Ejercicio2;

import EjerciciosClase04_04.Ejercicio2.Clases.Guerrero;
import EjerciciosClase04_04.Ejercicio2.Clases.Mago;
import EjerciciosClase04_04.Ejercicio2.Clases.Picaro;

public class Main {
    public static void main(String[] args) {
        // Crear instancias de guerrero, mago y pícaro
        Guerrero guerrero = new Guerrero("Guerrero", 700, 50);
        Mago mago = new Mago("Mago", 500, 40);
        Picaro picaro = new Picaro("Pícaro", 600, 45);

        // Simular enfrentamiento
        System.out.println("Inicio del enfrentamiento:");
        System.out.println("Guerrero vs Mago:");
        int danio = mago.atacar();
        guerrero.defender(danio);
        System.out.println(guerrero.getNombre() + " recibe " + danio + " puntos de daño. Puntos de vida restantes: " + guerrero.getPuntosVida());

        System.out.println("Mago vs Pícaro:");
        danio = picaro.atacar();
        mago.defender(danio);
        System.out.println(mago.getNombre() + " recibe " + danio + " puntos de daño. Puntos de vida restantes: " + mago.getPuntosVida());

        System.out.println("Pícaro vs Guerrero:");
        danio = guerrero.atacar();
        picaro.defender(danio);
        System.out.println(picaro.getNombre() + " recibe " + danio + " puntos de daño. Puntos de vida restantes: " + picaro.getPuntosVida());
    }
}
