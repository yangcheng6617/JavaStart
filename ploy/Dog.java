package ploy;

/**
 * Created by Administrator on 2017/1/13.
 */
class Dog extends Animal {
    public Dog(String name,int age){
        super(name,age);
    }
    //对父类的方法重写
    public void eat(){
        System.out.println("啃骨头");
    }
    public void sleep(){
        System.out.println("睡觉");
    }
}
