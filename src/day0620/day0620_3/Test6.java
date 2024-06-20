package day0620.day0620_3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.BiConsumer;

public class Test6 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 4));
        list.stream().filter(i -> i % 2 == 0).forEach(System.out::println);
    }
}
