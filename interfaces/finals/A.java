package interfaces.finals;

/**
 * Created by Administrator on 2017/1/13.
 */

//final修饰的类不能被继承（常量类）
/*final*/ class A {
    public final int number1 = 1;//加final就成了常量
    public int number2 = 2;
    public void showNum1(){
        //number1++;//不能修改常量
        System.out.println(number1);
    }
    //子类不能对父类中的常量方法进行覆盖
    public /*final*/ void showNum2(){
        System.out.println(number2);
    }
}
