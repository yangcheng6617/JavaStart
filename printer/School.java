package printer;

/**
 * Created by Administrator on 2017/1/13.
 */
class School {
    private Printer p;
    public void setPrinter(Printer p){
        this.p = p;
    }
    public void print(String content){
        p.print(content);
    }



}
