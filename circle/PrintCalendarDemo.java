package circle;
import java.util.Scanner;
/**
 * Created by Administrator on 2017/1/12.
 */
public class PrintCalendarDemo {
    public static void main(String[] args) {
        int year;
        int month;
        boolean isRn;
        int days = 0;
        System.out.println("******使用万年历******");
        Scanner input = new Scanner(System.in);
        System.out.print("请输入年份：");
        year = input.nextInt();
        System.out.print("请输入月份：");
        month = input.nextInt();
        if ((year % 400 == 0) && (year % 4 == 0 || year % 100 != 0)) {
            isRn = true;
        } else {
            isRn = false;
        }
        if (isRn) {
            System.out.println(year + "是闰年");
        } else {
            System.out.println(year + "不是闰年");
        }
        switch (month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                days = 31;
                break;
            case 2:
                if (isRn) {
                    days = 29;
                } else {
                    days = 28;
                }
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                days = 30;
                break;
            default:
                System.out.println("输入月份有误");
        }
        System.out.println("本月天数有"+days+"天");
        }
    }
