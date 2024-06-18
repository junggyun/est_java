package day0618.day0618_4;

import java.util.*;

public class Test {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("홍길동");
        list.add("홍길동2");
        list.add("홍길동3");
        list.add("홍길동4");


        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
        list.set(0, "홍길동0");
        for (String str : list) {
            System.out.println(str);
        }
    }
}
