package EjerciciosClase21_03.Ejercicio2;

public abstract class Canino extends Animal{
    public Canino(String foto, String comida, String localizacion, String tamano) {
        super(foto, comida, localizacion, tamano);
    }
    @Override
    public void rugir(){
        System.out.println("El canino Ruge");
    }
}
