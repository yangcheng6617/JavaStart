package timer;

/**
 * Created by Administrator on 2017/1/11.
 */
public class Timer {
    long clickTime;
    public void click(){
        clickTime = System.currentTimeMillis();//当前打点
    }
   public void print(){
        long t = System.currentTimeMillis();//最终打点
        long timeDiff = t - clickTime;
        System.out.println("时间消耗：" + timeDiff);
   }

}

