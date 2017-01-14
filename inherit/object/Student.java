package inherit.object;

/**
 * Created by Administrator on 2017/1/13.
 */

//默认继承Object类
class Student /*extends Object*/ {
    private String name;
    private int age;
    public Student(String name,int age){
        this.name = name ;
        this.age = age;
    }
    //修改toString方法
    public String toString(){
        return "姓名："+name+"\n"+"年龄："+age;
    }
}
