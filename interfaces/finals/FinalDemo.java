package interfaces.finals;

/**
 * Created by Administrator on 2017/1/13.
 */
public class FinalDemo {
    public static void main(String []args){
        A a = new A();
        a.showNum1();

        B b = new B();
        b.showNum2();

        final A a2 = new A();
        //a2 = new A();//报错，final用在引用变量上，代表此引用变量只能引用最开始所引用的对象，中途不能改变指向
        a2.number2 = 5;
        a2.showNum2();
    }
}
