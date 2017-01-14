package ploy;

/**
 * Created by Administrator on 2017/1/13.
 */
class Animal {
    private String name;
    private int age;
    public Animal(String name, int age){
        this.name = name;
        this.age = age;
    }
    //这是一个通用的方法，通用的方法实现没有太大的意义
    //只是告诉其子类去实现它
    public void eat(){
    }
}
