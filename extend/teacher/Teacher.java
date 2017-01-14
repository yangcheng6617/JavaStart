package extend.teacher;

/**
 * Created by Administrator on 2017/1/13.
 */
public class Teacher {
    private String name;
    private String school;
    public Teacher(String name, String school){
        this.name = name;
        this.school = school;
    }
    public void teaching(){
        System.out.println("授课前准备");
    }

}
