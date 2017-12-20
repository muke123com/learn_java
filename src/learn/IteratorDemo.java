package learn;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by Administrator on 2017/12/20.
 */
public class IteratorDemo {
    public static void main(String[] args) {
        List<String> lists = new ArrayList<String>();
        lists.add("A");
        lists.add("B");
        lists.add("C");
        lists.add("E");
        lists.add("D");
        lists.add("F");

        Iterator<String>  iter = lists.iterator();
        while (iter.hasNext()){
            String str = iter.next();
            if("A".equals(str)){
                iter.remove();
            }else{
                System.out.println(str);
            }
        }
    }
}
