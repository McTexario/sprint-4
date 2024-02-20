public class Main {

    public static void main(String[] args) {
        TaskManager taskManager = new TaskManager();

        // Создание эпика
        Epic epic = new Epic(1, "Epic 1", "Description of Epic 1", Status.NEW);

        // Создание подзадач
        Subtask subtask1 = new Subtask(2, "Subtask 1", "Description of Subtask 1", Status.NEW, epic);
        Subtask subtask2 = new Subtask(3, "Subtask 2", "Description of Subtask 2", Status.NEW, epic);

        // Добавление подзадач в эпик
        epic.addSubtask(subtask1);
        epic.addSubtask(subtask2);

        // Добавление эпика и подзадач в менеджер задач
        taskManager.addTask(epic);
        taskManager.addTask(subtask1);
        taskManager.addTask(subtask2);

        // Вывод всех задач
        System.out.println("Все задачи:");
        for (Task task : taskManager.getAllTasks()) {
            System.out.println(task);
        }

        // Обновление статуса подзадачи
        subtask1.setStatus(Status.COMPLETED);
        taskManager.updateTask(subtask1);

        // Пересчет статуса эпика
        taskManager.calculateEpicStatus(epic);

        // Вывод обновленных задач
        System.out.println("\nОбновленные задачи:");
        for (Task task : taskManager.getAllTasks()) {
            System.out.println(task);
        }
    }
}
