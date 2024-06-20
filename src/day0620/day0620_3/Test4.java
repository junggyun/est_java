package day0620.day0620_3;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Test4 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        List<Integer> answer1 = numbers.stream().filter(i -> i % 2 != 0).collect(Collectors.toList());
        System.out.println(answer1);

        List<String> words = Arrays.asList("Java", "Stream", "API", "Example");
        List<Integer> answer2 = words.stream().map(String::length).collect(Collectors.toList());
        System.out.println(answer2);

        String sentence = "Java Stream API Example";
        long count = Arrays.stream(sentence.split(" ")).count();
        System.out.println(count);
    }
}
