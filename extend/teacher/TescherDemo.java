package extend.teacher;

import extend.teacher.DBTeacher;
import extend.teacher.JavaTeacher;

/**
 * Created by Administrator on 2017/1/13.
 */
public class TescherDemo {
    public static void main(String []args){
        JavaTeacher jTeacher = new JavaTeacher("张三","海同科技");
        jTeacher.teaching();

        DBTeacher dTeacher = new DBTeacher("李四","海同科技");
        dTeacher.teaching();

    }
}

