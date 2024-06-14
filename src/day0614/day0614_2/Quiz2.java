package day0614.day0614_2;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Quiz2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("배열의 크기: ");
            int arrSize = sc.nextInt();
            sc.nextLine();
            int[] result = new int[arrSize];

            System.out.println("배열의 요소: ");
            for (int i = 0; i < result.length; i++) {
                int arrElement = sc.nextInt();
                sc.nextLine();
                result[i] = arrElement;
            }

            System.out.print("배열의 인덱스: ");
            int arrIndex = sc.nextInt();
            System.out.println(result[arrIndex]);

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("배열의 크기를 벗어났습니다.");
        } catch (InputMismatchException e) {
            System.out.println("정수만 입력해주세요.");
        } finally {
            sc.close();
        }
    }
}
