package method;

/**
 * Created by Administrator on 2017/1/11.
 */
public class AddSub {
    double a;
    double b;

    public void setA(double a){
        this.a = a;
    }
    public void setB(double b){
        this.b = b;
    }
    public double sum() {
        double resultsum = a + b;
        return resultsum;
    }

    public double add() {
        double resultadd = a - b;
        return resultadd;
    }

    public double mul() {
        double resultmul = a * b;
        return resultmul;
    }

    public double div() {
        double resultdiv = a / b;
        return resultdiv;
    }
}
