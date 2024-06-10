package day0604;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;

public class Day0604_2 {
    public static void main(String[] args) {

//        for (int i = 1; i <= 5; i++) {
//            System.out.println("i = " + i);
//        }

//        int sum = 0;
//        for (int i = 1; i <= 100; i++) {
//            if (i % 2 == 0) {
//                sum += i;
//            }
//        }
//        System.out.println(sum);
//
//        int sum2 = IntStream.rangeClosed(1, 100).filter(num -> num % 2 == 0).sum();
//        System.out.println(sum2);

//        int n = 20;
//        int sum = 0;
//        for (int i = 1; i <= n; i++) {
//            sum = (i % 3 == 0 && i % 5 == 0) ? sum + i : sum;
//        }
//        System.out.println(sum);
//
//        int sum2 = IntStream.rangeClosed(1, n).filter(num -> num % 3 == 0 && num % 5 == 0).sum();
//        System.out.println(sum2);

//        int first = 1;
//        int second = 1;
//        int oldFirst = 1;
//        for (int i = 0; i < 10; i++) {
//            System.out.println(first);
//            first = second;
//            second = oldFirst + second;
//            oldFirst = first;
//        }

//        int[] arr = new int[10];
//        arr[0] = 1;
//        arr[1] = 1;
//        for (int i = 2; i < arr.length; i++) {
//            arr[i] = arr[i-2] + arr[i-1];
//        }
//        for (int num : arr) {
//            System.out.println(num);
//        }

//        for (int i = 0; i >= -100; i--) {
//            if (i % 2 == 0) {
//                System.out.println(i);
//            }
//        }

//        IntStream.rangeClosed(-100, 0).filter(num -> num % 2 == 0)
//                .forEach(n -> System.out.println(n));

//        int[] arr = new int[100];
//        arr[0] = 1;
//        arr[1] = 1;
//        for (int i = 2; i < arr.length; i++) {
//            arr[i] = arr[i - 2] + arr[i - 1];
//        }
//        for (int num : arr) {
//            System.out.println(num);
//        }

//        int[] arr = new int[100];
//        arr[0] = 1;
//        arr[1] = 1;
//        Arrays.setAll(arr, i -> (i < 2) ? 1 : arr[i - 1] + arr[i - 2]);
//        for (int num : arr) {
//            System.out.println(num);
//        }

//        for (int i = 1; i <= 9; i++) {
//            System.out.println(2 + " * " + i + " = " + i*2);
//        }

//        for (int i = 2; i <= 9; i++) {
//            for (int j = 1; j <= 9; j++) {
//                System.out.println(i + " * " + j + " = " + i*j);
//            }
//        }

//        for (int i = 19; i > 0; i--) {
//            System.out.println("19 * " + i + " = " + 19*i);
//        }

//        int number = 0;
//        while (number < 10) {
//            System.out.println(number);
//            if (number == 5) {
//                System.out.println("현재 숫자 5");
//                break;
//            }
//            number ++;
//        }

//        for (int i = 0; i < 10; i++) {
//            System.out.println("현재 i = " + i);
//            for (int j = 0; j < 10; j++) {
//                System.out.println("현재 j = " + j);
//                if (j == 5) {
//                    break;
//                }
//            }
//        }

//        for (int i = 1; i <= 100; i++) {
//            System.out.println("i = " + i);
//            if (i == 50) break;
//            for (int j = 2; j <= 100; j++) {
//                System.out.println("j = " + j);
//                if (j == 80) break;
//            }
//        }

//        int number = 0;
//
//        while (number < 10) {
//            number++;
//            if (number == 3) continue;
//            System.out.println("현재 값은 :" + number);
//
//        }

//        for (int i = 0; i < 10; i++) {
//            if (i == 3) continue;
//            System.out.println("현재 값은 :" + i);
//        }

//        for (int i = 1; i <= 10; i++) {
//            if (i == 4 || i == 7) continue;
//            System.out.println(i);
//        }

//        int[] scores = {55, 64, 92, 100, 85, 75};
//        int sum = 0;
//        double avg;
//        for (int score : scores) {
//            sum += score;
//        }
//        avg = (double) sum / scores.length;
//
//        System.out.println("총합 : " + sum);
//        System.out.println("평균 : " + avg);

//        int[] scores = {55, 64, 92, 100, 85, 75};
//        int sum = IntStream.of(scores).sum();
//        double avg = (double) IntStream.of(scores).sum() / scores.length;
//
//        System.out.println("총합 : " + sum);
//        System.out.println("평균 : " + avg);

//        String[] names = {"okay2", "asbds", "good2", "ormiiiii", "abcde"};
//        for (String name : names) {
//            if (name.length() >= 5) {
//                System.out.println(name);
//            }
//        }

//        int count = 1;
//
//        while (count != 10000) {
//            System.out.println(count);
//            count++;
//        }

//        for (int i = 9; i >= 2; i--) {
//            for (int j = 1; j <= 9; j++) {
//                System.out.println(i + " * " + j + " = " + i*j);
//            }
//        }

        int count = 1;

        while (count >= 1) {
            if (count == 3 || count == 5) {
                count++;
                continue;
            }
            if (count == 8) break;
            System.out.println(count);
            count++;
        }
    }
}
