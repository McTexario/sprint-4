import java.util.ArrayList;
import java.util.List;
public class Epic extends Task {

    final List<Subtask> subtasks;

    public Epic(int id, String title, String description, Status status) {
        super(id, title, description, status);
        this.subtasks = new ArrayList<>();
    }

    public List<Subtask> getSubtasks() {
        return subtasks;
    }

    public void addSubtask(Subtask subtask) {
        subtasks.add(subtask);
    }

    @Override
    public String toString() {
        return String.format("%s{id=%d, title='%s', description='%s', status=%s, subtasks=%s}",
                this.getClass().getSimpleName(), getId(), getTitle(), getDescription(), getStatus(), subtasks);
    }
}
