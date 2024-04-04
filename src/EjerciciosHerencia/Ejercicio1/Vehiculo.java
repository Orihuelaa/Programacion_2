package EjerciciosHerencia.Ejercicio1;

public abstract class Vehiculo {
    private String color;
    private int ruedas;

    public Vehiculo(String color, int ruedas) {
        this.color = color;
        this.ruedas = ruedas;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getRuedas() {
        return ruedas;
    }

    public void setRuedas(int ruedas) {
        this.ruedas = ruedas;
    }

    public String ObtenerAtributos(){
        return "Color: " + color + "\nRuedas: " + ruedas + "\n";
    }
}

