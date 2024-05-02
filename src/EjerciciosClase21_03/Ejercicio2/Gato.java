package EjerciciosClase21_03.Ejercicio2;

public class Gato extends Felino {
    public Gato(String foto, String comida, String localizacion, String tamano) {
        super(foto, comida, localizacion, tamano);
    }
    @Override
    public void comer(){
        System.out.println("El dueño llena el plato");
    }
    @Override
    public void hacerRuido(){
        System.out.println("Miauuu");
    }

    public void vacunar(){
        System.out.println("Lo llevan a la veterinaria");
    }
}

