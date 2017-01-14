package abstracts;

/**
 * Created by Administrator on 2017/1/14.
 */
public class Leader extends Employee {
    private double allowance;
    public Leader(int number,String name,double salary,double allowance){
        super(number,name,salary);
        this.allowance = allowance;
    }
    public void work(){
        System.out.println("Leader培训新员工");
        System.out.println("Leader设计课程体系");
    }
}
