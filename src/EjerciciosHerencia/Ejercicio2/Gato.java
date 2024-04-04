package EjerciciosHerencia.Ejercicio2;

public class Gato extends Animal{
    private String raza;
    public Gato(String nombre, int edad, String genero,String raza) {
        super(nombre, edad, genero);
        this.raza = raza;
    }

    @Override
    public void hacerSonido() {
        System.out.println("El gato maúlla");;
    }

    @Override
    public String Informacion() {
        return super.Informacion() + "Raza: " + raza;
    }
}
