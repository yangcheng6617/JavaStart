package array;
import java.util.Scanner;
import java.util.Arrays;
import java.util.Timer;

/**
 * Created by Administrator on 2017/1/11.
 */
public class arrayDemo2 {
    public static void main(String []args) {
        //调用timer类来计算程序运行的时间
        timer.Timer timer = new timer.Timer();
        timer.click();
       int []score = new int[5];
        Scanner iniput = new Scanner(System.in);
        for (int i = 0;i < score.length;i ++) {
            System.out.print("请给数组赋值：");
            score[i] = iniput.nextInt();
        }
        Arrays.sort(score);
        for (int i = 0;i < score.length;i ++){
            System.out.println("数组中第"+i+"下标位置的值为："+score[i]);
        }
        //使用foreach语句输出
        System.out.println("使用foreach语句输出");
        for (int sco:score){
            System.out.print(sco+" ");
        }
        timer.print();
    }
}
