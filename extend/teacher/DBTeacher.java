package extend.teacher;

/**
 * Created by Administrator on 2017/1/13.
 */
public class DBTeacher extends Teacher {
    public DBTeacher(String name,String school){
        super(name,school);
    }
    public void teaching(){
        super.teaching();//调用父类的teacher方法
        System.out.println("打开Oracle");
        System.out.println("书写pl-sql指令");
    }
}
