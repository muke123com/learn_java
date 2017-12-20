package learn;

import java.util.*;

/**
 * Created by Administrator on 2017/12/20.
 */
public class ListDemo {
    public static void main(String[] args) {
        //ArrayList
        List<String> lists = new ArrayList<String>();
        lists.add("aaa");
        lists.add("bbb");
        lists.add("bbb");
        for (String item:lists) {
            System.out.println(item);
        }
        System.out.println(lists.size());
        System.out.println("------------");
        lists.remove(2);
        for (String item:lists) {
            System.out.println(item);
        }
        System.out.println(lists.size());
        System.out.println(lists.indexOf("aaa"));

        //Set HashSet 去重
        Set<String> sh = new HashSet<String>();
        sh.add("A");
        sh.add("A");
        sh.add("B");

        System.out.println(sh);

        //Set TreeSet 排序去重
        Set<String> st = new TreeSet<String>();
        st.add("A");
        st.add("A");
        st.add("C");
        st.add("D");
        st.add("B");
        st.add("F");
        st.add("E");

        System.out.println(st);

        //Map
        Map<String, String> map = new HashMap<String, String>();
        map.put("key1", "abc11111");
        map.put("key2", "abc22222");
        map.put("key3", "abc33333");
        map.put("key4", "abc44444");
        map.put("key1", "abc55555");
        String str = map.get("key2");
        System.out.println(map.values());

    }
}
