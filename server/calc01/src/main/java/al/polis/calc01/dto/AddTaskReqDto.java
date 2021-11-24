package al.polis.calc01.dto;

public class AddTaskReqDto {

    private String task;

    public AddTaskReqDto() {
    }

    public String getTask() {
        return task;
    }

    public void setTask(String task) {
        this.task = task;
    }

    @Override
    public String toString() {
        return "AddTaskReqDto{" + "task=" + task + '}';
    }

}
