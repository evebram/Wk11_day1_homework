public class Calculator {
    private double value1;
    private double value2;

    public Calculator(double value1, double value2){
        this.value1 = value1;
        this.value2 = value2;
    }

    public double sumAdd(){
        return value1 + value2;
    }

    public double sumSubtract(){
        return value1 - value2;
    }

    public double sumMultiply(){
        return value1 * value2;
    }

    public double sumDivide(){
        return value1 / value2;
    }
}
