package abstracts;

/**
 * Created by Administrator on 2017/1/14.
 */
//抽象类
//抽象类是不能实例化的
//可以（没）有抽象方法，也可以（没）有实现方法
abstract class Employee {
    private int number;
    private String name;
    private double salary;
    public Employee(int number,String name,double salary){
        this.number = number;
        this.name = name;
        this.salary = salary;
    }
    //抽象方法
    public abstract void work();
}
