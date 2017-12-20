package learn;

/**
 * Created by Administrator on 2017/12/20.
 */
public class People extends AbsClass implements InterClass{
    final public static String pname = "abc";

    @Override
    public String say() {
        return this.getFname();
    }

    @Override
    public void tell() {
        System.out.println("p__tell");
    }
}
