package day0618.day0618_4;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Test3 {
    public static void main(String[] args) {
        List<String> arrayList = new ArrayList<>();
        List<String> linkedList = new LinkedList<>();

        long startTime, endTime;
        startTime = System.nanoTime();
        for (int i = 0; i < 10000; i++) {
            arrayList.add(String.valueOf(i));
        }
        endTime = System.nanoTime();
        System.out.println((double) (endTime - startTime) / 1000000000);

        startTime = System.nanoTime();
        for (int i = 0; i < 10000; i++) {
            linkedList.add(String.valueOf(i));
        }
        endTime = System.nanoTime();
        System.out.println((double) (endTime - startTime) / 1000000000);
    }
}
