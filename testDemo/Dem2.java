package testDemo;

/**
 * Created by Administrator on 2017/1/12.
 */
public class Dem2 {
    public static void main(String[] args) {
        int m = 500;
        //把m装进obj箱子里称为装箱
        //再把obj箱子里的东西放到n里称为拆箱

        //Integer obj = new Integer(m);  // 手动装箱
        //int n = obj.intValue();  // 手动拆箱

        Integer obj = m;  // 自动装箱
        int n = obj;  // 自动拆箱
        System.out.println("n = " + n);

        Integer obj1 = 500;
        System.out.println("obj 等价于 obj1？" + obj.equals(obj1));
    }
}
