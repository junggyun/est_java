package day0614.day0614_1;

import java.util.Scanner;

public class Test2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            int i = sc.nextInt();
            int result = i / 0;
            System.out.println(result);
        } catch (NullPointerException e) {
            System.out.println("0으로 나눌 수 없습니다.");
        } finally {
            sc.close();
        }
    }
}
