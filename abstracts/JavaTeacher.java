package abstracts;

/**
 * Created by Administrator on 2017/1/14.
 */
//如果一个类继承了抽象类，那要么实现抽象类的抽象方法，要么继续抽象下去
class JavaTeacher extends Employee {
    public JavaTeacher(int number,String name,double salary){
        super(number,name,salary);
    }
    public void work(){
        System.out.println("JavaTeacher上Java课");
    }
}
