package abstracts;

/**
 * Created by Administrator on 2017/1/14.
 */
public class EmployeeDemo {
    public static void main(String []args){
        Employee javaTeacher = new JavaTeacher(1,"张三",2000);
        javaTeacher.work();
        Employee leader = new Leader(2,"李四",3000,1000);
        leader.work();

    }
}
