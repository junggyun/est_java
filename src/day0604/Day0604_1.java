package day0604;

public class Day0604_1 {
    public static void main(String[] args) {
//        int i = 1;
//        while (i <= 5) {
//            System.out.println("i = " + i);
//            i++;
//        }

//        int i = 10;
//        while (i >= 0) {
//            System.out.println("현재 카운트 : " + i);
//            i--;
//        }
//        System.out.println("카운트 종료");

//        int n = 100;
//        int sum = 0;
//        while (n >= 1) {
//            sum += n;
//            n--;
//        }
//        System.out.println(sum);

//        int[] numbers = {5, 2, 9, 1, 7, 4, 6, 3, 8};
//        int count = 0;
//        int sum = 0;
//        int avg = 0;
//        while (count < numbers.length) {
//            sum += numbers[count];
//            count++;
//        }
//        avg = sum / numbers.length;
//        System.out.println(avg);
//        int i = 0;
//        while (i <= 300) {
//            if (i % 3 == 0) {
//                System.out.println(i);
//            }
//            i++;
//        }

//        int[] numbers = {10, 5, 8, 20, 3, 15, 9, 2};
//        int count = 0;
//        int max = 0;
//        while (count < numbers.length) {
//            if (max < numbers[count]) {
//                max = numbers[count];
//            }
//            count++;
//        }
//        System.out.println("가장 큰 값 : " + max);

        int[] numbers = {4, -2, 9, -7, 5, 1, -3, 6, -1, 8};
        int count = 0;
        int sumPositive = 0;
        int sumNegative = 0;
        while (count < numbers.length) {
            if (numbers[count] < 0) {
                sumNegative += numbers[count];
            } else {
                sumPositive += numbers[count];
            }
            count++;
        }
        System.out.println("양수의 합 : " + sumPositive);
        System.out.println("음수의 합 : " + sumNegative);

    }
}
