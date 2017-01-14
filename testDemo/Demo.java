package testDemo;

/**
 * Created by Administrator on 2017/1/12.
 */
public class Demo {
        public static void main(String[] args){
            /*A a = new A();
            B b = new B(a);*/
            B b = new B(new A());
        }
    }
    class A {
        public A(){
            new B(this).print();  // 匿名对象
        }
        public void print(){
            System.out.println("Hello from A!");
        }
    }
    class B{
        A a;
        public B(A a){
            this.a = a;
        }
        public void print() {
            a.print();
            System.out.println("Hello from B!");
        }
    }

