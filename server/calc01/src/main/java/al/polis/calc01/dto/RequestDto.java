package al.polis.calc01.dto;

public class RequestDto {

    private double op1;
    private double op2;

    public RequestDto() {
    }

    public double getOp1() {
        return op1;
    }

    public void setOp1(double op1) {
        this.op1 = op1;
    }

    public double getOp2() {
        return op2;
    }

    public void setOp2(double op2) {
        this.op2 = op2;
    }

    @Override
    public String toString() {
        return "RequestDto{" + "op1=" + op1 + ", op2=" + op2 + '}';
    }
    
    
}
