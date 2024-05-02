package Parciales.Parcial1_Practicaa.Clases;

import java.util.ArrayList;
import java.util.List;

public class Headquarters {
    private String date;
    private String hour;
    private int phase;
    private List<Test> isMode;
    private List<Facility> where;


    public Headquarters(String date, String hour, int phase) {
        this.date = date;
        this.hour = hour;
        this.phase = phase;
        this.isMode = new ArrayList<>();
        this.where = new ArrayList<>();

    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getHour() {
        return hour;
    }

    public void setHour(String hour) {
        this.hour = hour;
    }

    public int getPhase() {
        return phase;
    }

    public void setPhase(int phase) {
        this.phase = phase;
    }

    public List<Test> getIsMode() {
        return isMode;
    }

    public void setIsMode(List<Test> isMode) {
        this.isMode = isMode;
    }

    public List<Facility> getWhere() {
        return where;
    }

    public void setWhere(List<Facility> where) {
        this.where = where;
    }

    // Metodos
    public void addTest(Test test){
        this.isMode.add(test);
    }
    public void addFacility(Facility facility){
        this.where.add(facility);
    }


}

