package inherit.person;

/**
 * Created by Administrator on 2017/1/13.
 */
class Student extends Person{
    private int score;
    public Student(String name,int age,int score){
        super(name,age);
        this.score = score;
    }
    public String toString(){
        return super.toString()+"\n成绩：";
    }
    public void goSchool(){
        System.out.println("I'm going to school");
    }
    public void exam(){
        System.out.println("I'm taking a exam");
    }
}
