package ploy;

/**
 * Created by Administrator on 2017/1/13.
 */
class Cat extends Animal {
    public Cat(String name,int age){
        super(name,age);
    }
    //对父类的方法重写
    public void eat(){
        System.out.println("吃鱼");
    }
    public void sleep(){
        System.out.println("睡觉");
    }
}
