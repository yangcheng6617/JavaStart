package template;

/**
 * Created by Administrator on 2017/1/14.
 */
abstract  class Teacher {
    //老师工作的流程
    public void prepared(){
        System.out.println("准备白板笔");
        System.out.println("打开投影仪");
    }
    public void end(){
        System.out.println("装好白板笔");
        System.out.println("关闭投影仪");
    }
    public abstract void teaching();
    //模板方法
    public void work(){
        //1授课前准备
        prepared();
        //进行授课
        teaching();
        //授课结束
        end();
    }
}
