package EjercicioClase14_03;

public class Camion extends Vehiculo {
    private float carga;
    public Camion(){}
    public Camion(String dueno, int puertas, int ruedas, float carga) {
        super(dueno, puertas, ruedas);
        this.carga = carga;
    }
    public float getCarga() {
        return carga;
    }

    public void setCarga(float carga) {
        this.carga = carga;
    }

    @Override
    public void caracteristicas() {
        System.out.println("Propietario: " + getDueno());
        System.out.println("Número de puertas: " + getPuertas());
        System.out.println("Número de ruedas: " + getRuedas());
        System.out.println("Capacidad de carga: " + carga + " toneladas");
    }

    public void cargar() {
        System.out.println("Cargando el camión.");
    }
}
