import java.util.*;

public class TaskManager {
    public static void main(String[] args) {
        PriorityQueue<Task> tasks = new PriorityQueue<>(Comparator.comparingInt(Task::getPriority));

        tasks.add(new Task("Fix bug", 2));
        tasks.add(new Task("Write report", 1));
        tasks.add(new Task("Deploy update", 3));

        System.out.println("Highest priority task: " + tasks.poll());
        System.out.println("Remaining tasks: " + tasks);
    }
}

class Task {
    String name;
    int priority;

    public Task(String name, int priority) {
        this.name = name;
        this.priority = priority;
    }

    public int getPriority() {
        return priority;
    }

    public String toString() {
        return name + " (Priority: " + priority + ")";
    }
}
