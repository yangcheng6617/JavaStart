package printer;

/**
 * Created by Administrator on 2017/1/13.
 */
class BlackPrinter extends Printer{
    public BlackPrinter(String brand){
        super(brand);
    }
    public void print(String content){
        System.out.println(getBrand()+"黑白打印"+content);
    }
}
