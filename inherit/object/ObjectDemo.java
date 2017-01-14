package inherit.object;

/**
 * Created by Administrator on 2017/1/13.
 */
public class ObjectDemo {
    public static void main(String []args){
        Student stu1 = new Student("jack",18);
        System.out.println(stu1.toString());
        Student stu2 = new Student("jack",18);
        System.out.println(stu1.equals(stu2));
    }
}
