package inherit.getset;

/**
 * Created by Administrator on 2017/1/13.
 */
public class A {
    public static void main(String []args){
        B b = new B();
        b.setName("jack");
        b.setAge(18);
        System.out.println(b.getName());
        System.out.println(b.getAge());
    }
}
