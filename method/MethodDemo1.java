package method;

/**
 * Created by Administrator on 2017/1/11.
 */
public class MethodDemo1 {
    public void mother1(){
        System.out.println("这是一个无参无返回值的方法");
    }
    public String mother2(){
        return "这是一个无参带返回值的方法，返回类型为String";
    }
    public void mother3(String name){
        System.out.println("这是一个带参无返回值的方法，参数是："+name);
    }
    public String mother4(int age){
        return "这是一个带参带返回值得方法，参数是："+age+"，且返回类型为string";
    }
}
