public class Subtask extends Task {

    final Epic epic;

    public Subtask(int id, String title, String description, Status status, Epic epic) {
        super(id, title, description, status);
        this.epic = epic;
    }

    @Override
    public String toString() {
        return String.format("%s{id=%d, title='%s', description='%s', status=%s, epic=%d}",
                this.getClass().getSimpleName(), getId(), getTitle(), getDescription(), getStatus(), epic.getId());
    }
}
