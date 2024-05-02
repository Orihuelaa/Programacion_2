package Parciales.Parcial1_Practicaa;

import Parciales.Parcial1_Practicaa.Clases.*;

import java.util.ArrayList;
import java.util.List;


public class Main {
    public static void main(String[] args) {
        Athlete athlete1 = new Athlete("Maxon", 46897125, 25, 1.80, 75.5);
        Athlete athlete2 = new Athlete("Valen", 44642831, 30, 1.75, 80.0);
        Athlete athlete3 = new Athlete("Jose", 44556321, 28, 1.85, 90.0);
        Athlete athlete4 = new Athlete("Maxi", 46298741, 26, 1.65, 65.6);
        Athlete athlete5 = new Athlete("Franco", 44897407, 23, 1.70, 87.6);
        Athlete athlete6 = new Athlete("Joaquin", 43963258, 22, 1.75, 74.0);

        NationalTeam nationalTeam1 = new NationalTeam("Rojo", "Argentina");
        NationalTeam nationalTeam2 = new NationalTeam("Azul y Blanco", " Brazil");
        NationalTeam nationalTeam3 = new NationalTeam("Verde y Amarillo", "Peru");

        Test test1 = new Test(1, "Salto de altura");
        Test test2 = new Test(2, "Carrera de 100 metros");

        Facility facility1 = new Facility("Piscina", "Ciudad Deportiva", "Piscina Olímpica", "Acuática");
        Facility facility2 = new Facility("Pista", "Estadio Nacional", "Pista de Atletismo", "Atletismo");

        Headquarters headquarters1 = new Headquarters("2024-05-02", "08:00 a 11:00", 1);
        Headquarters headquarters2 = new Headquarters("2024-06-05", "08:00 a 12:00", 2);

        // Agregar atletas al equipo nacional
        nationalTeam1.addAthlete(athlete1);
        nationalTeam1.addAthlete(athlete2);
        nationalTeam2.addAthlete(athlete3);
        nationalTeam2.addAthlete(athlete4);
        nationalTeam3.addAthlete(athlete5);
        nationalTeam3.addAthlete(athlete6);


        // Agregar atletas a las pruebas
        test1.addAthleteToTheTests(athlete1);
        test2.addAthleteToTheTests(athlete2);
        test1.addAthleteToTheTests(athlete3);
        test2.addAthleteToTheTests(athlete4);
        test1.addAthleteToTheTests(athlete5);
        test2.addAthleteToTheTests(athlete6);


        // Agregar pruebas a las sedes
        headquarters1.addTest(test1);
        headquarters1.addTest(test2);
        headquarters2.addTest(test2);


        //Agregar Instalaciones a las sedes
        headquarters1.addFacility(facility1);
        headquarters2.addFacility(facility2);

        // Mostrar: Desde un objeto Instalacion: Nombre del 3er atleta de la 2da prueba.
        Facility facility = headquarters1.getWhere().get(0); //Suponemos la primer instlacion ya preestablecida.
        System.out.println("Nombre del tercer atleta de la segunda prueba: \nInstalacion: " + facility.getName() + "\nNombre: " + headquarters1.getIsMode().get(1).getParticipates().get(2).getName());
        // Mostrar: Desde un objeto Instalacion: Código de la 2da prueba.
        System.out.println("Codigo de la segunda prueba: \nInstalacion: " + facility.getName() + "\nCodigo: " + headquarters1.getIsMode().get(1).getCode());
        //Mostrar: Desde un objeto EquipoNacional: Altura de todos los atletas
        System.out.println("Altura de los atletas del equipo nacional");
        List<NationalTeam> nationalTeams = new ArrayList<>();
        nationalTeams.add(nationalTeam1);
        nationalTeams.add(nationalTeam2);
        nationalTeams.add(nationalTeam3);
        for(NationalTeam nationalTeam : nationalTeams){
            System.out.println("Equipo Nacional: "+nationalTeam.getColor());
            for (int i = 0; i < 2; i++) {
                System.out.println("Nombre del Atleta: " + nationalTeam.getBelongs().get(i).getName());
                System.out.println("Altura: "+nationalTeam.getBelongs().get(i).getHeight());
            }
        }
        // Mostrar: Desde un objeto EquipoNacional: Peso extra de cada atleta.
        System.out.println("Peso extra de cada atleta:");
        for (NationalTeam nationalTeam:nationalTeams) {
            for (int i = 0; i < 2; i++) {
                System.out.println("Nombre del Atleta: " + nationalTeam.getBelongs().get(i).getName());
                if (nationalTeam.getBelongs().get(i).isExtraWeight(nationalTeam.getBelongs().get(i).calculateBMI())) {
                    System.out.println("Tiene peso extra.");
                } else {
                    System.out.println("No tiene peso extra.");
                }
            }
        }

    }
}
