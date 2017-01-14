package ploy;

/**
 * Created by Administrator on 2017/1/13.
 */
public class AnimalDemo {
    public static void main(String []args){
        //父类的引用变量可以引用其子类的对象
        Animal animal1 = new Dog("小狗",2);//向上转型
        //向上转型首先是安全的，但可能会导致其子类的方法丢失
        //父类的引用变量只能调用父类中有的方法或子类重写父类的方法
        animal1.eat();
        //animal1.sleep();
        Animal animal2 = new Cat("小猫",1);//向上转型
        animal2.eat();

        //向下转型是不安全的
        /*if (animal1 instanceof Cat) {
            System.out.println("aa");
            Cat cat = (Cat) animal1;
        }*/
        if (animal2 instanceof Cat) {
            System.out.println("aa");
            Cat cat = (Cat) animal2;
            cat.sleep();
        }
    }
}
