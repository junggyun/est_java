package day0620.day0620_3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));

        for (int i = 0; i < numbers.size(); i++) {
            if (numbers.get(i) % 2 == 0) numbers.remove(i);
        }
        System.out.println(numbers);

//        Iterator<Integer> iterator = numbers.iterator();
//        while (iterator.hasNext()) {
//            if (iterator.next() % 2 == 0) {
//                iterator.remove();
//            }
//        }
//        System.out.println(numbers);
    }


}
