package extend.teacher;

/**
 * Created by Administrator on 2017/1/13.
 */
public class JavaTeacher extends Teacher {
    public JavaTeacher(String name,String school){
        super(name,school);
    }
    public void teaching(){
        super.teaching();//调用父类的teacher方法
        System.out.println("打开IDEA");
        System.out.println("书写java代码");
    }

}
