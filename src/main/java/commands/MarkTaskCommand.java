package commands;

import exceptions.DukeException;
import files.Storage;
import tasks.TaskList;
import ui.Ui;

public class MarkTaskCommand extends Command {
    private String taskIndex;

    public MarkTaskCommand(String taskIndex) {
        this.taskIndex = taskIndex;
    }


    @Override
    public boolean isExit() {
        return false;
    }

    @Override
    public void execute(TaskList taskList, Ui ui, Storage storage) {
        try {
            taskList.markTask(this.taskIndex);
        } catch (DukeException e) {
            System.out.println(e.getMessage());
        }

    }
}