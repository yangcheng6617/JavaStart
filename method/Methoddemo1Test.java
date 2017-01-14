package method;

/**
 * Created by Administrator on 2017/1/11.
 */
public class Methoddemo1Test {
    public static void main(String []args){
        MethodDemo1 p = new MethodDemo1();
        p.mother1();
        System.out.println(p.mother2());
        p.mother3("jakes");
        System.out.println(p.mother4(18));


        /*AddSub t = new AddSub();
        t.setA(1.0);
        t.setB(2.0);
        System.out.println(t.sum());
        System.out.println(t.add());
        System.out.println(t.mul());
        System.out.println(t.div());*/

        Accumulator o = new Accumulator();
        System.out.print(o.setA(1)+" ");
        System.out.print(o.setA(1)+" ");
        System.out.print(o.setA(1)+" ");


    }
}
