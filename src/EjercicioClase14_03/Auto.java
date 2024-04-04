package EjercicioClase14_03;
public class Auto extends Vehiculo {
    private boolean descapotable;
    public Auto(){}
    public Auto(String dueno, int puertas, int ruedas, boolean descapotable) {
        super(dueno, puertas, ruedas);
        this.descapotable = descapotable;
    }
    public boolean isDescapotable() {
        return descapotable;
    }

    public void setDescapotable(boolean descapotable) {
        this.descapotable = descapotable;
    }

    @Override
    public void caracteristicas() {
        System.out.println("Propietario: " + getDueno());
        System.out.println("Número de puertas: " + getPuertas());
        System.out.println("Número de ruedas: " + getRuedas());
        System.out.println("Descapotable: " + descapotable);
    }
    void bajar() {
        if (descapotable) {
            System.out.println("Bajando el techo del auto.");
        }else {
            System.out.println("El auto no es descapotable");
        }
    }
    void subir() {
        if (descapotable) {
            System.out.println("Subiendo el techo del auto.");
        } else {
            System.out.println("El auto no es descapotable");
        }
    }

}

