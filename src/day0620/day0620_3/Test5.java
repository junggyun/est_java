package day0620.day0620_3;

import java.util.Arrays;
import java.util.List;

public class Test5 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        numbers.stream().filter(i -> i % 2 != 0).forEach(System.out::println);

        List<String> words = Arrays.asList("Java", "Stream", "API", "Example");

        words.stream().filter(s -> s.length() <= 5).forEach(System.out::println);
    }
}
