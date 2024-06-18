package day0617.day0617_6;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        Box<String> boxString = new Box<>();
        boxString.set("아무개");
        System.out.println(boxString.get());

        Box<Integer> boxInteger = new Box<>();
        boxInteger.set(123);
        System.out.println(boxInteger.get());

    }


}
