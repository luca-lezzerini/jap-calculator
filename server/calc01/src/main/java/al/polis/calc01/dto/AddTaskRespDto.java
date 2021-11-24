package al.polis.calc01.dto;

import java.util.ArrayList;
import java.util.List;

public class AddTaskRespDto {

    private List<String> tasks = new ArrayList<>();

    public AddTaskRespDto() {
    }

    public List<String> getTasks() {
        return tasks;
    }

    public void setTasks(List<String> tasks) {
        this.tasks = tasks;
    }

    @Override
    public String toString() {
        return "AddTaskRespDto{" + "tasks=" + tasks + '}';
    }
    
}
