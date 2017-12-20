package learn;

/**
 * Created by Administrator on 2017/12/20.
 */
public abstract class AbsClass {
    private String fname = "absname";

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public abstract String say();
}
