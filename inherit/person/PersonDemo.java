package inherit.person;

/**
 * Created by Administrator on 2017/1/13.
 */
public class PersonDemo {
    public static void main(String []args){
        Student stu = new Student("jack",18,90);
        stu.eat();
        stu.walk();
        stu.goSchool();
        stu.exam();
        System.out.println(stu/*toString()*/);//默认运行toString方法
    }
}
