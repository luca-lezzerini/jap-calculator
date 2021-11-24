package al.polis.calc01.dto;

public class RemoveTaskReqDto {

    private Integer taskIndex;

    public RemoveTaskReqDto() {
    }

    public Integer getTaskIndex() {
        return taskIndex;
    }

    public void setTaskIndex(Integer taskIndex) {
        this.taskIndex = taskIndex;
    }

    @Override
    public String toString() {
        return "RemoveTaskReqDto{" + "taskIndex=" + taskIndex + '}';
    }

}
