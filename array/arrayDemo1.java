package array;
import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by Administrator on 2017/1/11.
 */
public class arrayDemo1 {
    public static void main(String []args){
        int []number1 = new int[5];
        Scanner input = new Scanner(System.in);
        for (int i = 0;i<number1.length;i++){
        System.out.print("给数组的第"+i+"位赋值：");
        number1[i] = input.nextInt();
        }
        Arrays.sort(number1);
        for (int i = 0;i<number1.length;i++){
            System.out.println("数组中下标为"+i+"的值是："+number1[i]);
        }

        System.out.println(Arrays.toString(number1));
    }
}
