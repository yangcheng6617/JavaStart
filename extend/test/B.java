package extend.test;

/**
 * Created by Administrator on 2017/1/13.
 */
public class B extends A{
        public B(){
            //super();//调用父类无参的构造方法，可以省略不写
            System.out.println("B的构造方法");
        }
        public void showB() {
            System.out.println("B");
            showA();//当父类和子类方法名不冲突的时候，可以省略super
            super.showB();//调用父类中的showB方法
        }
    }


