package EjercicioClase09_04.AsociacionUnidireccional;

import EjercicioClase09_04.AsociacionUnidireccional.Clases.Estudiante;
import EjercicioClase09_04.AsociacionUnidireccional.Clases.Universidad;

/*
Asociación unidireccional
En una universidad, se desea modelar la relación entre estudiantes y la universidad a la que asisten.
Cada estudiante está asociado a una única universidad. Implementa un programa en Java que modele esta
relación utilizando clases.
Cada estudiante tiene un nombre y una universidad asociada. La universidad tiene un nombre. El programa debe
permitir crear estudiantes y universidades, asociar un estudiante a una universidad y mostrar en pantalla la
universidad a la que pertenece cada estudiante. Además, debe permitir cambiar la universidad a la que asiste un
estudiante en cualquier momento. Utiliza la asociación entre clases para modelar esta relación.
*/
public class Main {
    public static void main(String[] args) {
        Universidad universidad1 = new Universidad("UTN");
        Universidad universidad2 = new Universidad("UNC");

        Estudiante estudiante1 = new Estudiante("Juan");
        Estudiante estudiante2 = new Estudiante("María");

        estudiante1.setUniversidad(universidad1);
        estudiante2.setUniversidad(universidad2);

        estudiante1.mostrarInformacion();
        estudiante2.mostrarInformacion();

        estudiante1.cambiarUniversidad(universidad2);
        Universidad nuevaUniversidad = estudiante1.getUniversidad();

        estudiante1.mostrarInformacion();
    }
}


