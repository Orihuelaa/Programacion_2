package Parciales.Parcial1_Practicaa.Clases;

import java.util.ArrayList;
import java.util.List;

public class Test {
    //Atributos
    private int code;
    private String title;
    private List<Athlete> participates;

    //Constructor
    public Test(int code, String title) {
        this.code = code;
        this.title = title;
        this.participates = new ArrayList<>();

    }

    //Getter y Setter
    public int getCode() {
        return code;
    }
    public void setCode(int code) {
        this.code = code;
    }

    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }

    public List<Athlete> getParticipates() {
        return participates;
    }

    public void setParticipates(List<Athlete> participates) {
        this.participates = participates;
    }

    //Metodos
    public void addAthleteToTheTests(Athlete athlete){
        this.participates.add(athlete);

    }

}
