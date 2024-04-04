package EjerciciosHerencia.Ejercicio2;

public class Pajaro extends Animal{
    private String especie;
    public Pajaro(String nombre, int edad, String genero,String especie) {
        super(nombre, edad, genero);
        this.especie = especie;
    }

    @Override
    public void hacerSonido() {
        System.out.println("El pájaro trinea");;
    }

    @Override
    public String Informacion() {
        return super.Informacion() + "Especie: " + especie;
    }
}
