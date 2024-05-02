package EjerciciosClase23_04.Ejer4y5Tp3ConManejoExcepciones.Ejercicio5.Clases;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class TasksList implements Iterable<Tasks> {
    private List<Tasks> tasks;

    public TasksList() {
        tasks = new ArrayList<>();
    }

    public void addTask(Tasks tasks) {
        this.tasks.add(tasks);
        sortByPriority();
    }

    public void removeTask(String description) {
        Iterator<Tasks> iterator = tasks.iterator();
        while (iterator.hasNext()) {
            Tasks tasks = iterator.next();
            if (tasks.getDescription().equals(description)) {
                iterator.remove();
                return;
            }
        }
    }

    public int totalTasks() {
        return tasks.size();
    }

    private void sortByPriority() {
        tasks.sort(Comparator.comparingInt(Tasks::getPriority).reversed());
    }

    @Override
    public Iterator<Tasks> iterator() {
        return tasks.iterator();
    }
}