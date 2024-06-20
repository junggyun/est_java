package day0620.day0620_3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Test2 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));

        Stream<Integer> listStream = list.stream();

        int[] array = {1, 2, 3, 4, 5};
        IntStream arrayStream = Arrays.stream(array);

        Stream<Integer> stream = Stream.of(1, 2, 3, 4, 5);
    }
}
