package al.polis.calc01.dto;

public class ResultDto {

    private double result;

    public ResultDto() {
    }

    public double getResult() {
        return result;
    }

    public void setResult(double result) {
        this.result = result;
    }

    @Override
    public String toString() {
        return "ResultDto{" + "result=" + result + '}';
    }

}
