package inherit.person;

/**
 * Created by Administrator on 2017/1/13.
 */
class Person {
    private String name;
    private int age;
    public Person(String name,int age){
        this.name = name;
        this.age = age;
    }
    public void eat(){
        System.out.println("I'm eating");
    }
    public void walk(){
        System.out.println("I'm walking");
    }
    public String toString(){
        return "姓名："+name+"\n年龄："+age;
    }
}
