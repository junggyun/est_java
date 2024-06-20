package day0620.day0620_3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Test3 {
    public static void main(String[] args) {
        List<Integer> numberList = new ArrayList<>(Arrays.asList(1,2,3,4));
        Integer sum = numberList.stream().filter(i -> i % 2 == 0).map(i -> i * 2).mapToInt(Integer::intValue).sum();
        System.out.println(sum);
    }
}
