package EjercicioClase14_03;

public class Main {
    public static void main(String[] args) {
        Auto a1 = new Auto("Maxi", 4, 4, true);
        a1.caracteristicas();
        a1.bajar();
        a1.subir();
        System.out.println();

        Camion c1 = new Camion("Valen", 2, 6, 8.8f);
        c1.caracteristicas();
        c1.cargar();
    }
}
