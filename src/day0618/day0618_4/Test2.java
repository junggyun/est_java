package day0618.day0618_4;

import java.util.ArrayList;
import java.util.List;

public class Test2 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Java");
        list.add("Spring");
        list.add("Servlet/JSP");
        list.add("DBMS");
        list.add("JPA");

        System.out.println("총 객체수 : " + list.size());
        System.out.println("두번째 인덱스 : " + list.get(2));
        System.out.println("Java 포함 여부 : " + list.contains("Java"));

        List<String> list2 = new ArrayList<>();
        list2.add(null);
        System.out.println(list2.get(0));
        System.out.println(list2.isEmpty());
        list2.clear();
        System.out.println(list2.isEmpty());
    }
}
