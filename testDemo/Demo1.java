package testDemo;

/**
 * Created by Administrator on 2017/1/12.
 */
public class Demo1 {
    public static void main(String[] args) {
        String str[] = {"123", "123abc", "abc123", "abcxyz"};

        for(String str1 : str){
            try{
                int m = Integer.parseInt(str1, 10);
                System.out.println(str1 + " 可以转换为整数 " + m);
            }catch(Exception e){
                //e.toString()：  获得异常种类和错误信息
                //e.getMessage():获得错误信息
                //e.printStackTrace()：在控制台打印出异常种类，错误信息和出错位置等

                System.out.println(e.toString());
                System.out.println(e.getMessage());
                System.out.println(str1 + " 无法转换为整数");
            }
        }
    }
}
