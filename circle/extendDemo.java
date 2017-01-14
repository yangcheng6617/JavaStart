package circle;

/**
 * Created by Administrator on 2017/1/12.
 */
public class extendDemo {
    public void show() {//无参的方法
        System.out.println("welcome");
    }

    public void show(String name) {//重载方法，一个字符串参数
        System.out.println("welcome"+" "+name);
    }

    public void show(String name, int age) {//重载方法，两个参数
        System.out.print("welcome"+" "+name+" ");
        System.out.println("age："+" "+age);
    }

}
