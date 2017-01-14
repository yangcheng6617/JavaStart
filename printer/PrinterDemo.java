package printer;

/**
 * Created by Administrator on 2017/1/13.
 */
public class PrinterDemo {
    public static void main(String []args){
        ColorPrinter cp = new ColorPrinter("惠普");
        BlackPrinter bp = new BlackPrinter("戴尔");
        School school = new School();
        school.setPrinter(cp);
        school.print("hello,java");
        school.setPrinter(bp);
        school.print("hello,java");
    }
}
