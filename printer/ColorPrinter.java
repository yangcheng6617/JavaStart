package printer;

/**
 * Created by Administrator on 2017/1/13.
 */
class ColorPrinter extends Printer{
    public ColorPrinter(String brand){
        super(brand);
    }
    public void print(String content){
        System.out.println(getBrand()+"彩色打印"+content);
    }
}
