package extend.test;

/**
 * Created by Administrator on 2017/1/13.
 */
public class TestDemo {
    public static void main(String []args){
    long clickTime;//当前打点
    clickTime = System.currentTimeMillis();
    B b = new B();
        b.showB();
    long t = System.currentTimeMillis();//最终打点
    long timeDiff = t - clickTime;//计算时间
        System.out.println("时间消耗：" + timeDiff+"ms");
}
}
