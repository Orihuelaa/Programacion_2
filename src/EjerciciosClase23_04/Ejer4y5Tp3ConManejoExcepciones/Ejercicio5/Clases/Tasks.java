package EjerciciosClase23_04.Ejer4y5Tp3ConManejoExcepciones.Ejercicio5.Clases;

public class Tasks {
    private String description;
    private int priority;

    public Tasks(String description, int priority) {
        this.description = description;
        this.priority = priority;
    }

    public String getDescription() {
        return description;
    }

    public int getPriority() {
        return priority;
    }

    @Override
    public String toString() {
        return "Tarea{" +
                "Descripcion= '" + description + '\'' +
                ", Prioridad= " + priority +
                '}';
    }
}
