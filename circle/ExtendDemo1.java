package circle;

/**
 * Created by Administrator on 2017/1/12.
 */
public class ExtendDemo1 extends extendDemo{

    @Override//提示标签
    public void show(String name) {//重载方法，两个参数啊顺序不同
        System.out.print("welcome"+" "+name+" 覆盖 ");
    }


}
