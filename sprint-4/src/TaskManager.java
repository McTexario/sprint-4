import java.util.ArrayList;
import java.util.List;
public class TaskManager {

    final List<Task> tasks;

    public TaskManager() {
        this.tasks = new ArrayList<>();
    }

    public void addTask(Task task) {
        tasks.add(task);
    }

    public List<Task> getAllTasks() {
        return tasks;
    }

    public void updateTask(Task task) {
        for (int i = 0; i < tasks.size(); i++) {
            if (tasks.get(i).getId() == task.getId()) {
                tasks.set(i, task);
                break;
            }
        }
    }

    public void calculateEpicStatus(Epic epic) {
        int completedSubtasks = 0;
        for (Subtask subtask : epic.getSubtasks()) {
            if (subtask.getStatus() == Status.COMPLETED) {
                completedSubtasks++;
            }
        }

        if (completedSubtasks == epic.getSubtasks().size()) {
            epic.setStatus(Status.COMPLETED);
        } else if (completedSubtasks > 0) {
            epic.setStatus(Status.IN_PROGRESS);
        } else {
            epic.setStatus(Status.NEW);
        }
    }
}
